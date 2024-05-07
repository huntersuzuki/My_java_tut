import java.util.*;

class MenuDriven {
    public static void main(String[] args) {
        int ch, ch1, a, b, c;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose an operation from the Following: ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("ADDITION");
                    System.out.println();
                    System.out.println("Enter First Number");
                    a = sc.nextInt();
                    System.out.println("Enter Second Number");
                    b = sc.nextInt();
                    c = a + b;
                    System.out.println("The Addition is: " + c);
                    break;
                case 2:
                    System.out.println("SUBTRACTION");
                    System.out.println();
                    System.out.println("Enter First Number");
                    a = sc.nextInt();
                    System.out.println("Enter Second Number");
                    b = sc.nextInt();
                    c = a - b;
                    System.out.println("The Subtraction is: " + c);
                    break;
                case 3:
                    System.out.println("MULTIPLICATION");
                    System.out.println();
                    System.out.println("Enter First Number");
                    a = sc.nextInt();
                    System.out.println("Enter Second Number");
                    b = sc.nextInt();
                    c = a * b;
                    System.out.println("The Multiplication is: " + c);
                    break;
                case 4:
                    System.out.println("DIVISION");
                    System.out.println();
                    System.out.println("Enter First Number");
                    a = sc.nextInt();
                    System.out.println("Enter Second Number");
                    b = sc.nextInt();
                    c = a / b;
                    System.out.println("The Division is: " + c);
                    break;
                case 5:
                    System.out.println("MODULUS");
                    System.out.println();
                    System.out.println("Enter First Number");
                    a = sc.nextInt();
                    System.out.println("Enter Second Number");
                    b = sc.nextInt();
                    c = a % b;
                    System.out.println("The Mod is: " + c);
                    break;
                default:
                    System.out.println("Please Enter a valid choice between 1-5");
                    break;
            }
            System.out.println();
            System.out.println("Do you want to continue?");
            System.out.println("Press 1 For YES");
            System.out.println("Press 2 For NO");
            ch1 = sc.nextInt();
        } while (ch1 == 1);

    }
}
