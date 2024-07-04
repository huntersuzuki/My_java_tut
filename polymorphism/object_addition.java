class ObjectAddition {
    int a, b;

    ObjectAddition(int x, int y) {
        a = x;
        b = y;
    }

    ObjectAddition addObject(ObjectAddition ob1, ObjectAddition ob2) {
        ObjectAddition oa = new ObjectAddition(0, 0); 
        oa.a = ob1.a + ob2.a;
        oa.b = ob1.b + ob2.b;
        return oa;
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }
}

class MainObjectAddition {
    public static void main(String[] args) {
        ObjectAddition temp = new ObjectAddition(0, 0);
        ObjectAddition o1 = new ObjectAddition(200, 30);
        ObjectAddition o2 = new ObjectAddition(500, 60);
        ObjectAddition o = new ObjectAddition(0, 0);
        
        o = temp.addObject(o1, o2);
        o1.display();
        o2.display();
        o.display();

    }
}
