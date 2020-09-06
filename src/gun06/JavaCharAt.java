package gun06;

public class JavaCharAt {
      /*
     charAt()
     Returns the character at the specified index (position)
     spesifik bir indexteki karakteri alir.

    char
     */

    public static void main(String[] args) {
        String text = "Google";
        System.out.println(text.charAt(5)); // e
        System.out.println(text.charAt(6)); //  todo sinir asimi hatasi  =  IndexOutOfBoundsExeption  hatasi

        System.out.println(text.charAt( -1 )); // todo Negatif deger girilirse  =  IndexOutOfBoundsExeption  hatasi
    }
}
