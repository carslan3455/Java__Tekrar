package gun5;

import java.util.Scanner;

public class JavaScanner {

    public static void main(String[] args) {

//    String  -> texts
//    byte    -> whole numbers
//    short   -> whole numbers
//    int     -> whole numbers
//    long    -> whole number;
//    boolean -> true false
//    double  -> decimal numbers
//    float   -> decimal numbers
//    char    -> character          // todo char Scannerdan alamiyoruz ancak nextLine ile string olarak alabiliriz

        /*
    Scanner:
        Scanner is a class for getting the input of the primitive types like int , boolean
            and also String..   It is the easiest way to read input in the java programing.
 */
        int a = 1;
        System.out.println(a);

        Scanner girdi = new Scanner(System.in);
        // system in is an InputStream which is typically connected to keyboard input of console programs.

        System.out.println("Bir kullanici adi giriniz: ");
        String kullaniciAdi = girdi.nextLine();
        System.out.println("Kullanici Adi: " + kullaniciAdi);
        System.out.println("-------------------------------");
        System.out.println("Bir kullanici Soyadi giriniz: ");
        String kullaniciSoyAdi = girdi.nextLine();
        System.out.println("Kullanici SoyAdi: " + kullaniciSoyAdi);
        System.out.println("-------------------------------");
        System.out.println("Bu kullanici icin Adres giriniz: ");
        String kullaniciAdresi = girdi.nextLine();
        System.out.println("Kullanici Adresi: " + kullaniciAdresi);
        System.out.println("-------------------------------");
        System.out.println("Bu kullanici posta kodu giriniz: ");
        String kullaniciPostaKodu = girdi.nextLine();
        System.out.println("Kullanici Posta Kodu: " + kullaniciPostaKodu);
        System.out.println("-------------------------------");
        System.out.println("Bu kullanicinin yasini integer olarak giriniz: ");
        int kullaniciYasi = girdi.nextInt();
        System.out.println("Kullanici Yasi: " + kullaniciYasi);

        girdi.nextLine(); // Trick yapiyorum tarayicima ***

        System.out.println("-------------------------------");
        System.out.println("Bu kullanicinin Sehrini giriniz: ");
        String kullaniciSehri = girdi.nextLine();
        System.out.println("Kullanici Sehri: " + kullaniciSehri);

        System.out.println("-------------------------------");
        System.out.println("Biletiniz cift yonlu mu olsun?(True/False): ");
        boolean biletCiftYonluMu = girdi.nextBoolean();
        // = sag tarafindaki yeri yazinca Ctrl+C basip ardindan Ctrl+Alt+V tusu ile otomatik =  in sol taraftaki kisim olusuyor
        System.out.println("Biletiniz cift yon mu?: " + biletCiftYonluMu);


        System.out.println("-------------------------------");
        System.out.println("Biletiniz ucreti icin max rakam (Double giriiz) : ");
        double biletUcreti = girdi.nextDouble();
        System.out.println("Biletiniz max rakam: " + biletUcreti);



        System.out.println("-------------------------------");
        System.out.println("Biletiniz ucreti icin max rakam (Float giriiz) : ");
        float biletUcretiFloat = girdi.nextFloat();
        System.out.println("Biletiniz max rakam: " + biletUcretiFloat);

        System.out.println("-------------------------------");
        System.out.println("Toplam miktar bilet icin : ");
        short biletTplm  = girdi.nextShort();
        System.out.println("Toplam miktar bilet icin : " + biletTplm);

        System.out.println("Kac bilet almak istiyorsunuz?: ");
        byte toplamBiletSayisi = girdi.nextByte();
        System.out.println("Toplam bilet Sayiniz: "+ toplamBiletSayisi);

       // todo Scanner da char kullanamiyoruz...




    }
}
