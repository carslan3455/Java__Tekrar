package gun08;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Write a Java program that print the average of three integers:
        // a, b, c (a = 5, b= 3, c= 2)
        // output:
        // (a+b+c)/3 = 3.33333333333

        int a = 5;
        int b = 3;
        int c = 2;

        double ort = (a+b+c)/3.0;

        System.out.println("Ortalam : "+ ort);



        // part 2: provide numbers using scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("1.Sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.println("2.Sayı: ");
        int sayi2 = scanner.nextInt();

        System.out.println("3.Sayı: ");
        int sayi3 = scanner.nextInt();


        System.out.println("Ortalama = " + (sayi1+sayi2+sayi3)/3.0);



    }
}
