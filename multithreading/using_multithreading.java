
class Aone extends Thread{
    public void run() {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Hi......");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
    }
}

class Bone extends Thread{
    public void run() {
        int i;
        for (i = 0; i <= 10; i++) {
            System.out.println("Hello......");
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("Error "+e);
            }
        }
    }
}

class Mone {
    public static void main(String[] args) {

        Aone a = new Aone();
        Bone b = new Bone();

        a.start();
        b.start();
    }
}