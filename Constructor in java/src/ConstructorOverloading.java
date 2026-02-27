public class ConstructorOverloading {
    ConstructorOverloading(){
        System.out.println(" No Parameters");
    }
    ConstructorOverloading(int a ){
        System.out.println(" one  Parameters"+a);
    }
    ConstructorOverloading(int a,int b ){
        System.out.println(" Two  Parameters" +a+b);
    }

    public static void main(String[]args){
        new ConstructorOverloading();
        new ConstructorOverloading(1);
        new ConstructorOverloading(1,2);
    }
    }


/*
 ✅ 6️⃣ Constructor Overloading
📌 Definition:

Multiple constructors with different parameters in same class.
This is called compile-time polymorphism.
*/