import java.util.Scanner;
public class HomeWork13 {
    // Task 1: Check Positive Number
    // Instruction: Write a program that takes user input for a number and checks if it is positive. If it is, print "The number is positive."
    // Expected Result: If the user input number is 5, the output should be "The number is positive."
    public static void checkPositiveNumber() {
        // Implementation here-
        Scanner numm= new Scanner (System.in);
        System.out.println("Ededi daxil edin: ");
        int num=numm.nextInt();
        System.out.print("Daxil edilen eded ");
        if (num > 0) {
            System.out.println("musbetdir.");
        }
        else if (num < 0) {
            System.out.println("menfidir.");
        }
        else {
            System.out.println("ne musbet ne de menfidir.");
        }
    }

    // Task 2: Check Even or Odd
    // Instruction: Write a program that takes user input for a number and checks if it is even or odd. Print "The number is even." or "The number is odd." accordingly.
    // Expected Result: If the user input number is 4, the output should be "The number is even."
    public static void checkEvenOrOdd() {
        // Implementation here
        Scanner numm= new Scanner (System.in);
        System.out.println("Ededi daxil edin: ");
        int num1=numm.nextInt();
        System.out.print("Daxil edilen eded ");
        int num2=num1%2;
        if (num1<0) {
            num2=Math.abs(num2);
            if (num2==1){
                System.out.println("tekdir.");
            }
            else {
                System.out.println("cutdur.");
            }
        }
        else if (num1>0){
            if (num2==1){
                System.out.println("tekdir.");
            }
            else {
                System.out.println("cutdur.");
            }
        }
        else {
            System.out.println("daxil edilen ede ne tek nede cutdur!");
        }


    }

    // Task 3: Categorize Age
    // Instruction: Write a program that takes user input for an age and categorizes it into groups: Child (0-12), Teenager (13-19), Adult (20-64), Senior (65+). Print the appropriate category.
    // Expected Result: If the user input age is 25, the output should be "Adult."
    public static void categorizeAge() {
        // Implementation here
        Scanner num_= new Scanner (System.in);
        System.out.println("Ededi daxil edin: ");
        int num3=num_.nextInt();
        if (num3>0) {
            if (num3>=0 || num3<13){
                System.out.println("Child");
            }
            else if (num3>13 || num3>=19){
                System.out.println("Teenager");
            }
            else if (num3>=20 || num3<=64){
                System.out.println("Adult");
            }
            else if (num3>65) {
                System.out.println("Senior");

            }
        }
        else {
            System.out.println("Duzgun eded daxil edilmeyibdir.");
        }


    }

    // Task 4: Determine Weekday or Weekend
    // Instruction: Write a program that takes user input for a day of the week (1-7) and prints whether it is a Weekday (1-5) or Weekend (6-7). Print "Invalid day" if the number is outside this range.
    // Expected Result: If the user input day is 3, the output should be "Weekday."
    public static void determineWeekdayOrWeekend() {
        // Implementation here
        Scanner num4= new Scanner (System.in);
        System.out.println("Heftenin necenci gunu oldugunu daxil edin: ");
        int num5=num4.nextInt();
        if (num5>=1 && num5<=5){
            System.out.println("Weekday");
        }
        else if (num5==6 || num5==7){
            System.out.println("Weekend");
        }
        else {
            System.out.println("Invalid day");
        }
    }

    // Task 5: Check Leap Year
    // Instruction: Write a program that takes user input for a year and checks if it is a leap year. A leap year is divisible by 4 but not by 100, except if it is also divisible by 400. Print "Leap year." or "Not a leap year." accordingly.
    // Expected Result: If the user input year is 2020, the output should be "Leap year."
    public static void checkLeapYear() {
        // Implementation here
        //-----------------------
    }

    // Task 6: Categorize BMI
    // Instruction: Write a program that takes user input for a Body Mass Index (BMI) and categorizes it as follows: Underweight (<18.5), Normal weight (18.5-24.9), Overweight (25-29.9), Obese (30+). Print the category.
    // Expected Result: If the user input BMI is 22, the output should be "Normal weight."
    public static void categorizeBMI() {
        // Implementation here
        Scanner numm6= new Scanner (System.in);
        System.out.println("BMI daxil edin: ");
        int num6=numm6.nextInt();
        if (num6<18.5){
            System.out.println("Underweight");
        }
        else if (num6>=18.5 || num6<=24.9){
            System.out.println("Normal weight");
        }
        else if (num6>=25 || num6<=29.9){
            System.out.println("Overweight");
        }
        else if (num6>=30){
            System.out.println("Obese");
        }
    }

