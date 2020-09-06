package gun06;

public class _05_JavaStringEqualsIgnoreCase {
    /*
       equalsIgnoreCase()

       Compares two strings, ignoring case considerations


        todo   buyuk-kucuk harf hassasiyeti yok esit mi diye bakar
        todo     boolean  dondurur
        */
    public static void main(String[] args) {
        String t1 = "Hello";
        String t2 = "Bonjour";

        System.out.println(t1.equalsIgnoreCase( t2 ));                     // t1=t2 mi?      false
        System.out.println(t1.equalsIgnoreCase( "Hello"));      // t1=Hello mu?   true

        System.out.println( t1.equalsIgnoreCase( "hello" ) );   // t1=hello mu?    true
                                                                        // todo kucuk buyuk harf gözetmeden baktigi icin true
    }
}
