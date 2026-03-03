public class ConstructorinJava {

    ConstructorinJava(){
        System.out.println("Constructorin Java");
    }
    public static void main(String[] args) {
        ConstructorinJava s1=new ConstructorinJava();  // constructor executes

    }
}



/*  ✅ 1️⃣ What is Constructor in Java?



📌 Definition:

A constructor is a special method that is used to initialize objects.

👉 It is automatically called when an object is created.




📌 Syntax:
class ClassName {
    ClassName() {
        // constructor body
    }




    ✅ 2️⃣ Rules of Constructor

Constructor name must be same as class name.

Constructor has no return type (not even void).

It runs automatically when object is created.

Constructor cannot be static, abstract, or final.




✅ 3️⃣ Types of Constructor

There are mainly 3 types:

Default Constructor

Parameterized Constructor

Copy Constructor (user-defined concept)
}*/