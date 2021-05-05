import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P_6ArrayIndex {
    public static class SpecificIndexArrayList {

    /*
    6. Write a Java program to retrieve an element (at a specified index) from a given
       array list
     */

        //Static method with parameter
        public static void specificIndex(int index) {

            List<Integer> list = new ArrayList<Integer>();

            list.add(23);
            list.add(46);
            list.add(90);
            list.add(89);
            list.add(83);
            list.add(30);
            list.add(3);
            list.add(23);
            list.add(1);
            list.add(5);

            for (int n : list) {

                System.out.println(n);
            }
            System.out.println("\nArrayList : " + list);
            System.out.println("Size of ArrayList : " + list.size());
            System.out.println("value at Index " + index + " is : " + list.get(index));
        }

        //Main method
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in); //Scanner object
            System.out.print("Enter the index: \t");
            int index = input.nextInt();
            specificIndex(index); //call specificIndex method direct
        }


    }
}
