package gun08;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
       // Write a Java program to break an integer into a sequence of individual digits.
        // Hint: use / and %
        // ex: input: 12345
        //    output: 1
        //            2
        //            3
        //            4
        //            5


        int sayi = 12345;

        // todo 1. Yöntem
        int birler=sayi%10;
        int onlar=(sayi/10)%10;
        int yuzler=(sayi/100)%10;
        int binler=(sayi/1000)%10;
        int onbinler=(sayi/10000);
        System.out.println(onbinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler);

        System.out.println("*******************************");

        // todo 2.Yöntem
        String sayiStr=sayi+"";
        String [] x=sayiStr.split("");
        for (String n:x) {
            System.out.println(Integer.parseInt(n));
        }

        System.out.println("*******************************");

        // todo 3.Yöntem
        System.out.print("Sayi Giriniz : ");
        int num = new Scanner(System.in).nextInt();
        while (num>0){
            int len = (""+num).length()-1;
            int mod = (int)Math.pow(10,len);
            System.out.println(num / mod);
            num %= mod;
        }


    }
}
