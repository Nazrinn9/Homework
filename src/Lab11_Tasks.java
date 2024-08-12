import java.net.Socket;
import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class Lab11_Tasks {

    public static void main(String[] args) {
        printDataTypes();
        performArithmeticOperations();
        evaluateBooleanExpressions();
        useCharDataType();
        calculateRectangleArea();
        useStringDataType();
        performTypeCasting();
        demonstrateOperators();
        concatenateStrings();
        combineNumbersAndStrings();
        useSpecialCharacters();
        useMathClassMethods();
    }

    // Task 1: Java Data Types - Define and print different data types
    public static void printDataTypes() {
        // Instructions: Define variables of different primitive data types (int, float, double, char, boolean). Print each variable.
        // Expected output:
        // Integer: 10
        // Float: 20.5
        // Double: 30.123
        // Char: A
        // Boolean: true
        int i=10;
        float f=10.1f;
        double d=10.11d;
        char c='K';
        boolean b=true;
        System.out.println("Integer: " + i + "\nFloat: " + f + "\nDouble " + d + "\nChar: " + c + "\nBoolean: " + b);

        // Declare variables:

        // Print variables:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 2: Numbers - Perform arithmetic operations
    public static void performArithmeticOperations() {
        // Instructions: Define two integer variables and perform addition, subtraction, multiplication, and division. Print the results.
        // Expected output:
        // Addition: 20
        // Subtraction: 10
        // Multiplication: 75
        // Division: 3
        int a=15;
        int b=5;
        int add=a+b;
        int sub=a-b;
        int mult=a*b;
        int div=a/b;
        System.out.println("Addition: " + add + "\nSubtraction: " + sub + "\nMultiplication: " + mult + "\nDivision: " + div );

        // Declare variables:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Booleans - Use boolean variables in expressions
    public static void evaluateBooleanExpressions() {
        // Instructions: Define boolean variables and use them in logical expressions. Print the results.
        // Expected output:
        // Is Java fun? true
        // Is fish tasty? false
        // Is Java fun and fish tasty? false
        // Is Java fun or fish tasty? true
        boolean a1=true;
        boolean b1=false;
        System.out.println("Is Java fun? " + a1 + "\nIs fish tasty? " + b1 + "\nIs Java fun and fish tasty? " + (a1 && b1) + "\nIs Java fun or fish tasty? " + (a1 || b1));

        // Declare variables:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Characters - Use char data type
    public static void useCharDataType() {
        // Instructions: Define a char variable and print it. Print the ASCII value of the character.
        // Expected output:
        // Grade: B
        // ASCII value of grade: 66
        int a2=(int) 'B';
        System.out.println("Grade: " + 'B' + "\nASCII value of grade: " + a2);

        // Declare variable:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Real-Life Example - Calculate area of a rectangle
    public static void calculateRectangleArea() {
        // Instructions: Define length and width of a rectangle as double variables. Calculate and print the area.
        // Formula: Area = length * width
        double a3=12.5;
        double b3=14.34;
        double S=a3*b3;
        System.out.println("Area= " + S);

        // Declare variables:

        // Calculate and print area:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Non-primitive Types - Use String data type
    public static void useStringDataType() {
        // Instructions: Define a String variable and print it. Print the length of the string.
        // Expected output:
        // Greeting: Hello, World!
        // Length of greeting: 13
        String s="My name is Nazrin and you?";
        System.out.println("Greeting: " + s + "\nLength of greeting: " + s.length());

        // Declare variable:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Java Type Casting - Perform type casting
    public static void performTypeCasting() {
        // Instructions: Cast a double to an int and print the result. Cast an int to a double and print the result.
        // Expected output:
        // Double value: 9.78
        // Casted to int: 9
        // Int value: 100
        // Casted to double: 100.0
        double d2=12.8;
        int i2=(int)d2;
        int i3=80;
        double d3=i3;
        System.out.println("Double value: " + d2 + "\nCasted to int: " + i2);
        System.out.println("Int value: " + i3 + "\nCasted to double: " + d3);

        // Declare variables:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Java Operators - Use different operators
    public static void demonstrateOperators() {
        // Instructions: Use arithmetic, relational, and logical operators. Print the results.
        // Expected output:
        // a + b = 30
        // a > b = false
        // a < b && b > 15 = true
        double a4=9.8;
        double b4=9.12;
        double s1=a4+b4;
        System.out.println("a4+b4= " + s1);
        System.out.println("a4>b4= " + (a4>b4));
        System.out.println("a<b && b>15 " + ((a4<b4) && (b4>15)) );

        // Declare variables:

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Java Strings - String concatenation
    public static void concatenateStrings() {
        // Instructions: Concatenate two strings and print the result.
        // Expected output:
        // Concatenated string: Hello World
        String s1="Hello";
        String s2="World";
        System.out.println(s1 + " " + s2);

        // Declare variables:

        // Concatenate and print:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Numbers and Strings - Combine numbers and strings
    public static void combineNumbersAndStrings() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The number is 100
        String h1="The number is";
        int h2=56;
        System.out.println(h1+h2);

        // Declare variables:

        // Print result:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Special Characters - Use special characters in strings
    public static void useSpecialCharacters() {
        // Instructions: Define a string with special characters like new line (\n) and tab (\t). Print the string.
        // Expected output:
        // String with special characters:
        // Line1
        // Line2	Tabbed

        // Declare variable:
        String r1="Salam necesiz?";
        String t1="Sagol, yaxsiyam sen necesen?";
        String r2="Ela!";
        String r3="Dersler necedir?";
        System.out.println(r1 + "\n" + t1 + "\n" + r2 + "\t" + r3);

        // Print result:

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Java Math - Use Math class methods
    public static void useMathClassMethods() {
        // Instructions: Use methods from the Math class to perform different calculations. Print the results.
        // Expected output:
        // Square root of 16: 4.0
        // Random value between 57 and 260: <random value between 57 and 260>

        // Declare variables:
        double d5=10.24;
        double sq=Math.sqrt(d5);
        System.out.println("Square root of " + d5 + ": " + sq);
        int p1= 57;
        int p2=260;
        int rand=(int)(Math.random()*203);
        rand+=57;
        System.out.println("Random value between 57 and 260: " + rand);

        // Print results:

        System.out.println("-----------");  // Do not touch this line
    }
}
