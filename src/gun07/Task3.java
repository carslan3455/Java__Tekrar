package gun07;

public class Task3 {
    //  Write a Java program to replace all the 'd' characters with 'f' characters
    //      input: The quick brown fox jumps over the lazy dog.
    //      output: The quick brown fox jumps over the lazy fog.

    public static void main(String[] args) {

        // todo part-1
        String input = "The quick brown fox jumps over the lazy dog.";

        String output = input.replaceAll("d","f");

        System.out.println("input : "+ input);
        System.out.println("output : "+ output);

        System.out.println("********************************************");

        // todo part-2
        // part 2: input: The quick brown fox jumps over the lazy dog.
        // replace all the 'a','t','e' characters with 'f'

        // 1.Yöntem
        String output2 = input.replaceAll("[a,t,e]","f");

        System.out.println("input : "+ input);
        System.out.println("output2 : "+ output2);
        System.out.println("********************************************");

        // 2.Yöntem

        System.out.println("output2 : "+input.replace("a","f").replace("t","f").replace("e","f"));

        // todo part-3
        // part 3:
        // replace all the 'o','q','r' characters with 'L' using regex

        System.out.println("output3 : " + input.replaceAll("[o,q,r]","L"));

        // todo part 4:
        // replace all the different characters then 'o','q','r' characters with 'T' using regex

        System.out.println("output4 : " + input.replaceAll("[^o,q,r]","T"));

    }
}
