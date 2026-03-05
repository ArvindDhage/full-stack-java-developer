public class WhatisString {
    public static void main(String args[]){
        String str="Arvind";
        System.out.println(str);
    }
}
/*

                   1. The Core Theory: Immutability
The most important concept to understand about Java Strings is that they are immutable.

What it means: Once a String object is created, its value cannot be changed.

Why? Security (passing usernames/passwords), Caching, and Thread-safety.

The String Pool: To save memory, Java maintains a special memory region called the
String Constant Pool. If you create two strings with the same literal value, they will both
point to the same memory address in the pool.



1. What is String in Java?

In Java, String is a class used to store a sequence of characters.

Example:

String name = "Arvind";

👉 Here "Arvind" is a string literal.
👉 String is a class from java.lang package (auto imported).
*/