import java.util.Scanner;
import java.util.SortedMap;

public class Homework {
    public static void main(String[] args){
        Scanner info= new Scanner (System.in);
        System.out.println("Fin kodu daxil et: ");
        String info2 = info.nextLine();
        System.out.println("Information you enter: " + info2);

        switch (info2) {
            case "aaaa":
                System.out.println("Your result: ");
                System.out.println("A");
                break;
            case "bbbb":
                System.out.println("Your result: ");
                System.out.println("B");
                break;
            case "cccc":
                System.out.println("Your result: ");
                System.out.println("C");
                break;
            case "dddd":
                System.out.println("Your result: ");
                System.out.println("D");
                break;
            case "eeee":
                System.out.println("Your result: ");
                System.out.println("E");
                break;
            case "ffff":
                System.out.println("Your result: ");
                System.out.println("F");
                break;
            default:
                System.out.println("Try again!");


        }
        Scanner num1=new Scanner( System.in);
        System.out.println("Index-i daxil edin: ");
        int num=num1.nextInt();
        int [][] studentId_and_old={{00,01,10,11},{25,20,22,30}};
        String [][] student_fname_and_lname={{"AAA","BBB","CCC","DDD"},{"aaa","bbb","ccc","ddd"}};
        System.out.println("StudentId: " + studentId_and_old[0][num] + "\nStudentold: " + studentId_and_old[1][num] + "\nStudentfname: " + student_fname_and_lname[0][num] + "\nStudentlname: " + student_fname_and_lname[1][num] );
    }
}
