package gun08;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        // Write a Java program that multiplies four integers and  print result

        int a = 10;
        int b = 7;
        int c = 36;
        int d = 15;

        int carpim = a*b*c*d;
        System.out.println("Carpim sonuc = "+  carpim);


        //part 2: use scanner to provide numbers

        Scanner sc = new Scanner(System.in);

        System.out.print("1.Sayiyi giriniz: ");
        int sayi1 = sc.nextInt();

        System.out.print("2.Sayiyi giriniz: ");
        int sayi2 = sc.nextInt();

        System.out.print("3.Sayiyi giriniz: ");
        int sayi3 = sc.nextInt();

        System.out.print("4.Sayiyi giriniz: ");
        int sayi4 = sc.nextInt();

        int carpimSonuc = sayi1*sayi2*sayi3*sayi4;

        System.out.println("Scanner sayi carpim : " + carpimSonuc);


    }
}
