class Test {

    private Test() {
        System.out.println("Private Constructor");
    }
}
public class PrivateConstructor {
    public static void main(String[] args) {
        //Test p=new Test();  // ERROR   //java: Test() has private access in Test
    }
}




/*Private Constructor
📌 Used in:

Singleton class

Prevent object creation */
