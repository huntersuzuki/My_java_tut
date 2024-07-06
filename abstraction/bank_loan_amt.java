import java.util.Scanner;
abstract class Bank{
    abstract double getInterstRate();
    abstract void totalAmt(double p,double n);
}

class SBI extends Bank{
    double total_amt,r,ip,n;
    double getInterstRate(){
        return 11.2;
    }
    void totalAmt(double p,double n){
        r = getInterstRate();
        ip = (p*n*r)/100;
        total_amt = p+ip;
        System.out.println("SBI BANK");
        System.out.println("Total Amount Payable: "+total_amt);
        System.out.println("Interest Payable: "+ip);
    }
}
class HDFC extends Bank{
    double total_amt,r,ip,n;
    double getInterstRate(){
        return 13.2;
    }
    void totalAmt(double p,double n){
        r = getInterstRate();
        ip = (p*n*r)/100;
        total_amt = p+ip;
        System.out.println("HDFC BANK");
        System.out.println("Total Amount Payable: "+total_amt);
        System.out.println("Interest Payable: "+ip);
    }
}



class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.println("Enter amount");
        a = sc.nextDouble();
        System.out.println("Enter the duration");
        b = sc.nextDouble();

        SBI sbi = new SBI();
        sbi.totalAmt(a,b);
        HDFC hdfc = new HDFC();
        hdfc.totalAmt(a,b);
    }
}
