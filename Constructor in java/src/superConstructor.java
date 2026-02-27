public class superConstructor {

    superConstructor(){
        System.out.println("Parent Constructor");
    }

}
class Child extends superConstructor {

    Child() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new Child();
    }
}





/*✅ 9️⃣ super() Constructor

Used to call parent class constructor.*/