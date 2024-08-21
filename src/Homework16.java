public class Homework16 {
    public static void printOddOneToN(int N) {
    // Task 1: Print Odd Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all odd numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 7, the output should be "1 3 5 7".
        for(int i=1 ; i<=N ; i+=2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }


    public static void printEvenTwoToN(int N){
    // Task 2: Print the First N Even Numbers (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints the first N even numbers. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "2 4 6 8 10".
        for(int i=2; i<=N; i+=2){
            System.out.print(i + " ");
        }
        System.out.println("");
    }


    public static void powerOfNumber(int base, int exponent){
    // Task 3: Calculate the Power of a Number
    // Instruction: Create a method that takes two integers, base and exponent, and calculates the result of base raised to the power of exponent.
    // Use a for loop for this task.
    // Call this method in the main method.
    // Expected Result: If the user inputs base=2 and exponent=3, the output should be "8".
        int pow;
        for(pow=1; exponent>=1; exponent--){
            pow=pow*base;
        }
        System.out.println(pow);
    }


    public static void checkNumberEven(int N){
    // Task 4: Check if a Number is Even (While Loop)
    // Instruction: Create a method that takes an integer N as input and checks if it is even. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 4, the output should be "4 is even".
        if (N%2==0){
            System.out.println(N + " is even.");
        }
        else {
            System.out.println(N + " is odd.");
        }
    }


    public static void multiplesNUpToM(int N, int M){
    // Task 5: Print Multiples of N up to M (For Loop)
    // Instruction: Create a method that takes two integers N and M as input, and prints the multiples of N up to M. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs N=3 and M=10, the output should be "3 6 9".
        for(int i=N; N<=M; N+=i){
            System.out.print(N + " ");
        }
        System.out.println("");
    }


    public static void printHelloTimesN(int N){
    // Task 6: Print "Hello" N Times (While Loop)
    // Instruction: Create a method that takes an integer N as input and prints "Hello" N times. Use a while loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 3, the output should be:
    // "Hello"
    // "Hello"
    // "Hello"
        while(N>=1){
            System.out.println("Hello");
            N--;
        }
    }


    public static void print1ToN(int N){
    // Task 7: Print Numbers from 1 to N (For Loop)
    // Instruction: Create a method that takes an integer N as input and prints all numbers from 1 to N. Use a for loop.
    // Call this method in the main method.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
        for(int i=1; i<=N; i++){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void printCharNTimes(char Character, int Times) {
        // Task 8: Print a Character N Times (For Loop)
        // Instruction: Create a method that takes a character and an integer N as input and prints the character N times in a single line. Use a for loop.
        // Call this method in the main method.
        // Expected Result: If the user inputs '*' and 5, the output should be "*****".
        for (int i=1; i<=Times; i++){
            System.out.print(Character);
        }
        System.out.println("");
    }

    public static void sumFirstNNamers(int N) {
        // Task 9: Calculate the Sum of the First N Natural Numbers (For Loop)
        // Instruction: Create a method that takes an integer N as input and calculates the sum of the first N natural numbers.
        // Use a for loop for this task.
        // Call this method in the main method.
        // Expected Result: If the user inputs 4, the output should be "10" (because 1 + 2 + 3 + 4 = 10).
        int sum;
        for(sum=0; N>=1; N--){
            sum+=N;
        }
        System.out.println(sum);
    }


    public static void printNToOne(int N) {
        // Task 10: Print a Countdown from N to 1 (While Loop)
        // Instruction: Create a method that takes an integer N as input and prints a countdown from N to 1. Use a while loop.
        // Call this method in the main method.
        // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
        // Main method to call all tasks
        while(N>=1){
            System.out.print(N + " ");
            N--;
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        // Task 1: Get user input for Task 1 and call method for Task 1
        printOddOneToN(8);

        // Task 2: Get user input for Task 2 and call method for Task 2
        printEvenTwoToN(12);

        // Task 3: Get user input for Task 3 and call method for Task 3
        powerOfNumber(3,5);

        // Task 4: Get user input for Task 4 and call method for Task 4
        checkNumberEven(25);

        // Task 5: Get user input for Task 5 and call method for Task 5
        multiplesNUpToM(7,40);

        // Task 6: Get user input for Task 6 and call method for Task 6
        printHelloTimesN(4);

        // Task 7: Get user input for Task 7 and call method for Task 7
        print1ToN(6);

        // Task 8: Get user input for Task 8 and call method for Task 8
        printCharNTimes('*',6);

        // Task 9: Get user input for Task 9 and call method for Task 9
        sumFirstNNamers(6);

        // Task 10: Get user input for Task 10 and call method for Task 10
        printNToOne(9);

    }
}
