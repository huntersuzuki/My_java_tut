/*
The constructor which takes arguments or receive parameter is called as
Parameterized constructor.
 */
import java.util.*;
class UserData {
    String uName,pass;
    UserData(String userName, String password){
        uName=userName;
        pass=password;
    }

    void displayData(){
        System.out.println("Username: "+uName);
        System.out.println("Password: "+pass);
    }
    public static void main(String[] args) {
        String up,us;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username");
        us=sc.nextLine();
        System.out.println("Enter Password");
        up=sc.nextLine();
        UserData ud = new UserData(us, up);
        ud.displayData();
    }
}
