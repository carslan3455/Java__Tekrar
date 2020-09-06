package gun06;

public class _03_JavaStringContains {
    /*
    contains()

    Checks whether a string contains a sequence of characters
    String icinde bir karakter dizisi olup olmadigini kontrol eder.

    todo =     boolean   sonuc verir
     */

    public static void main(String[] args) {

        String t2 = "Good morning!!!";

        System.out.println( t2.contains ( "mor" ) );  // karakter dizisi varsa  = true
        System.out.println( t2.contains( "morin" ) ); // karakter dizisi yoksa  = false
                                                      // mor var in de var ama siralama onemli dizi seklinde ayni olamli
        System.out.println( t2.contains( "Mor" ) );   // karakter dizisi yoksa  = false




    }

}
