import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P_5ArrayIterator {

    public void iteratorArray() {

        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(40);
        list.add(60);
        list.add(10);
        list.add(120);
        list.add(90);
        list.add(20);
        list.add(110);
        list.add(530);
        list.add(740);

        Iterator itr = list.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());
        }

        System.out.println("ArrayList = " + list);
    }

    //Main method
    public static void main(String[] args) {

        P_5ArrayIterator obj = new P_5ArrayIterator(); //create object
        obj.iteratorArray(); //call iteratorArray method via array object
    }

}
