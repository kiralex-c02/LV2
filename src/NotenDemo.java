import java.util.InputMismatchException;
import java.util.Scanner;

public class NotenDemo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Wieviele Punkte wurden bei der Prüfung erreicht?: ");

        try {
            int points = s.nextInt();
            System.out.println("Erreichte Note: " + getNotentext(points));
        }catch (InputMismatchException e){
            System.out.println("Bitte eine Zahl eingeben!");
        }
    }

    public static String getNotentext(int punkte){
        if(punkte <= 50) return "Ungenügend";
        else if (punkte <= 64) return "Genügend";
        else if (punkte <= 77) return "Befriedigend";
        else if (punkte <= 89) return "Gut";
        else return "Sehr gut";
    }



}
