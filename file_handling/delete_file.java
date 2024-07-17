import java.io.File;
class delete_file {
    public static void main(String[] args) {
        boolean v;
        File fp = new File("Myfile.pdf");
        v = fp.delete();
        if(v){
            System.out.println("File deleted successfully");
        }
        else{
            System.out.println("No such file exist for deletion");
        }
    }
}
