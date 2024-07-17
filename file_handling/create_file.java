
import java.io.File;
class CreateFile {
    public static void main(String[] args) {
        boolean v;
        // File fobj = new File("Myfile.txt");
        // File fobj = new File("Myfile.docx");
        // File fobj = new File("Myfile.xlsx");
        // File fobj = new File("Myfile.pdf");
        File fobj = new File("Myfile.csv");
        try {
            if(fobj.createNewFile()){
                System.out.println("File Create Successfully !!!!!!!!");
            }
            else{
                 System.out.println("File already exists in current location");
            }
        } catch (Exception e) {
           System.out.println("Error"+e);
        }
    }
}
