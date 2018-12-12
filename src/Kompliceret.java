public class Kompliceret {

    public static void main(String[] args) {

        MyTimer.start();

        int n = 100000;

        for (int i = 0; i < n; i++) {
            if (i%10000==0) System.out.print(".");
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                     int x = i*j*k;
                }

            }

        }
        System.out.println();
        MyTimer.stop();

    }
}
