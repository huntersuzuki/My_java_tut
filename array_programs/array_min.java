 class ArrayMinEle {
    public static void main(String[] args) {
        int x[] = { 34, 656, 3502, 10 }, min;
        min = x[0];
        for (int i : x) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The greatest element is " + min);
    }
}
