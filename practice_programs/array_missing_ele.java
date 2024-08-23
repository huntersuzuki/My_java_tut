class ArrayMissingEle {
    public static void main(String[] args) {

        int x[] = { 10, 20, 50, 30, 80, 90 };
        int y[] = { 10, 60, 70, 40, 80, 90 };
        int res = 0, count = 0;
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
