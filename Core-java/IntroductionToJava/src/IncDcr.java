public class IncDcr {
    public void main(String args[]){
        /*
         Increment and decrement operator (Unary Operator)
         a++  ->post Increment
         a--  ->Pre Increment

         int c=6;
         inc res= c++ + ++c + ++c + c++ + ++c;
         System.out.println(res);
         */
        int c=6;
        int res= c++ + ++c + ++c + c++ + ++c; // 6 + 8 + 9 + 9 + 11 = 43
        System.out.println(res);   // output is :43
    }
}

/* Post -> Firest operation karo then increment karo .

   pre -> First increment karo then operation . */