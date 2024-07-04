class ThisKeyword {
    String name;
    void getData(String name){
        this.name=name;
    }
    void display(){
        System.out.println("Name is: "+name);
    }
    public static void main(String[] args) {
        ThisKeyword tk = new ThisKeyword();
        tk.getData("Pranay Bhoir");
        tk.display();
    }
}
