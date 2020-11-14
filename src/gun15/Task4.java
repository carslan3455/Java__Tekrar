package gun15;

public class Task4 {
    /*
     *           1
     * *         2
     * **        3
     * ***       4
     * ****      5  tersten yazdiralim
     */

    public static void main(String[] args) throws InterruptedException {


        for (int i = 5; i >=1; i--) {
            for (int j = 5; j >=1; j--) {
                if (j<=i){
                //    Thread.sleep(1000);
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
