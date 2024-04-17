/*
Need of break keyword
=====================
If there is requirement to stop the loop even if the condition of loop is True, then
there is  need of break keyword.

What is break?
==============
1) It is keyword that stop the loop even if the condition of loop is True.
2) break keyword is associated with if statement.
*/
class BreakKeyword {
    public static void main(String args[]) {
        int i;
        for (i = 1; i <= 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println("i=" + i);
        }
        System.out.println("Out of loop");
    }
}
/*
 * i i<=10 i==4 print i i++
 * 1 1<=10 T 1==4 F i=1 2
 * 2 2<=10 T 2==4 F i=2 3
 * 3 3<=10 T 3==4 F i=3 4
 * 4 4<=10 T 4==4 T break
 */