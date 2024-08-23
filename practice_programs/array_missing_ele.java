    import java.util.*;

    class ArrayMissingEle {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int p;
            System.out.println("Set the Array size: ");
            p = sc.nextInt();
            int x[] = new int[p];
            int y[] = new int[p];
            int res = 0, count = 0;
            System.out.println("Enter first array elements: ");
            for (int a = 0; a < x.length; a++) {
                x[a] = sc.nextInt();
            }
            System.out.println("Enter second array elements: ");
            for (int b = 0; b < y.length; b++) {
                y[b] = sc.nextInt();
            }
            for (int i = 0; i <= x.length - 1; i++) {
                for (int j = 0; j <= y.length - 1; j++) {
                    if (x[i] != y[i]) {
                        res = x[i];
                        count++;
                        System.out.println("missing element " + count + " = " + res);
                        break;
                    }
                }
            }
        }
    }
