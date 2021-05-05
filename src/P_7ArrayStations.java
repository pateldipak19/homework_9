import java.util.ArrayList;
import java.util.List;

public class P_7ArrayStations {
    public void underGroundTube() {

        List<String> list = new ArrayList<String>();

        list.add("BakerLoo");
        list.add("Victoria");
        list.add("Hammersmith & City");
        list.add("Central");
        list.add("Circle");
        list.add("District");
        list.add("Jubilee");
        list.add("Metropolitan");
        list.add("Northern");
        list.add("Piccadilly");
        list.add("");


        System.out.println("\nArrayList :" + list);

        if (list.isEmpty()) {

            System.out.println("\nArrayList is empty");
        } else {

            System.out.println("\nArrayList is not empty");
        }

    }

    //Main method
    public static void main(String[] args) {

        P_7ArrayStations obj = new P_7ArrayStations();  //Create object
        obj.underGroundTube(); //call underGroundTube method via empty object

    }

}
