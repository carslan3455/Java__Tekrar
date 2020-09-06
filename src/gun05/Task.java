package gun05;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        int a = sc.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int b = sc.nextInt();

        int toplam = a+b;
        // Mesala  a=5  b=7 olsun
        System.out.println("Toplam: " + toplam);     //   Toplam: a + b nin sonucunun verir                        Toplam: 12
        System.out.println("Toplam: " + (a+b));     //   Toplam: a + b nin sonucunun verir                         Toplam: 12
        System.out.println("Toplam: " + a+b);    // concatanation= ekleme islemi String algilayip yanyana yazar    Toplam: 57


    }
}
