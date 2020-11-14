package gun08;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
       // Beden Kite İndeksi = Kilo / Boy(m) * Boy(m)
        // Write a Java program to compute body mass index (BMI).
        // BMI: The BMI is defined as the body mass divided by the square of the body height,
        //      and is universally expressed in units of kg/m2,
        //      resulting from mass in kilograms and height in metres.
        //Scanner kullanarak yapin.


        Scanner sc = new Scanner(System.in);
        System.out.print("Kilonuz : ");
        double kilo = sc.nextDouble();

        System.out.print("Boyunuz : ");
        double boy = sc.nextDouble();

        double bki = kilo/(boy*boy);

        System.out.println("BKI : " + bki);



    }
}
