// LabSolution.java
// This program demonstrates fundamental data types and operations in Java.

public class LabSolution {

  public static void main(String[] args) {

    // --- Part 1: Numeric Operations ---

    System.out.println("--- Part 1: Numeric Operations ---\n");

    // 1. Integer Operations

    int num = 15;
    int num2 = 5;

    System.out.println("The sum is: " + (num + num2));
    System.out.println("The difference is: " + (num - num2));
    System.out.println("The product is: " + (num * num2));
    System.out.println("The quotient is: " + (num / num2));
    System.out.println("The remainder is: " + (num % num2));

    // 2. Double Operations

    double number = 5.2;
    double number2 = 3.6;

    System.out.println("The sum is: " + (number + number2));
    System.out.println("The difference is: " + (number - number2));
    System.out.println("The product is: " + (number * number2));
    System.out.println("The quotient is: " + (number / number2));
    System.out.println("The remainder is: " + (number % number2));

     // 3. Data Type Limits

    long large = 6388934930909329052L;
    float small = 2.18f;

    // Experiment: int testValue = 2147483648; // This would cause a compile error.

     int testValue = 2147483648;

    // --- Part 2: Character and String Operations ---

    System.out.println("\n--- Part 2: Character and String Operations ---\n");

    // 1. Character Operations

    char letter = 'c';

    // To get the ASCII value, cast the char to an int.

    int ASCIIvalue = (int) letter;
    System.out.println("The ASCII value of " + letter + " is: " + ASCIIvalue);

    // 2. String Operations

    String petname = "Lacy is my pet name";

    // Get the length of the string

    System.out.println("Length: " + petname.length());

    // Get the character at a specific index (0-based)
    // The character at index 1 is 'a'.

    System.out.println("Char at index 1: " + petname.charAt(1));

    // Get a substring
    // Substring from index 8 to the end.

    System.out.println("Substring (8 to end): " + petname.substring(8));
    
    // Substring from index 8 up to (but not including) index 15.

    System.out.println("Substring (8 to 15): " + petname.substring(8, 15));

    // Convert to uppercase

    System.out.println("Uppercase: " + petname.toUpperCase());

    // Convert to lowercase

    System.out.println("Lowercase: " + petname.toLowerCase());

  }
}