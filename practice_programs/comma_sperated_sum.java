import java.util.Scanner;

 class CommaSeperatedSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter comma-separated numbers: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        double sum = 0;

        for (String number : numbers) {
            sum =sum+ Double.parseDouble(number.trim());
        }

        System.out.println("Sum: " + sum);
    }
}
