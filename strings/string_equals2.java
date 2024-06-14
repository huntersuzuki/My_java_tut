class StringEquality {
    public static void main(String[] args) {
        String s1 = new String("PranayBhoir");
        String s2 = new String("PranayBhoir");
        boolean r1,r2,r3,r4;
        r1=s1.equals(s2);
        r2=s1==s2;
        System.out.println("Equals() " +r1);
        System.out.println("== "+r2);

        String s3="LearningJAVA",s4="LearningJAVA";
        r3 = s3.equals(s4);
        r4 = s3 == s4;
        System.out.println("Equals() " + r3);
        System.out.println("== " + r4);
    }
}
