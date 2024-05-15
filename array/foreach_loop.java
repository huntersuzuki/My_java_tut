class ForEachLoop {
    public static void main(String[] args) {
        // float x[] = { 10, 20, 30, 40, 50 };
        // for(int i:x){ //cannot convert from float to int.
        //     System.out.println("Element: "+i);
        // }
        int x[] = { 10, 20, 30, 40, 50 };
        for(float i:x){ //can convert from int to float.
            System.out.println("Element: "+i);
        }
    }
}
