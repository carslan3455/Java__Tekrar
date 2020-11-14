package gun14;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        // Given a string print every character in new line
        // 01234
        // str = "Hello"
        // length = 5
        // H
        // e
        // l
        // l
        // o

        String str1 = "Ola amigo";

        //        HARD CODE
//        System.out.println(str.charAt( 0 ));
//        System.out.println(str.charAt( 1 ));
//        System.out.println(str.charAt( 2 ));
//        System.out.println(str.charAt( 3 ));
//        System.out.println(str.charAt( 4 ));

        Scanner sc = new Scanner(System.in);
        System.out.print("String giriniz : ");
        String str = sc.nextLine();

        System.out.println("String uzunlugu : " + str.length());

        for (int i = 0; i < str.length(); i++) {

            System.out.println(str.charAt(i));

        }
    }
}
