/*4. Comparisons: == vs .equals()
This is a classic interview question and a common source of bugs:

==: Compares the memory address (reference).

.equals(): Compares the actual text (content).
*/

public class Comparisons {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");

        System.out.println(s1 == s2);      // false (different memory locations)
        System.out.println(s1.equals(s2)); // true (same text)
    }
}
