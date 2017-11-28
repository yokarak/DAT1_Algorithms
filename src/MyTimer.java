
public class MyTimer {


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
