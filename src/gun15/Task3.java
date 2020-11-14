package gun15;

public class Task3 {
    //TODO
    // Write program using nested loops that prints:
    // *
    // **
    // ***
    // ****
    // *****

    public static void main(String[] args) throws InterruptedException {


        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j<=i){
                 //   Thread.sleep(1000);
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
