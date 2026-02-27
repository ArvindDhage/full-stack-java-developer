import java.util.Scanner;

public class BreakStatment {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;    //Jaise hi i == 3 hua, loop turant band ho gaya.
            }
            System.out.println(i);
        }
    }
}
