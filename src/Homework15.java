import java.util.Scanner;
public class Homework15 {

    // Create a Scanner object for user input

    // Task 1: while Loop - Print First N Natural Numbers
    // Instructions: Use a while loop to print the first N natural numbers (1 to N), where N is provided by the user.
    // Expected Result: For N = 10, the output should be: 1 2 3 4 5 6 7 8 9 10
    private static void printFirstNNaturalNumbers() {
        // Implementation goes here
        Scanner n1= new Scanner (System.in);
        System.out.println("N1 ededini daxil edin: ");
        int N1=n1.nextInt();
        int i1=1;
        while (i1<=N1){
            System.out.println(i1);
            i1++;
        }
    }

    // Task 2: do-while Loop - User Input Validation
    // Instructions: Use a do-while loop to keep asking the user to enter a positive number until they do so.
    // Expected Result: Program should continue prompting until a positive number is entered.
    private static void userInputValidation() {
        // Implementation goes here
        int N2=0;
        do {
            Scanner n2=new Scanner (System.in);
            System.out.println("Musbet eded daxil edin: ");
            N2=n2.nextInt();
        }
        while (N2<=0);

    }

    // Task 3: for Loop - Sum of Array Elements
    // Instructions: Calculate the sum of all elements in a statically declared integer array using a for loop.
    // Expected Result: For an array {1, 2, 3, 4, 5}, the output should be: Sum = 15
    private static void sumOfArrayElements() {
        // Implementation goes here
        int[] num3={1,2,3,4,5};
        int S3=0;
        for(int i3: num3){
            S3+=i3;
        }
        System.out.println("Sum = " + S3);
    }

    // Task 4: for Loop - Multiplication Table
    // Instructions: Print the multiplication table of a number provided by the user using a for loop.
    // Expected Result: For a multiplier of 5, the output should be: 5 * 1 = 5, 5 * 2 = 10, ..., 5 * 10 = 50
    private static void multiplicationTable() {
        // Implementation goes here
        int[] num4={1,2,3,4,5,6,7,8,9,10};
        Scanner n4=new Scanner (System.in);
        System.out.println("eded daxil edin: ");
        int N4=n4.nextInt();
        for(int i4: num4){
            System.out.println(N4 + "*" + i4 + N4*i4);
        }

    }

    // Task 5: for-each Loop - Print Array Elements
    // Instructions: Use a for-each loop to print all elements of a statically declared integer array.
    // Expected Result: For an array {10, 20, 30, 40}, the output should be: 10 20 30 40
    private static void printArrayElementsWithForEach() {
        // Implementation goes here
        int[] num5={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i5: num5){
            System.out.print(i5 + " ");
        }
        System.out.println(" ");
    }

    // Task 6: Nested for Loop - Print a Square of Stars
    // Instructions: Prompt the user to enter the side length of a square and use a nested for loop to print the square of stars.
    // Expected Result: For a side length of 5, the output should be: ***** (5 lines of 5 stars each)
    private static void printSquareOfStars() {
        // Implementation goes here
        Scanner n6=new Scanner (System.in);
        System.out.println("ulduz sayini daxil edin: ");
        int N6=n6.nextInt();
        for (int i6=1;i6<=N6;i6++){
            for (int j6=1;j6<=N6;j6++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    // Task 7: Nested for Loop - Multiplication Table (1 to N)
    // Instructions: Use nested for loops to print the multiplication tables for numbers 1 to N, where N is provided by the user.
    // Expected Result: For N = 5, tables from 1 * 1 to 5 * 10.
    private static void multiplicationTable1ToN() {
        // Implementation goes here
        int[] num_7={1,2,3,4,5,6,7,8,9};
        Scanner n7=new Scanner (System.in);
        System.out.println("N7 ededini daxil edin");
        int N7=n7.nextInt();
        for(int i7: num_7){
            System.out.println(N7 + "*" + i7 + N7*i7);
        }
    }

    // Task 8: while Loop - Find First N Even Numbers
    // Instructions: Use a while loop to find and print the first N even numbers, where N is provided by the user.
    // Expected Result: For N = 5, the output should be: 2 4 6 8 10
    private static void findFirstNEvenNumbers() {
        // Implementation goes here
        Scanner n8= new Scanner (System.in);
        System.out.println("N8 ededini daxil edin.");
        int N8=n8.nextInt();
        int i8=2;
        while (i8<=N8){
            System.out.print(i8);
            i8+=2;
        }
        System.out.println(" ");
    }

    // Task 9: Array and for-each Loop - Count Even Numbers
    // Instructions: Count the number of even numbers in a statically declared integer array using a for-each loop.
    // Expected Result: For an array {3, 7, 2, 9, 5, 8, 10}, the output should be: Number of even elements = 3
    private static void countEvenNumbers() {
        // Implementation goes here
        int[] num9={3,7,2,9,5,8,10,12,15,16,17};
        int S9=0;
        for(int i9: num9){
            if (i9%2==0){
                S9++;
            }
        }
        System.out.println("Number of even elements: " + S9);
    }

    // Task 10: for-each Loop - Print String Array Elements
    // Instructions: Use a for-each loop to print all elements of a statically declared string array.
    // Expected Result: For an array {"apple", "banana", "cherry"}, the output should be: apple banana cherry
    private static void printStringArrayElements() {
        // Implementation goes here
        String[] num10={"apple" , "banana" , "cherry"};
        for(String i10: num10){
            System.out.print(i10 + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        // Call each task method
        printFirstNNaturalNumbers();
        userInputValidation();
        sumOfArrayElements();
        multiplicationTable();
        printArrayElementsWithForEach();
        printSquareOfStars();
        multiplicationTable1ToN();
        findFirstNEvenNumbers();
        countEvenNumbers();
        printStringArrayElements();
    }
}

