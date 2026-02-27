public class CopyConstructor {
    int id;
    String name;
    CopyConstructor(int id, String name){
        this.id = id;
        this.name = name;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor c){
        this.id = c.id;
        this.name =c.name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        CopyConstructor c = new CopyConstructor(101,"Arvind");
        CopyConstructor c1 = new CopyConstructor(c);
        c.display();
        c1.display();
    }
}
