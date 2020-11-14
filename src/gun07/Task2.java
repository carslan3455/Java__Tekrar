package gun07;

public class Task2 {
    // print your name in "UPPERCASE" and surname in "lowercase

    public static void main(String[] args) {

        // part 1
        // using text "software DEV inc"
        // fix it to "SOFTWARE DEV inc"
        // hint: use substring

        // todo 1.Yöntem
        String text = "software DEV inc";
      //  int a=text.indexOf(" ");   bu kod kullanilabilir   ilk bosluk karakterini bulur
        String newText = text.substring(0,8).toUpperCase()+text.substring(8);

        System.out.println(" Yeni text : "+newText);


        // todo 2.Yöntem
        String [] a=text.split(" ");
        String son="";
        a[0]= a[0].toUpperCase();
        for (String n :a ) {
            son+= n+" ";
        }
        System.out.println(son);
    }



}
