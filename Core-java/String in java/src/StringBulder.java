/*While StringBuffer is the safe, older brother, StringBuilder is the faster, more
 efficient younger sibling. It was introduced in Java 5 and is now the "go-to" choice
 for string manipulation in 99% of Java applications.

1. The Theory: Why StringBuilder?
The core logic remains the same: it provides a mutable (changeable) sequence of characters.
However, the key difference is synchronization.

Non-Thread Safe: Unlike StringBuffer, StringBuilder does not use synchronization.
                 It doesn't check if multiple threads are trying to access it at the same time.

Maximum Performance: Because it skips those thread-safety checks, it is significantly faster than StringBuffer.

Memory Efficiency: It modifies the existing character array in memory rather than
                   creating new String objects, saving the Garbage Collector a lot of work.


Syntax & Common Methods

The syntax for StringBuilder is identical to StringBuffer.

JavaStringBuilder sb = new StringBuilder("Initial Text");
Key Methods:
           Method                                 Description

        append(data)                Adds any data type (String, int, char) to the end.
        insert(index, data)         Inserts data at the specified position.
        delete(start, end)          Removes characters between the specified indices.
        reverse()                   Reverses the character sequence.
        setCharAt(index, char)      Replaces a single character at a specific spot.
        toString()                  Converts the builder back into a standard String.
*/

//This program demonstrates a typical use case: building a sentence dynamically.
public class StringBulder {
    public static void main(String[] args) {
        // Initialize with a default capacity of 16 + length of "Java"
        StringBuilder sb = new StringBuilder("Java");

        // 1. Append
        sb.append(" is");
        sb.append(" fast");
        System.out.println("Append: " + sb); // Java is fast

        // 2. Insert
        sb.insert(8, " very");
        System.out.println("Insert: " + sb); // Java is very fast

        // 3. Delete
        sb.delete(8, 13); // Removes " very"
        System.out.println("Delete: " + sb); // Java is fast

        // 4. Reverse
        sb.reverse();
        System.out.println("Reverse: " + sb); // tsaf si avaJ

        // 5. Check Capacity
        //  grows automatically as you add more text
        System.out.println("Current Capacity: " + sb.capacity());
    }
}
