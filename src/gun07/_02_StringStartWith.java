package gun07;

public class _02_StringStartWith {
    /*
    startWith
        Checks whether a string starts with specified characters

       Donusum =  boolean


     */

    public static void main(String[] args) {

        String text = "Hello world";

        System.out.println("is text starts with Hello : " + text.startsWith("Hello"));     // true
        System.out.println("is text starts with hello : " + text.startsWith("hello"));     // false
        System.out.println("is text starts with wor : " + text.startsWith("wor"));         // false



    }

}
