public class StringToolbox {
    public static void main(String[] args) {

                String str = "  Hello Java Programming  ";
                String str2 = "hello java programming";

                // 1. length()
                System.out.println("Length: " + str.length());  //Length: 26

                // 2. trim()
                String trimmed = str.trim();
                System.out.println("After trim: " + trimmed); //After trim: Hello Java Programming

                // 3. toUpperCase()
                System.out.println("Uppercase: " + trimmed.toUpperCase()); //Uppercase: HELLO JAVA PROGRAMMING

                // 4. toLowerCase()
                System.out.println("Lowercase: " + trimmed.toLowerCase()); //Lowercase: hello java programming

                // 5. charAt()
                System.out.println("Character at index 1: " + trimmed.charAt(1)); //Character at index 1: e

                // 6. substring()
                System.out.println("Substring(6): " + trimmed.substring(6)); //Substring(6): Java Programming
                System.out.println("Substring(0,5): " + trimmed.substring(0,5)); //Substring(0,5): Hello

                // 7. equals()
                System.out.println("Equals: " + trimmed.equals(str2)); //Equals: false

                // 8. equalsIgnoreCase()
                System.out.println("Equals Ignore Case: " + trimmed.equalsIgnoreCase(str2)); //Equals Ignore Case: true

                // 9. compareTo()
                System.out.println("CompareTo: " + trimmed.compareTo(str2)); //CompareTo: -32

                // 10. contains()
                System.out.println("Contains 'Java': " + trimmed.contains("Java")); //Contains 'Java': true

                // 11. startsWith()
                System.out.println("StartsWith 'Hello': " + trimmed.startsWith("Hello")); //StartsWith 'Hello': true

                // 12. endsWith()
                System.out.println("EndsWith 'Programming': " + trimmed.endsWith("Programming")); //EndsWith 'Programming': true

                // 13. indexOf()
                System.out.println("IndexOf 'Java': " + trimmed.indexOf("Java")); //IndexOf 'Java': 6

                // 14. lastIndexOf()
                System.out.println("LastIndexOf 'a': " + trimmed.lastIndexOf("a")); //LastIndexOf 'a': 16

                // 15. replace()
                System.out.println("Replace Java with Python: " + trimmed.replace("Java", "Python")); // Replace Java with Python: Hello Python Programming

                // 16. split()
                String[] words = trimmed.split(" ");
                System.out.println("Split words:");
                for(String word : words) {
                    System.out.println(word);           /*Split words:
                                                          Hello
                                                          Java
                                                          Programming*/
                }

                // 17. concat()
                System.out.println("Concat: " + trimmed.concat(" Course")); //Concat: Hello Java Programming Course

                // 18. isEmpty()
                String emptyStr = "";
                System.out.println("Is Empty: " + emptyStr.isEmpty()); //Is Empty: true

                // 19. valueOf()
                int number = 100;
                String numStr = String.valueOf(number);   //ValueOf: 100
                System.out.println("ValueOf: " + numStr);

                // 20. format()
                String formatted = String.format("My name is %s and age is %d", "Arvind", 22);
                System.out.println("Formatted String: " + formatted);  //Formatted String: My name is Arvind and age is 22

    }
        }
