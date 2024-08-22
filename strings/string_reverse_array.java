public class string_reverse_array {
    public static void main(String[] args) {
        String str = "Welcome To Interview";
        String[] newStr = null;
        newStr = str.split(" ");
        int length = newStr.length;
        for (int i = length-1; i >= 0; i--) {
            System.out.print(newStr[i]);
            System.out.print(" ");
        }
    }
}
