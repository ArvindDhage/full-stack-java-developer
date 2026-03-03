public class MethodwithReturnType {

    static int accept(int a ,int b){
         return  a=a+b;
    }

    public static void main(String args []){
        int sum=accept(10,20);
        System.out.println(sum);


    }
}


/*
(A) Method with Return Type
➤ Theory:

Returns a value.

Must use return keyword.

Return type can be int, double, String, etc.

➤ Syntax:
returnType methodName(parameters){
    return value;
}
 */