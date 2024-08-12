public class HomeWork12 {

    public static void main(String[] args) {
        analyzeBooleanValues();
        mergeStringWithNumber();
        convertStringCase();
        generateRandomNumber();
        demonstrateCharacterOperations();
        calculateTriangleArea();
        useEscapeSequences();
        applyExplicitTypeCasting();
        exploreStringMethods();
        illustrateLogicalOperators();
        performComplexArithmetic();
        displayDataTypes();
    }

    // Task 1: Analyze Boolean Values - Determine the outcome of various logical conditions
    public static void analyzeBooleanValues() {
        // Instructions: Define boolean variables and evaluate different logical expressions. Print the results.
        // Expected output:
        // Is Java versatile? true
        // Is Python slow? false
        // Is Java versatile and Python slow? false
        // Is Java versatile or Python slow? true

        // Declare variables:
        String a="Is java  versatile?  ";
        String b="Is Python slow?  ";
        boolean a1=true;
        boolean b1=false;

        // Print results:
        System.out.println(a + a1);
        System.out.println(b + b1);
        System.out.println("Is Java versatile and Python slow?  " + (a1 && b1) );
        System.out.println("Is Java versatile or Python slow?  " + (a1 || b1) );

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 2: Merge String with Number - Concatenate a string and a number in a formatted message
    public static void mergeStringWithNumber() {
        // Instructions: Combine a string with a number and print the result.
        // Expected output:
        // The total is 50

        // Declare variables:
        String a2="The total is";
        int i1= 20;
        int i2= 30;
        int total=i1+i2;

        // Concatenate and print:
//        System.out.println(a2.concat(total));

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 3: Convert String Case - Change the case of characters in a string
    public static void convertStringCase() {
        // Instructions: Convert a string to uppercase and lowercase, then print the results.
        // Expected output:
        // Uppercase: JAVA PROGRAMMING
        // Lowercase: java programming

        // Declare variable:
        String s1="Java programming";

        // Convert and print:
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 4: Generate Random Number - Produce a random number within a specified range
    public static void generateRandomNumber() {
        // Instructions: Generate a random number between 96 and 330 and print the result.
        // Expected output:
        // Random number between 96 and 330: <random number>

        // Declare variables:
        int i1=96;
        int i2=330;
        int random=(int)(Math.random()*234);
        random+=96;

        // Print result:
        System.out.println("Random number between 96 and 330: " + random);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 5: Demonstrate Character Operations - Show the result of character arithmetic and ASCII value
    public static void demonstrateCharacterOperations() {
        // Instructions: Define a char variable and perform operations such as finding its ASCII value and the next character in the sequence. Print the results.
        // Expected output:
        // Character: C
        // ASCII value: 67
        // Next character: D

        // Declare variable:
        char c1='C';
        int i3=(int)c1;
        char c2=(char)(i3+1);

        // Print results:
        System.out.println("Character: " + c1);
        System.out.println("ASCII value: " + i3);
        System.out.println("Next character: " + c2);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 6: Calculate Triangle Area - Find the area of a right triangle
    public static void calculateTriangleArea() {
        // Instructions: Define base and height of a right triangle and calculate the area. Print the result.
        // Formula: Area = 0.5 * base * height

        // Declare variables:
        int basa=16;
        int height=12;
        double Area=0.5*basa*height;

        // Calculate and print area:
        System.out.println("Area= " + Area);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 7: Use Escape Sequences - Show the use of escape sequences in a formatted string
    public static void useEscapeSequences() {
        // Instructions: Define a string with escape sequences and print it.
        // Expected output:
        // Formatted string with escape sequences: Here is a new line:\nHere is a tab:\tAnd a backslash:\\

        // Declare variable:
        String s5="Here is a new line:\\nHere is a tab:\\tAnd a backslash:\\\\";

        // Print result:
        System.out.println(s5);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 8: Apply Explicit Type Casting - Cast between floating-point and integer types
    public static void applyExplicitTypeCasting() {
        // Instructions: Perform explicit type casting between float and int, and int and double. Print the results.
        // Expected output:
        // Float value: 12.34
        // Casted to int: 12
        // Int value: 45
        // Casted to double: 45.0

        // Declare variables:
        double d2=12.34;
        int i2=(int)d2;
        int i3=45;
        double d3=i3;

        // Print results:
        System.out.println("Double value: " + d2 + "\nCasted to int: " + i2);
        System.out.println("Int value: " + i3 + "\nCasted to double: " + d3);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 9: Explore String Methods - Use length() and indexOf()
    public static void exploreStringMethods() {
        // Instructions: Define a String variable and use length() and indexOf() methods. Print the results.
        // Expected output:
        // Length of string: 11
        // Index of 'e': 1

        // Declare variables:
        String txt="Explore String Methods";
        int len=txt.length();
        int index=txt.indexOf("e");

        // Print results:
        System.out.println("Length of string:  " + len);
        System.out.println("Index of 'e' :  " + index);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 10: Illustrate Logical Operators - Evaluate expressions using different logical operators
    public static void illustrateLogicalOperators() {
        // Instructions: Use various logical operators to evaluate expressions. Print the results.
        // Expected output:
        // a & b = false
        // a | b = true
        // !(a && b) = true

        // Declare variables:
        boolean x=(45>45.01);
        boolean y=(50.11>=50.021);

        // Print results:
        System.out.println("x & y = " + (x && y));
        System.out.println("x | y = " + (x || y));
        System.out.println("!(x && y) = " + !(x && y));

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 11: Perform Complex Arithmetic - Compute the result of multiple arithmetic expressions
    public static void performComplexArithmetic() {
        // Instructions: Define variables and compute the result of several arithmetic expressions. Print the results.
        // Expected output:
        // Sum: 45
        // Difference: 15
        // Product: 150
        // Quotient: 5

        // Declare variables:
        int i5=30;
        int i6=15;
        int sm=i5+i6;
        int dif=i5-i6;
        int pr=i5*i6;
        int qu=i5%i6;

        // Print results:
        System.out.println("Sum: " + sm);
        System.out.println("Difference: " + dif);
        System.out.println("Product: " + pr);
        System.out.println("Quotient: " + qu);

        System.out.println("-----------");  // Do not touch this line
    }

    // Task 12: Display Data Types - Print the default values of different data types
    public static void displayDataTypes() {
        // Instructions: Define variables of different primitive data types (byte, short, long, double, boolean). Print each variable.
        // Expected output:
        // Byte: 0
        // Short: 0
        // Long: 0
        // Double: 0.0
        // Boolean: false

        // Declare variables:
        byte by=9;
        short sh=by;
        long lo=sh;
        double db=lo;
        boolean bl=false;
        System.out.println("Byte: " + by);
        System.out.println("Short: " + sh);
        System.out.println("Long: " + lo);
        System.out.println("Double: " + db);
        System.out.println("Boolean: " + bl);

        // Print variables:

        System.out.println("-----------");  // Do not touch this line
    }
}
