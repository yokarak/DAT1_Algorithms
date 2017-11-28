import java.util.Date;
public class Main {

    private static final int N = 300;

    public static void main(String[] args) {

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        myAlgorithm();

        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println(resultat);
    }

    private static void myAlgorithm() {
        for (int i = 0; i <N ; i++) {
            if (i%10==1) System.out.print(".");
            long dummy = (((i ^ 2) * 3) - 5);
            for (int j = 0; j < N; j++) {
                dummy = (long) Math.sqrt(j * i);
                for (int k = 0; k < N; k++) {
                    long dummy2 = (long) Math.random();
                    long res = k * i * j * dummy2;
                }
            }
        }
        System.out.println();
    }
}
