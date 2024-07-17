import java.io.FileReader;
class ReadFile {
    public static void main(String[] args) {
        char arr[] = new char[500];
        try {
            FileReader fp = new FileReader("Myfile.txt");
            fp.read(arr);
            System.out.println("The data in the file is: ");
            System.out.println(arr);
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
    }   
}
