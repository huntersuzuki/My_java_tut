/*
   Continue keyword
   ================
   1) It is a keyword, when encountered/executed/dectected  in a loop,take the loop control
      at the beginning of the loop.
   2) instruction written after continue are skipped for execution for that 
      iteration.
   3) continue keyword is associated with if statement.
 */
class ContinueKeyword {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
/*
 * i i<=10 i==5 print i i++
 * 1 1<=10 T 1==5 F i=1 2
 * 2 2<=10 T 2==5 F i=2 3
 * 3 3<=10 T 3==5 F i=3 4
 * 4 4<=10 T 4==5 F i=4 5
 * 5 5<=10 T 5==5 T - 6
 * 6 6<=10 T 6==5 F i=6 7
 * 7 7<=10 T 7==5 F i=7 8
 * 8 8<=10 T 8==5 F i=8 9
 * 9 9<=10 T 9==5 F i=9 10
 * 10 10<=10 T 10==5 F i=10 11
 * 11 11<=10 F
 */