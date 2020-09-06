package gun06;

public class _04_JavaStringEquals {
     /*
    equals()

    Compares two strings. Returns true if the strings are equal, and false if not
    todo = iki stringi karsilastirir eger esitlerse true degilse false dondurur.
    todo   buyuk-kucuk harf hassasiyeti var
    todo  boolean  dondurur
    */

    public static void main(String[] args) {
        String t1 = "Hello";
        String t2 = "Bonjour";

        System.out.println(t1.equals( t2 ));            //  t1 = t2 mi?  hayir       false
        System.out.println(t1.equals( "Hello"));        // t1= Hello mu?  evet       true

        System.out.println( t1.equals( "hello" ) );     // t1 = hello mu?  hayir     false

    }

}
