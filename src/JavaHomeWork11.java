public class JavaHomeWork11 {

    // Task 1: Java Data Types
    // Demonstrate usage of different data types
    // Expected Output: Integer: 10, Double: 20.5, Char: A, Boolean: true
    public static void javaDataTypes() {
        // Declare and initialize variables of different data types
        int a = 10;
        double b = 20.5;
        char c = 'A';
        boolean d = true;
        System.out.println("Integer: " + a + "\nDouble: " + b + "\nChar: " + c + "\nBoolean: " + d);
    }


    // Print all variables


    // Task 2: Data Types
    // Declare and initialize variables with all primitive data types
    // Expected Output: Byte: 100, Short: 1000, Int: 10000, Long: 100000L, Float: 10.5f, Double: 20.5, Char: B, Boolean: false
    public static void dataTypes() {
        // Declare and initialize variables of all primitive data types
        byte a1 = 100;
        short b1 = 1000;
        int c1 = 10000;
        long d1 = 100000L;
        float f1 = 10.5f;
        double e1 = 20.5;
        char r1 = 'B';
        boolean g1 = false;
        System.out.println("Byte: " + a1 + "\nShort: " + b1 + "\nInt: " + c1 + "\nLong: " + d1 + "\nFloat: " + f1 + "\nDouble: " + e1 + "\nChar: " + r1 + "\nBoolean: " + g1 );


        // Print all variables

    }

    // Task 3: Numbers
    // Perform basic arithmetic operations and print results
    // Expected Output: Sum: 15, Difference: 5, Product: 50, Quotient: 2, Remainder: 1
    public static void numbers() {
        // Declare and initialize two integer variables
        int x=10;
        int y=5;
        int sum=x+y;
        int dif=x-y;
        int pro=x*y;
        int quo=x/y;
        int rem=x%y;
        System.out.println("Sum: " + sum + "\n" + "Difference: " + dif + "\n" + "Product: " + pro + "\n" + "Quotient: " + quo + "\n" + "Remainder: " + rem );






        // Print the results

    }

    // Task 4: Booleans
    // Demonstrate boolean operations
    // Expected Output: Is Java fun? true
    // Expected Output: Is the sky green? false
    public static void booleans() {
        // Declare and initialize two boolean variables
        boolean x1= true;
        boolean y1= false;
        System.out.println("Is Java fun? " + x1 + "\nIs the sky green? " + y1);


        // Print both boolean values

    }

    // Task 5: Characters
    // Demonstrate character usage and print a char variable
    // Expected Output: The first letter of the alphabet is A
    public static void characters() {
        // Declare and initialize a char variable
        char c2='A';
        System.out.println("The first letter of the alphabet is " + c2);


        // Print the char variable

    }

    // Task 6: Java Type Casting
// Demonstrate implicit and explicit type casting with different numeric types and String to numeric casting
// Expected Output: Implicit Casting (byte to int): 42 , Explicit Casting (int to short): 1000, Explicit Casting (double to float): 15.99
    public static void javaTypeCasting() {
        byte h=100;
        int j=12007894;
        double k=12.3456789012;
        int h1=h;
        short j1=(short)j;
        float k1=(float)k;
        System.out.println("Implicit Casting (byte to int): " + h1 + "\nExplicit Casting (int to short): " + j1 + "\nExplicit Casting (double to float): " + k1);
        // Declare and initialize a variable for implicit casting (Widening Casting)

        // Implicit casting (Widening Casting) (byte to int)

        // Declare and initialize a variable for implicit casting (Widening Casting)

        // Explicit casting (Narrowing Casting) (int to short)

        // Declare and initialize a variable for implicit casting (Widening Casting)

        // Explicit casting (Narrowing Casting) (double to float)

        // Print all values


    }


    // Task 7: Java Type Casting
    // Demonstrate implicit and explicit type casting
    // Expected Output: Implicit Casting: 10.0, Explicit Casting: 10
    public static void javaTypeCastingManipulation() {
        float p1=10.0f;
        int p_1=(int)p1;
        System.out.println("Implicit Casting: " + p1 + "," + "\nExplicit Casting: " + p_1);
        // Declare and initialize a variable for implicit casting (Widening Casting)

        // Perform implicit casting


        // Declare and initialize a variable for explicit casting (Narrowing Casting)

        // Print both values

    }

    // Task 8: Java Operators
    // Demonstrate the usage of various operators
    // Expected Output: Addition: 15, Subtraction: 5, Multiplication: 50, Division: 2, Remainder: 1
    // Expected Output: AND: true, OR: true, NOT: false
    public static void javaOperators() {
        int int1=46;
        int int2=15;
        int add=int1 + int2;
        int sub=int1-int2;
        int mul=int1*int2;
        int divi=int1/int2;
        int rema=int1%int2;
        boolean bol_1= true;
        boolean bol_2= false;
        System.out.println("\nAddition: " + add + "\nSubtraction: " + sub + "\nMultiplication: " + mul + "\nDivision: " + divi + "\nRemainder: " + rema);
        System.out.println("AND: " + bol_1 + "\nOR: " + bol_1 + "\nNOT: " + bol_2);
        // Declare and initialize two integer variables

        // Perform arithmetic operations

        // Declare and initialize two boolean variables


        // Print the results

    }

    // Task 9: Comparison Operators
    // Demonstrate the usage of comparison operators
    // Expected Output: 10 > 5: true, 10 < 5: false, 10 == 10: true, 10 != 5: true, 10 >= 5: true, 10 <= 5: false
    public static void comparisonOperators() {
        boolean s_1=10>5;
        System.out.println("10>5: " + s_1);
        boolean s_2=10<5;
        System.out.println("10<5: " + s_2);
        boolean s_3=10==10;
        System.out.println("10==10 " + s_3);
        boolean s_4=10!=5;
        System.out.println("10!=5 " + s_4);
        boolean s_5=10>=5;
        System.out.println("10>=5: " + s_5);
        boolean s_6=10<=5;
        System.out.println("10<=5: " + s_6);
        // Declare and initialize variables

        // Perform comparison operations

        // Print the results

    }

    // Task 10: Comparison Operators
// Demonstrate the usage of comparison operators with different data types
// Expected Output: 10.5 > 5: true, 10.5 < 20.5: true, 10.5 == 10.5: true, 'a' != 'b': true
    public static void comparisonOperatorsManipulation() {
        boolean bo_1=20>20.02;
        System.out.println("20>20.02: " + bo_1);
        boolean bo_2=5.7<10.6;
        System.out.println("5.7<10.6: " + bo_2);
        boolean bo_3=3.0==3;
        System.out.println("3.0==3: " + bo_3);
        boolean bo_4='C'!='V';
        System.out.println("'C'!='V': " + bo_4);

        // Declare and initialize variables


        // Perform comparison operations

        // Print the results

    }


    // Task 11: Assignment Operators
    // Demonstrate the usage of assignment operators
    // Expected Output: Add and Assign: 15, Subtract and Assign: 5, Multiply and Assign: 50, Divide and Assign: 2, Modulus and Assign: 1
    public static void assignmentOperators() {
        // Declare and initialize a variable
        int t1=28;
        int t2=5;
        int ad=0;
        ad+=t1+t2;


        // Add and assign (And then print the num)
        System.out.println("Add and Assign: " + ad);


        // Subtract and assign (And then print the num)
        int sb=0;
        sb=t1;
        sb-=t2;
        System.out.println("Subtract and Assign: " + sb);

        // Multiply and assign (And then print the num)
        int m=1;
        m*=t1*t2;
        System.out.println("Multiply and Assign: " + m);

        // Divide and assign (And then print the num)
        int divv=t1;
        divv/=t2;
        System.out.println("Divide and Assign: " + divv);


        // Modulus and assign (And then print the num)
        int modd=t1;
        modd%=t2;
        System.out.println("Modulus and Assign: " + modd);

    }

    // Task 12: Relational Operators
    // Demonstrate the usage of relational operators
    // Expected Output: 10 is equal to 10: true, 10 is not equal to 5: true, 10 is greater than 5: true, 10 is less than 5: false
    public static void relationalOperators() {
        boolean v1=10==10;
        boolean v2=10!=5;
        boolean v3=10>5;
        boolean v4=10<5;
        System.out.println("10 is equal to 10: " + v1 + "," + "\n10 is not equal to 5: " + v2 + "\n10 is greater than 5: " + v3 + "\n10 is less than 5: " + v4);
        // Declare and initialize variables


        // Perform relational operations

        // Print the results

    }

    // Main method to run all tasks
    // Please do not modify the main method
    public static void main(String[] args) {
        javaDataTypes();
        dataTypes();
        numbers();
        booleans();
        characters();
        javaTypeCastingManipulation();
        javaTypeCasting();
        javaOperators();
        comparisonOperators();
        comparisonOperatorsManipulation();
        assignmentOperators();
        relationalOperators();
    }
}
