import java.math.BigInteger;
import java.util.Scanner;

public class CalcFaculty {
    public static void main(String[] args) {
        int number = 2;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter base number for faculty < 20: ");
            number = sc.nextInt();
        }catch (Exception e) {
            System.out.println("Please enter a number");
        }

        calcFaculty(number);
        calcFaculty(10);
        calcFaculty(5);


    }

    public static void calcFaculty(int num){
        int cnt = 1;
        //can only hold values up to 20
        long faculty = 1;
        while (cnt <= num) {
            faculty *= cnt;
            cnt++;
        }
        System.out.printf("Faculty of %d = %d ", num, faculty);
    }

}
