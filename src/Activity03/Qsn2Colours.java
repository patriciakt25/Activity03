package Activity03;

import java.util.*;

public class Qsn2Colours {
    public static void main (String[]args){
        ArrayList<String> colours = new ArrayList<>();
        colours.add("Red");
        colours.add("Blue");
        colours.add("White");
        colours.add("Pink");
        colours.add("Purple");

        Collections.reverse (colours);// for reverse printing
        System.out.println(colours);

    }
}
