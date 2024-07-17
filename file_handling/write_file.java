import java.util.*;
import java.io.FileWriter;
class WriteFile {
    public static void main(String[] args) {
        String data;
        try {
            FileWriter fp = new FileWriter("Myfile.pdf");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter content to be written in file");
            data = sc.nextLine();
            fp.write(data);
            fp.close();
        } catch (Exception e) {
            System.out.println("Error: "+e);

        }
    }
}

/*
 * 
 * file myfile.txt write_file.java console
 *          fp.write(data) sc.nextLine()
 * <--------------- data <------------------ data entered by user on console
 */