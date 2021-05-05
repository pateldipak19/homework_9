
import java.util.Map;

public class P_9HashMap {

    public void hashMap() {

        Map<String, Integer> people = new java.util.HashMap<String, Integer>();

        people.put("John", 45);
        people.put("Carry", 34);
        people.put("James", 6);
        people.put("Peter", 98);
        people.put("Anna", 3);
        people.put("Elizabeth", 79);

        //System.out.println(people);

        for (String i : people.keySet()) {

            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }

    //Main method
    public static void main(String[] args) {

        P_9HashMap obj = new P_9HashMap();  //create object
        obj.hashMap(); //call hashMap method via map object
    }

}
