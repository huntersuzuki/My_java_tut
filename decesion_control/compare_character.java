class CompareCharacter{
    public static void main(String[] args) {
        char x,y;
        // x = 'a';
        // y = 'a'; // output => true

        // x = 'a';
        // y = 'b'; // output => false
        
        x = 'a';
        y = 'A'; // output => false
        boolean res;
        res = (x==y);
        System.out.println("The result is "+res);
    }
}