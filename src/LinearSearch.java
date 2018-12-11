/**
 * Denne klasse demonstrerer linear search
 *
 * @author András Ács anac@easj.dk
 * @version 0.1
 *
 */

public class LinearSearch {


    int[] intArr = {1, 4, 5, 43, 23, 1, 8, 5, 233, 132, 435, 345, 343, 236, 234,  231 };

    /**
     * Denne constructor gør ikke særlig meget for tiden
     */
    public LinearSearch() {
    }

    /**
     * Denne metode søger i instansens eget array intArr efter et tal
     * @param  x int
     * @return index int Dvs. hvilket plads i arrayet er tallet x er fundet på, funktionen returnerer -1, hvis ikke tallet er fundet i arrayet,
     */
    public int find(int x) {
        int index = -1;

        System.out.println("Jeg søger.");

        for (int i = 0; i < intArr.length; i++) {
            if(intArr[i]==x) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     * Main metoden starter programmet
     * @param args Det er lige meget med args i dette tilfælde
     */
    public static void main(String[] args) {

        int x = 5;

        LinearSearch ls = new LinearSearch();

        int resultat = ls.find(x);

        System.out.println("Du søgte efter " + x + " og det er fundet på " + resultat + " pladsen.");

    }

}
