import java.util.Set;

public class P_8HashSet {
    public void hashSet() {

        Set<Integer> num = new java.util.HashSet<>();

        num.add(4);
        num.add(7);
        num.add(8);

        System.out.println(num);

        for (int i = 1; i <= 10; i++) {

            if (num.contains(i)) {

                System.out.println("\n\t" + i + "\t is found in set");

            }

        }

    }

    //Main method
    public static void main(String[] args) {

        P_8HashSet obj = new P_8HashSet();  //create object
        obj.hashSet();

    }

}
