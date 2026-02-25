/*
factorial of number
 */
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int i=1;
        int fact=1;
        do{
           fact=fact*i;
           i++;
        }while (i<=n);
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
