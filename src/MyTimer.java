/**
 * Denne hjælpeklasse hjælper med at tage tid på kodeeksekvering
 *
 * @author andrasacs
 * @version 1.0
 *
 */
public class MyTimer {

    /**
     * Denne metode skriver tiden til konsollen
     * */
    public static void timestamp2Console(){
        long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);
        //return System.nanoTime();
    }

    public static long currentTimestamp(){
        long timeStamp = System.currentTimeMillis();
        return timeStamp;
    }

    public static String timeElapsed(long start, long end) {
        long elapsedTime =  end-start;
        return "The algorithm took " + elapsedTime + " milliseconds to execute.";
    }
}
