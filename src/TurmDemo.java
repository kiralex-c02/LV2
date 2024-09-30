import java.util.Scanner;

public class TurmDemo {
    public static void main(String[] args) {
        int cnt = 2;
        int number = 2;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Bitte Zahl für Tumrechnung eingeben: ");
            number = sc.nextInt();
        }catch (Exception e) {
            System.out.println("Enter valid number");
        }

        //Multiplizieren
        while (cnt < 10){
            System.out.println(number + "*" + cnt + " = " + number*cnt);
            number *= cnt;
            cnt++;
        }

        //Dividieren
        cnt -= 1;
        while (cnt > 0){
            System.out.println(number + "/" + cnt + " = " + number/cnt);
            number /= cnt;
            cnt--;
        }
    }


}
