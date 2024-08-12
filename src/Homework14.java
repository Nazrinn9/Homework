import java.util.Scanner;
public class Homework14 {

    // Task 1: Multiplication of First N Numbers (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the product of numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Product: 120" (since 1*2*3*4*5=120).
    public static void multiplicationOfFirstNNumbersWhile() {
        // Implementation here
        Scanner n1= new Scanner (System.in);
        System.out.println("N1 ededini daxil edin: ");
        int N1=n1.nextInt();
        int s=1;
        while (N1>=1) {
            s=s*N1;
            N1-=1;
        }
        System.out.println(s);
    }

    // Task 2: Count from N to 20 (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints numbers from N to 20 using a do-while loop.
    // Expected Result: If the user inputs 17, the output should be "17 18 19 20".
    public static void countFromNTo20DoWhile() {
        // Implementation here
        Scanner n2= new Scanner (System.in);
        System.out.println("N2 ededini daxil edin: ");
        int N2=n2.nextInt();
        int i2=0;
        do{
            if (i2==0){
                if (N2<=20){
                    System.out.print(N2 + " ");
                    i2++;
                    N2++;
                }
            }
            else{
                System.out.print(N2 + " ");
                N2++;
            }

        }
        while (N2<=20);
        System.out.println(" ");
    }

    // Task 3: Print Numbers from 1 to N (For Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from 1 to N using a for loop.
    // Expected Result: If the user inputs 5, the output should be "1 2 3 4 5".
    public static void printNumbersFor() {
        // Implementation here
        Scanner n3= new Scanner (System.in);
        System.out.println("N3 ededini daxil edin: ");
        int N3=n3.nextInt();
        for (int i=1 ; i<=N3 ; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    // Task 4: Sum of Even Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all even numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 10, the output should be "Sum of even numbers: 30" (since 2+4+6+8+10=30).
    public static void sumOfEvenNumbersWhile() {
        // Implementation here
        Scanner n4= new Scanner (System.in);
        System.out.println("N4 ededini daxil edin: ");
        int N4=n4.nextInt();
        int S=0;
        while (N4>=1){
            if (N4%2==0) {
                S+=N4;
            }
            N4--;
        }
        System.out.println("Sum of even numbers: " + S);
    }

    // Task 5: Print Digits of a Number in Reverse with Spaces (Do-While Loop)
    // Instruction: Write a program that takes user input for a number and prints its digits in reverse order with spaces between them using a do-while loop.
    // Expected Result: If the user inputs 12345, the output should be "5 4 3 2 1".
    public static void printDigitsReverseWithSpacesDoWhile() {
        // Implementation here
        Scanner n5=new Scanner (System.in);
        System.out.println("N5 ededini daxil edin: ");
        int N5=n5.nextInt();
        do {
            System.out.print(N5%10 + " ");
            N5/=10;
        }
        while (N5>0);
    }

    // Task 6: Calculate Factorial of a Number (For Loop)
    // Instruction: Write a program that takes user input for a number N and calculates its factorial using a for loop.
    // Expected Result: If the user inputs 5, the output should be "Factorial: 120" (since 5! = 5*4*3*2*1 = 120).
    public static void calculateFactorialFor() {
        // Implementation here
        Scanner n6=new Scanner(System.in);
        System.out.println("N6 ededini daxil edin: ");
        int S6=1;
        int i6=n6.nextInt();
        for(int N6=n6.nextInt(); N6>=1; N6-- ){
            S6*=N6;
        }
        System.out.println(i6 + "!=" + S6);
    }

    // Task 7: Print Numbers from N to 1 in Reverse Order (While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all numbers from N to 1 in reverse order using a while loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void printNumbersInReverseWhile() {
        // Implementation here
        Scanner n7=new Scanner(System.in);
        System.out.println("N7 ededini daxil edin: ");
        int N7=n7.nextInt();
        while (N7>=1){
            System.out.print(N7);
            N7--;
        }
        System.out.println(" ");
    }

    // Task 8: Print Odd Numbers from 1 to N (Do-While Loop)
    // Instruction: Write a program that takes user input for a number N and prints all odd numbers from 1 to N using a do-while loop.
    // Expected Result: If the user inputs 10, the output should be "1 3 5 7 9".
    public static void printOddNumbersDoWhile() {
        // Implementation here
        Scanner n8=new Scanner(System.in);
        System.out.println("N8 ededini daxil edin: ");
        int N8=n8.nextInt();
        int i8=1;
        do {
            System.out.print(i8);
            i8+=2;
        }
        while (i8<=N8);
        System.out.println(" ");
    }

    // Task 9: Count Down from N to 1 (For Loop)
    // Instruction: Write a program that takes user input for a number N and prints numbers from N down to 1 using a for loop.
    // Expected Result: If the user inputs 5, the output should be "5 4 3 2 1".
    public static void countDownFromNTo1For() {
        // Implementation here
        Scanner n9=new Scanner(System.in);
        System.out.println("N9 ededini daxil edin: ");
        for( int N9=n9.nextInt() ; N9>=1 ; N9-- ){
            System.out.print(N9);
        }
        System.out.println("  ");
    }

    // Task 10: Print Sum of Numbers from 1 to N (While Loop)
    // Instruction: Write a program that takes user input for a number N and calculates the sum of all numbers from 1 to N using a while loop.
    // Expected Result: If the user inputs 5, the output should be "Sum: 15" (since 1+2+3+4+5=15).
    public static void sumOfNumbersWhile() {
        // Implementation here
        Scanner n10=new Scanner(System.in);
        System.out.println("N10 ededini daxil edin: ");
        int N10=n10.nextInt();
        int S10=0;
        while(N10>=1){
            S10+=N10;
            N10--;
        }
    }

    public static void main(String[] args) {
        multiplicationOfFirstNNumbersWhile();
        countFromNTo20DoWhile();
        printNumbersFor();
        sumOfEvenNumbersWhile();
        printDigitsReverseWithSpacesDoWhile();
        calculateFactorialFor();
        printNumbersInReverseWhile();
        printOddNumbersDoWhile();
        countDownFromNTo1For();
        sumOfNumbersWhile();
    }
}

