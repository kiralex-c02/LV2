import java.util.Scanner;

public class TempCalc {
    public static void main(String[] args) {
        double temp = 0;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Please enter temperature: ");
            temp = sc.nextDouble();
        }catch (Exception e) {
            System.out.println("Please enter number in valid format e.g. 13,5");
        }
        System.out.printf("Celsisus %.2f to fahrenheit %.2f\n", temp, celsius2Fahrenheit(temp));
        System.out.printf("Fahrenheit %.2f to celsius %.2f", celsius2Fahrenheit(temp), fahrenheit2Celsius(celsius2Fahrenheit(temp)));
    }

    public static double celsius2Fahrenheit(double temp) {
        return temp * 1.8 + 32;
    }

    public static double fahrenheit2Celsius(double temp) {
        return (temp - 32) * 5 / 9;
    }
}
