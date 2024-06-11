class StringCopy  {
    public static void main(String[] args) {
        String s1="PranayBhoir",s2="";
        int i;
        for(i=0;i<s1.length();i++){
            s2=s2+s1.charAt(i);
        }
        System.out.println("Original String: "+s1);
        System.out.println("Copied String: "+s2);
    }    
}
