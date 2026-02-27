public class BasedonParameters4type {
    //(A) No Parameter, No Return
    static void show(){
        System.out.println("Welcome");
    }

    //(B) With Parameter, No Return
    static void square(int n){
        System.out.println("Square = " + (n*n));
    }

    //(C) With Parameter, With Return
    static int multiply(int a, int b){
        return a * b;
    }

    //No Parameter, With Return
    static int getNumber(){
        return 10;
    }
    public static void main(String[]args){

        show();  //(A) No Parameter, No Return

        square(2); //(B) With Parameter, No Return

        multiply(2,3);//(C) With Parameter, With Return

        System.out.println(getNumber());  //No Parameter, With Return



    }
}
