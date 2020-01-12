package explicaciones.basic;

import java.io.IOException;

public  class Fors {

    public static void main (String... argss) throws IOException {

        String myStr = "good";
        char[] myCharArr = {'g','o','o','d'};
        String newSTr = null;
        for (char ch : myCharArr) {
            newSTr = newSTr + ch;
            System.out.println(newSTr);
        }
        System.out.println((newSTr == myStr) + " " + (newSTr.equals(myStr)));

    }

}

 class b extends Fors {

    public static float main () {
        return 0f;
    }
}