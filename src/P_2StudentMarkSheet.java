import java.util.Scanner;

public class P_2StudentMarkSheet {

    String result, grade;
    int total, percentage;


    public void studentResult(String studentName, int rollNo, int mathsMarks, int scienceMarks, int englishMarks) {

        total = mathsMarks + scienceMarks + englishMarks;
        percentage = total * 100 / 300;

        if (mathsMarks >= 35 && scienceMarks >= 35 && englishMarks >= 35 && percentage >= 35) {

            result = "Pass";

        } else {

            result = "Fail";
        }
        if (percentage >= 80) {
            grade = "A+";

        } else if (percentage >= 60 && percentage < 80) {

            grade = "A";

        } else if (percentage >= 50 && percentage < 60) {

            grade = "B";

        } else if (percentage >= 35 && percentage < 50) {

            grade = "C";

        }


        String addStr = "|_______________________________|";
        System.out.println(" _______________________________");
        System.out.println("|                               |");
        System.out.println("|        Mark Sheet             |");
        System.out.println(addStr);
        System.out.println("|        Name   : " + "\t" + studentName + "\t\t|");
        System.out.println("|       Roll No : " + "\t" + rollNo + "\t\t\t|");
        System.out.println(addStr);
        System.out.println("|        Math   : " + "\t" + mathsMarks + "\t\t\t|");
        System.out.println("|       Science : " + "\t" + scienceMarks + "\t\t\t|");
        System.out.println("|       English : " + "\t" + englishMarks + "\t\t\t|");
        System.out.println(addStr);
        System.out.println("|       Total   : " + "\t" + total + "\t\t\t|");
        System.out.println(addStr);
        System.out.println("|    Percentage : " + "\t" + percentage + "\t\t\t|");
        System.out.println("|       Result  : " + "\t" + result + "\t\t|");
        System.out.println("|       Grade   : " + "\t" + grade + "\t\t\t|");
        System.out.println(addStr);


    }


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student name: ");
        String studentName = input.nextLine();
        System.out.println("Enter student Roll number: ");
        int rollNo = input.nextInt();

        System.out.println("Enter Maths subject marks: ");
        int mathsMarks = input.nextInt();
        if (mathsMarks < 0 || mathsMarks > 100) {
            do {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.println("Enter correct Maths subject marks: ");
                mathsMarks = input.nextInt();
            } while (mathsMarks < 0 || mathsMarks > 100);
        }

        System.out.println("Enter Science subject marks: ");
        int scienceMarks = input.nextInt();
        if (scienceMarks < 0 || scienceMarks > 100) {
            do {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.println("Enter correct Science subject marks: ");
                scienceMarks = input.nextInt();
            } while (scienceMarks < 0 || scienceMarks > 100);
        }

        System.out.println("Enter English subject marks: ");
        int englishMarks = input.nextInt();
        if (englishMarks < 0 || englishMarks > 100) {
            do {
                System.out.println("Invalid Input, Marks should between 0 to 100");
                System.out.println("Enter correct English subject marks: ");
                englishMarks = input.nextInt();
            } while (englishMarks < 0 || englishMarks > 100);
        }

        P_2StudentMarkSheet obj = new P_2StudentMarkSheet();
        obj.studentResult(studentName, rollNo, mathsMarks, scienceMarks, englishMarks);
    }
}





