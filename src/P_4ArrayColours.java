import java.util.ArrayList;
import java.util.List;

public class P_4ArrayColours {
    public void coloursArray() {

        List<String> list = new ArrayList<String>();
        list.add("Orange");
        list.add("Blue");
        list.add("Pink");
        list.add("White");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Burgundy");
        list.add("Peach");
        list.add("Gray");

        for (String n : list) {

            System.out.println(n);
        }

        System.out.println("\n ArrayList of different colours : " + list);
    }

    //Main method
    public static void main(String[] args) {

        P_4ArrayColours obj = new P_4ArrayColours(); //create object
        obj.coloursArray();  //call method coloursArray by clr object
    }

}


