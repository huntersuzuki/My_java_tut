/*
   
   Literals 

   String variable="Value";
   
   Creating string with new keyword.

   syntax:
   String variablename=new String("value")
 */
class StringNewKeyword {
    public static void main(String[] args) {
        String s1 = "PranayBhoir";
        String s2 = new String("LearningJAVA");
        System.out.println(s1);
        System.out.println(s2);
        String s3 = "PranayBhoir";
        String s4 = new String("LearningJAVA");
    }
}
/*              
                ------------
    s3-------->|            |
    s1-------> |PranayBhoir |
                ------------
                
                 ------------
    s2-------->|   Learning  |
               |   JAVA 1    |
                ------------
    
                ------------
    s4-------->|   Learning  |
               |   JAVA      |
                ------------
If two string objects contains same contents and are created by literals then 
both string object have same reference or same memory location.

If two string objects contains same contents and are created by new keyword, then
both will refere different location even though we had same content in the string 
object.*/