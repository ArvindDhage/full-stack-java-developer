/*   While String is immutable (unchangeable), StringBuffer is its dynamic, "growable" sibling.
 It belongs to the java.lang package and is used when you need to make frequent
 modifications to a sequence of characters without creating a mountain of discarded objects in memory.

 1. The Theory: Why StringBuffer?
 In Java, every time you "change" a String (like str = str + "!"), Java actually creates a
 brand-new object and throws the old one away.
 This is slow and uses a lot of RAM if done inside a loop.

StringBuffer solves this by:Mutability:
It modifies the same memory location instead of creating new objects.

Thread-Safety: All its methods are synchronized. This means if two people (threads) try
 to change the same StringBuffer at the same time, it handles them one by one to prevent
 data corruption.

 Initial Capacity: It starts with a buffer of 16 characters by default. When you exceed this,
  it automatically expands.

 2. Syntax & Common Methods

 To use it, you must instantiate it like a regular object:

 JavaStringBuffer sb = new StringBuffer("Hello");

Essential Methods:
             Method                                              Action
        append(String s)                        Adds text to the end of the existing string.
        insert(int offset, String s)            Adds text at a specific index.
        replace(int start, int end, String s)   Replaces a range of characters with a new string.
        delete(int start, int end)              Removes characters in a specific range.
        reverse()                               Flips the entire sequence of characters.
        capacity()                              Shows how much total memory (slots) the buffer currently has.
*/


//This program demonstrates how StringBuffer modifies the original object directly.

import java.util.Scanner;

public class StrungBuffer {

        public static void main(String[] args) {
            // 1. Creation
            StringBuffer sb = new StringBuffer("Java");

            // 2. Appending (Modify original)
            sb.append(" Programming");
            System.out.println("After append: " + sb); // Output: Java Programming

            // 3. Inserting
            sb.insert(5, "is ");
            System.out.println("After insert: " + sb); // Output: Java is Programming

            // 4. Replacing
            sb.replace(8, 19, "Awesome");
            System.out.println("After replace: " + sb); // Output: Java is Awesome

            // 5. Reversing
            sb.reverse();
            System.out.println("After reverse: " + sb); // Output: emosewA si avaJ

            // 6. Final conversion back to String
            String result = sb.toString();
        }
    }
