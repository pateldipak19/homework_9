import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_10LinePassThrough {
    static List<TrainData> mainList = new ArrayList<>();

    //Main Method
    public static void main(String[] args) {

        List<String> tubeList = new ArrayList<String>();
        tubeList.add("Northern");
        TrainData td = new TrainData("Balsham", tubeList);
        mainList.add(td);

        List<String> tubeList1 = new ArrayList<String>();
        tubeList1.add("Circle");
        tubeList1.add("Hammersmith & City");
        tubeList1.add("Metropolitan");
        TrainData td1 = new TrainData("Barbican", tubeList1);
        mainList.add(td1);

        List<String> tubeList2 = new ArrayList<String>();
        tubeList2.add("District");
        tubeList2.add("Hammersmith & City");
        TrainData td2 = new TrainData("Barking", tubeList2);
        mainList.add(td2);

        List<String> tubeList3 = new ArrayList<String>();
        tubeList3.add("Central");
        TrainData td3 = new TrainData("Barkingside", tubeList3);
        mainList.add(td3);

        List<String> tubeList4 = new ArrayList<String>();
        tubeList4.add("Piccadilly");
        tubeList4.add("District");
        TrainData td4 = new TrainData("Barons Court", tubeList4);
        mainList.add(td4);

        List<String> tubeList5 = new ArrayList<String>();
        tubeList5.add("Circle");
        tubeList5.add("District");
        TrainData td5 = new TrainData("Bayswater", tubeList5);
        mainList.add(td5);

        List<String> tubeList6 = new ArrayList<String>();
        tubeList6.add("Jubilee");
        TrainData td6 = new TrainData("Canons Park", tubeList6);
        mainList.add(td6);

        List<String> tubeList7 = new ArrayList<String>();
        tubeList7.add("Bakerloo");
        tubeList7.add("Northern");
        TrainData td7 = new TrainData("Charing Cross", tubeList7);
        mainList.add(td7);

        List<String> tubeList8 = new ArrayList<String>();
        tubeList8.add("Northern");
        tubeList8.add("District");
        tubeList8.add("Circle");
        TrainData td8 = new TrainData("Embankment", tubeList8);
        mainList.add(td8);

        List<String> tubeList9 = new ArrayList<String>();
        tubeList9.add("Central");
        tubeList9.add("Waterloo & City");
        TrainData td9 = new TrainData("Bank", tubeList9);
        mainList.add(td9);

        char ans;
        do {
            boolean found = false;

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the Station name : ");
            String station = input.nextLine();

            for (int i = 0; i < mainList.size(); i++) {

                if (mainList.get(i).getStationName().equalsIgnoreCase(station)) {
                    found = true;
                    List<String> subTube = mainList.get(i).getTubeList();
                    System.out.println(mainList.get(i).tubeList);

                    for (int k = 0; k < subTube.size(); k++) {
                        System.out.println(subTube.get(k));
                    }
                }
            }

            if (!found) {
                System.out.println("No data available");
            }
            System.out.println("Would you like to get more information?" +
                    "\nIf yes than enter Y or no than enter N");
            ans = input.next().charAt(0);

        } while (ans == 'y');
    }

}

class TrainData {

    //Instance variable
    String stationName;

    List<String> tubeList = new ArrayList<String>();

    //Constructor
    public TrainData(String stationName, List<String> tubeList) {
        this.stationName = stationName;
        this.tubeList = tubeList;
    }

    //getter method
    public String getStationName() {
        return stationName;
    }

    //setter method
    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    //getter method
    public List<String> getTubeList() {
        return tubeList;
    }

    //setter method
    public void setTubeList(List<String> tubeList) {
        this.tubeList = tubeList;
    }

}


