/*
For-each loop matlab kya hota hai? (Java)

For-each loop ka use tab hota hai jab hume array ya collection ke
har element par ek-ek karke kaam karna ho, bina index use kiye.
Basic Syntax:
dataType → array ka type (int, String, etc.)

variable → temporary variable (har element ko store karega)

arrayName → jis array par loop chalana hai
*/


public class Foreachloop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
