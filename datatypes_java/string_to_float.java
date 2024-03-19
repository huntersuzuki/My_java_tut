class StringConversionFloat{
    public static void main(String args[]){
        // String to Float conversion.
        float x,div;
        String s = "267.89"; // String value
        System.out.println("Value of string is => "+s);
        x = Float.parseFloat(s); // String converted to float.
        div = x/3; // Division of String value converted to float.
        System.out.println("The converted value is => "+x);
        System.out.println("The division value is => "+div);
    }
}