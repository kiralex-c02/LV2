import javax.swing.*;
import java.util.Scanner;

public class WinterreifenpflichtDemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.print("Bitte geben sie die Temperatur ein: ");
            int temp = s.nextInt();
            System.out.print("Ist die Fahrbann nass? ja=1 nein=0: ");
            int wetRoad = s.nextInt();
            boolean wRoad = wetRoad == 1;
            if (isWinterreifenPflicht(temp, wRoad)) System.out.println("Winterreifenpflicht");
            else System.out.println("Keine Winterreifenpflicht");

        }catch (Exception e){
            System.out.println("Falsche Eingabe");
        }

    }

    public static boolean isWinterreifenPflicht(int temp, boolean wetRoad){
        if (wetRoad && temp < 10) return true;
        else if (!wetRoad && temp < 4) return true;
        else return false;
    }
}
