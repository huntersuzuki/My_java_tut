import java.util.Random;
class CaptchaGeneration {
    public static void main(String[] args) {
        String baseStr="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String captcha="";
        int n,i,rIndex;
        Random r = new Random();
        n=baseStr.length();
        for(i=1;i<=5;i++){
            rIndex=r.nextInt(n);
            captcha=captcha+baseStr.charAt(rIndex);
        }
        System.out.println("CAPTCHA: "+captcha);
    }
}
