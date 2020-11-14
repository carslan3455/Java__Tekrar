package gun08;


import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.
            // formula
        // (32°F − 32) × 5/9 = 0°C
        // c = (f-32)*5/9

        // Scanner kullanin

        Scanner sc = new Scanner(System.in);
        System.out.print("Fahrenheit degerini giriniz: ");
        int fahrenheit = sc.nextInt();


        int celsius = (fahrenheit-32)*5/9;

        System.out.println("Celsius donusum: " + celsius+"°C");


    }
}
