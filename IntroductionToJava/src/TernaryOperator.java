public class TernaryOperator {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is: " + result); // Output: The number is: Even

    }
}
 /*The Java ternary operator is a shorthand for a simple if-else statement.
 It is the only operator that takes three operands, making code more concise
 for straightforward conditional assignments or returns.
 The basic syntax is:

 variable = (condition) ? value_if_true : value_if_false;

 condition: A boolean expression that evaluates to either true or false.
 value_if_true: The value returned if the condition is true.
 value_if_false: The value returned if the condition is false
 variable = (condition) ? value_if_true : value_if_false;



 */