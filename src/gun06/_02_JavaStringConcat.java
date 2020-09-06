package gun06;

public class _02_JavaStringConcat {
    // bir string baska bir stringe eklenir

    public static void main(String[] args) {

        String isim = "Can";

        System.out.println(isim.concat( " " ).concat( "other string" ));       //putting space

        System.out.println( isim.concat( " mukemmel biridir." ) );

        System.out.println(isim + " is awesome!!!");

        System.out.println(isim);       //todo herhangi bir esitleme olmadigi icin isim ayni kalir. digerleri ssadece yazdirir...

    }




}
