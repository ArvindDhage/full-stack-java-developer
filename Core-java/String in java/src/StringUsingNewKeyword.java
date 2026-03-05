public class StringUsingNewKeyword {
    public static void main(String[] args) {

        String s1 = new String("Hello");

        System.out.println(s1);
    }
}
/*B. Using the new Keyword
This forces the creation of a new object in the standard Heap memory, even if the value already exists in the pool.

Java
String s2 = new String("Hello");
*/
