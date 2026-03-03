/*  Logical Operator
-> Logical operators are symbols or keywords (AND, OR, NOT) used in programming and Boolean algebra to evaluate, combine, or invert true/false conditions
&& -> and -> a&b -> if both are true result will be true .
|| -> Or  -> a||b -> if only one true then result will be true .
!  -> true -> false
*/
public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a==b && b!=a);
        System.out.println(a==b || b!=a);
        System.out.println(a!=b);
    }

}
