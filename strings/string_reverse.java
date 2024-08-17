class StringReverse {
    public static void main(String[] args) {

        String name = "My name is Pranay";
        String[] newStr = null;
        newStr = name.split(" ");
        System.out.print(newStr[0]);
        System.out.print(" ");
        for (int i = newStr[1].length() - 1; i >= 0; i--) {
            System.out.print(newStr[1].toString().charAt(i));
        }
        System.out.print(" ");
        System.out.print(newStr[2]);
        System.out.print(" ");
        System.out.print(newStr[3]);
    }
}