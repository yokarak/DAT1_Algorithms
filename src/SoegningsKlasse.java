import java.util.Arrays;

/**
 * Denne klasse demonstrerer linear search
 *
 * @author András Ács anac@easj.dk
 * @version 0.1
 *
 */

public class SoegningsKlasse {


    int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    /**
     * Denne constructor gør ikke særlig meget for tiden
     */
    public SoegningsKlasse() {
    }

    /**
     * Denne metode søger i instansens eget array intArr efter et tal
     * @param  x int
     * @return index int Dvs. hvilket plads i arrayet er tallet x er fundet på, funktionen returnerer -1, hvis ikke tallet er fundet i arrayet,
     */
    public int find(int x, int[] arr) {
        int index = -1;

        System.out.println("Jeg søger.");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int binarySearch(int x, int[] arr) {
        Arrays.sort(intArr); // Her sorterer jeg min array

        boolean exit = true;
        int arrayLength = arr.length;
        int index = arrayLength/2;

        while (exit) {
            if (arr[index]==x) { return index;}
            if (arr[index]>x) {
                // Søg i venstre
                index=index/2;
            }
            else {
                // Søg i højre
                index=index+index/2;
            }
        }


        return 0;
    }

    /**
     * Main metoden starter programmet
     * @param args Det er lige meget med args i dette tilfælde
     */
    public static void main(String[] args) {

        int x = 3;

        SoegningsKlasse search = new SoegningsKlasse();

        //int resultat = search.binarySearch(x);

        //System.out.println("Du søgte efter " + x + " og det er fundet på " + resultat + " pladsen.");


        /// Experiment

        int[] arr = new int[200000000];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = i*2;
        }

        int x2 = 200000000  ;

        long startTime = MyTimer.currentTimestamp();
        int result = search.find(x2, arr);
        long endTime = MyTimer.currentTimestamp();
        String resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println(x2 + " er fundet på " + result);
        System.out.println();
        System.out.println(resultat);


         startTime = MyTimer.currentTimestamp();
        result = search.binarySearch(x2, arr);
        System.out.println(x2 + " er fundet på " + result);
         endTime = MyTimer.currentTimestamp();
         resultat = MyTimer.timeElapsed(startTime, endTime) ;
        System.out.println();
        System.out.println(resultat);


    }

}
