package gun09;

public class PrimitiveToString {

    public static void main(String[] args) {

        // double to String

        double v = 10.99;
        String s = String.valueOf(v);
        String s1 = Double.toString(v);

        System.out.println("S: " + s);
        System.out.println("S1: " + s1);

        System.out.println("s equals s1: " + s.equals(s1));     // true

        // float ve int da ayni sekilde oluyor
       // String s1 = Float.toString(v);
        //String s1 = Integer.toString(v);






    }
}
