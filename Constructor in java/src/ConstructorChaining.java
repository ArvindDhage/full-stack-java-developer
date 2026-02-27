public class ConstructorChaining {
    ConstructorChaining(){
        this(10);
        System.out.println("Default Constructor");
    }
    ConstructorChaining(int a){
        System.out.println("Parameterized Constructor"+a);
    }
    public static void main(String[] args) {
        new ConstructorChaining();
    }
}




/*  ✅ 8️⃣ Constructor Chaining

When one constructor calls another constructor of same class.

Uses this() keyword.


👉 this() must be first statement inside constructor.*/