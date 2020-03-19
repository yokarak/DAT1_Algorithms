import java.util.ArrayList;
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
* See results of my execution:
* https://docs.google.com/spreadsheets/d/1bNa1zfQ4yqkKcMb42Kh8lSZjfu97V9hx9i1qyvlfAtw/edit#gid=0
*
* Written by András Ács anac@easj.dk in 2017
*
* */
public class Main {

    private static final int N = 700; // Change the value of N for more or less iterations
    private static int[] numberArray = {4,8,90,55,40,950,33,40,11,6};
    public static void main(String[] args) {

        long startTime = MyTimer.currentTimestamp();

        Date date=new Date(startTime);
        System.out.println("Time is " + date.toString() + " (" + date.getTime() + ")\n");
        System.out.println("Calculation starting.");

       // myAlgorithm(); // Replace this with your own algorithm
        //complex();
        // bubbleSort(numberArray);
        //selectionSort(numberArray);
        shellsort(numberArray);
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
            System.out.print(".");
        }

    }

    public static void complex() { //The algorithm took 17716 milliseconds to execute.
        long resultat = 0;
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N*10; j++) {
                System.out.println("Hey - I'm busy looking at: " + i*j*N);
                for (int x = 1; x <=N*100; x++) {
                    resultat=+1;
                }
            }
        }
        System.out.println(resultat);
    }

    public static void bubbleSort(int[] array) { //The algorithm took 35 milliseconds to execute.
        int i, j, n =array.length;
        for (i=0; i<n; i++) {
            for (j=i+1; j < n; j++)
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                } }
    }
    public static void selectionSort(int[] array) { //The algorithm took 42 milliseconds to execute.
        int i, j, min, n =array.length;
        for (i=0; i < n; i++) {
            min = i;
            for (j = i+1; j < n; j++ ) {
                if (array[min] > array[j]) {
                    min = j;
                }
                int temp = min;
                min = i;
                i = temp;
            }
        }
    }
    private static int[] shellsort(int[] array) {  //The algorithm took 38 milliseconds to execute.
        int h = 1, j, i;
        while (h <= array.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (i = 0; i < array.length; i++) {
                int temp = array[i];
                for (j = i; j > h - 1 && array[j - h] >= temp; j = j - h) {
                    array[j] = array[j - h];
                }
                array[j] = temp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }


}
