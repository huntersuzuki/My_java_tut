import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

class Main {
    public static void main(String[] args) {
        int ch,flag=0,sflag=0,i;
        String mob,name,data,newMob,strNew;
        char arr[] = new char[500];
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Create new contact");
            System.out.println("2.Display all contact");
            System.out.println("3.Search mobile number");
            System.out.println("4.Update contact");
            System.out.println("5.Delete contact");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("Create contact \n");
                    System.out.println("\n");
                    System.out.println("Enter Name: ");
                    name = sc.next();
                    sc.nextLine();
                    System.out.println("Enter contact: ");
                    mob = sc.nextLine();
                    data = name+":"+mob+",";
                    try {
                        FileWriter fp = new FileWriter("contact.txt", true);
                        fp.write(data);
                        fp.close();
                        System.out.println("Contact created successfully");
                    } catch (Exception e) {
                        System.out.println("Error"+e);
                    }
                    break;
                case 2:
                    System.out.println("List of all contact");
                    System.out.println("\n");
                    try {
                        FileReader fp = new FileReader("contact.txt");
                        fp.read(arr);
                        System.out.println(arr);
                        System.out.println();
                    } catch (Exception e) {
                        System.out.println("Error" + e);
                    }
                    break;
                case 3:
                    System.out.println("Search contact");
                    System.out.println();
                    System.out.println("Enter mobile number to be searched:");
                    mob = sc.next();
                    try {
                        FileReader fp = new FileReader("contact.txt");
                        fp.read(arr);
                        String str = new String(arr);// character array to string
                        String a[] = str.split(","); // string to array of string by split().
                        fp.close();
                        //System.out.println(a.length);
                        //System.out.println(a[0]);
                        for (i = 0; i < a.length-1; i++){
                           // System.out.println(a[i]);
                            String rec[] = a[i].split(":");
                           // System.out.println(rec[1]);
                             if (mob.equals(rec[1])) {
                                System.out.println("Record Found!!!");
                                System.out.println(a[i]);
                                sflag = 1;
                                break;
                            }

                        }
                        if (sflag == 0) {
                            System.out.println("Record not found,Please Create It!!!");
                        }

                    } catch (Exception e) {
                        System.out.println("Error:" + e);
                    }
                    break;
                case 4:
                    System.out.println("Update contact");
                    System.out.println();
                    System.out.println("Enter old mobile number: ");
                    mob = sc.next();
                    System.out.println("Enter new mobile number");
                    newMob = sc.next();

                    try {
                        FileReader fp = new FileReader("contact.txt");
                        fp.read(arr);
                        String str = new String(arr);// character array to string
                        String a[] = str.split(","); // string to array of string by split().

                        for (i = 0; i < a.length - 1; i++)
                        {
                            String rec[] = a[i].split(":");
                            if (mob.equals(rec[1])) {
                                System.out.println("Before "+a[i]);
                                rec[1] = newMob;
                                strNew = rec[0]+":"+rec[1]+",";
                                a[i] = strNew;
                                System.out.println(a[i]);
                                sflag = 1;
                                break;
                            }

                        }
                        if (sflag == 0) {
                            System.out.println("Record not found,Please Create It!!!");
                        }
                        else{
                            String newData = String.join(",",a);
                            try {
                                FileWriter fpw = new FileWriter("contact.txt");
                                fpw.write(newData);
                                fpw.close();
                                System.out.println("Contact Updated Successfully");
                            } catch (Exception e) {
                                System.out.println("Error "+e);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Error:" + e);
                    }

                    break;
                case 5:
                    System.out.println("Delete contact");
                    System.out.println();
                    System.out.println("Enter Mobile number to be deleted");
                    mob = sc.next();
                    try {
                        FileReader fp = new FileReader("contact.txt");
                        fp.read(arr);
                        String str = new String(arr);// character array to string
                        String a[] = str.split(","); // string to array of string by split().
                        fp.close();
                        // System.out.println(a.length);
                        // System.out.println(a[0]);
                        for (i = 0; i < a.length - 1; i++) {
                            // System.out.println(a[i]);
                            String rec[] = a[i].split(":");
                            // System.out.println(rec[1]);
                            if (mob.equals(rec[1])) {
                                System.out.println("Record Found!!!");
                                a[i] = "";
                                System.out.println(a[i]);
                                sflag = 1;
                                break;
                            }

                        }
                        if (sflag == 0) {
                            System.out.println("Record not found,to be deleted!!!");
                        }
                        else {
                            String newData = String.join("", a);
                            try {
                                FileWriter fpw = new FileWriter("contact.txt");
                                fpw.write(newData);
                                fpw.close();
                                System.out.println("Contact Deleted Successfully");
                            } catch (Exception e) {
                                System.out.println("Error " + e);
                            }
                        }

                    } catch (Exception e) {
                        System.out.println("Error:" + e);
                    }

                    break;
                case 6:
                    System.out.println("Exit :( thanks for using our app");
                    System.out.println();
                    flag=1;
                    break;
                
                default:
                    System.out.println("Enter a Valid choice");
                    System.out.println();
                    break;
            }
            if (flag==1) {
                break;
            }
        }
    }
}
