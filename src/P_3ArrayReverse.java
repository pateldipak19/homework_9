import java.util.*;
public class P_3ArrayReverse {
    public static class ReverseArray {


        public static void reverse() {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the value for length of array: \t");
            int length = scanner.nextInt();
            int arr[] = new int[length];
            for (int i = 0; i < length; i++) {
                System.out.println("Enter the value of index " + i + " for array");
                System.out.println(arr[i] = scanner.nextInt());
            }
            System.out.println("Original Array : \t" + Arrays.toString(arr));
            int i = 0;
            int arr1[] = new int[length];
            for (int j = arr.length - 1; j >= 0; j--) {

                arr1[j] = arr[i];
                i++;
            }
            System.out.println("Reverse Array : \t" + Arrays.toString(arr1));

        }

        //Static method
        public static void reverseArrayList() {

            List<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(34);
            list.add(43);
            list.add(62);
            list.add(8);
            list.add(2);
            list.add(93);
            list.add(23);

            System.out.println("\n Original Arraylist : \t" + list);
            Collections.reverse(list);
            System.out.println("Reverse Arraylist : \t" + list);


        }

        //Main method
        public static void main(String[] args) {
            reverse();//Call reverse method in main method
            reverseArrayList();  //Call reverseArraylist method

        }
    }
}
