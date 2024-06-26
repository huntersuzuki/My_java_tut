class PrivateAccess {
    private int x;

    void getData() {
        x = 20;
        displayData();
    }

    private void displayData() {
        System.out.println("Value of x in getdata method: " + x);
    }
}

class PrivateAccessMain {
    public static void main(String[] args) {
        PrivateAccess pa = new PrivateAccess();
        pa.getData();
        // pa.displayData();
        // pa.x = 100;
        // System.out.println("The value of x in main method outside it's original class is: " + pa.x);
    }
}