class NestedForLoop {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=2;i++){
            System.out.print(i+"-");
            for(j=1;j<=3;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
