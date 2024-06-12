import java.util.Random;
class RandomNumber {
    public static void main(String[] args) {
        int x,n=62;
        Random r = new Random();
        x=r.nextInt(n);
        System.out.println("x="+x);
    }
}
