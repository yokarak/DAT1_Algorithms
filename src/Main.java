import java.util.Date;

/*
* This is a tiny library for testing how long a given algorithm takes to execute
*
* Usage:
* 1) replace myAlgorithm() with your own algorithm
* 2) change N to test, how long it takes to execute your code
*
* Be aware: You are likely to crash your apps :)
*
* See results of my exexution:
* https://docs.google.com/spreadsheets/d/1bNa1zfQ4yqkKcMb42Kh8lSZjfu97V9hx9i1qyvlfAtw/edit#gid=0
*
* Written by András Ács anac@easj.dk in 2017
*
* */
public class Main {

    private static final int N = 350; // Change the value of N for more or less iterations

    public static void main(String[] args) {

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

        myAlgorithm(); // Replace this with your own algorithm

        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);
    }


    /**
     * This is the algorithm, we are testing in the main method
     */
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

    }
}