    // Task 7: Check Voting Eligibility
    // Instruction: Write a program that takes user input for an age and checks if the person is eligible to vote. The minimum age to vote is 18. Print "Eligible to vote." or "Not eligible to vote." accordingly.
    // Expected Result: If the user input age is 20, the output should be "Eligible to vote."
    public static void checkVotingEligibility() {
        // Implementation here
        Scanner numm7= new Scanner (System.in);
        System.out.println("Add your age: ");
        int num7=numm7.nextInt();
        if (num7>=18){
            System.out.println("Eligible to vote.");
        }
        else {
            System.out.println("Not eligible to vote.");
        }
    }

    // Task 8: Determine Days in Month
    // Instruction: Write a program that takes user input for a month number (1-12) and prints the number of days in that month. For February, print "28 or 29 days." Print "Invalid month" if the number is outside this range.
    // Expected Result: If the user input month is 2, the output should be "28 or 29 days."
    public static void determineDaysInMonth() {
        // Implementation here
        Scanner numm8= new Scanner (System.in);
        System.out.println("Add month number: ");
        int num8=numm8.nextInt();
        int[] num_8={1,3,5,7,8,10,12};
        if (num8>=1 || num8<=12){
            if (num8==2){
                System.out.println("28 or 29 days.");
            }
            else if (num8!=2){
                for(int n8: num_8){
                    if (num8==n8){
                        System.out.println("31 days.");
                    }
                    else {
                        System.out.println("30 days");
                    }
                }
            }
        }
        else {
            System.out.println("Invalid month number.");
        }
    }

    // Task 9: Check Temperature
    // Instruction: Write a program that takes user input for the temperature and prints a message based on the following conditions: Below 0: "Freezing", 0-10: "Very Cold", 11-20: "Cold", 21-30: "Warm", Above 30: "Hot".
    // Expected Result: If the user input temperature is 25, the output should be "Warm."
    public static void checkTemperature() {
        // Implementation here
        Scanner numm9= new Scanner (System.in);
        System.out.println("Add temperature: ");
        int num9=numm9.nextInt();
        if (num9<0){
            System.out.println("Freezing");
        }
        else if (num9>=0 || num9<=10){
            System.out.println("Very Cold");
        }
        else if (num9>=11 || num9<=20){
            System.out.println("Cold");
        }
        else if (num9>=21 || num9<=30){
            System.out.println("Warm");
        }
        else {
            System.out.println("Hot");
        }
    }

    // Task 10: Convert Number to Word
    // Instruction: Write a program that takes user input for a number (1-5) and prints the corresponding word in English (1 for "One", 2 for "Two", etc.). Print "Invalid number" if the number is outside this range.
    // Expected Result: If the user input number is 3, the output should be "Three."
    public static void convertNumberToWord() {
        // Implementation here
        Scanner numm10= new Scanner (System.in);
        System.out.println("Add number (1-5): ");
        int num10=numm10.nextInt();
        switch (num10){
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("four");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("Invalid number!");
        }
    }

    // Task 11: Switch String Input
    // Instruction: Write a program that takes user input for a string and prints "A" if the input is "aaaa", "B" if the input is "bbbb", and "C" if the input is "cccc". Print "Invalid input" for any other string.
    // Expected Result: If the user input is "aaaa", the output should be "A."
    public static void switchStringInput() {
        // Implementation here
        //-----------------------------------------------------------------------
    }

    public static void main(String[] args) {
        checkPositiveNumber();
        checkEvenOrOdd();
        categorizeAge();
        determineWeekdayOrWeekend();
        checkLeapYear();
        categorizeBMI();
        checkVotingEligibility();
        determineDaysInMonth();
        checkTemperature();
        convertNumberToWord();
        switchStringInput();
    }
}

