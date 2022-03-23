package Assignments;

import java.util.Scanner;

public class StudentGrades {
    public static void main(String... args) {
        int total = 0;
        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;
        Scanner input = new Scanner(System.in);
        System.out.printf("%s%n%s%n %s%n %s%n",
                "Enter the integer grades in the range 0-100.",
                "Type the end-of-file indicator to terminate input:",
                "On UNIX/Linux/macOS type <Ctrl> d then press Enter",
                "On Windows type <Ctrl> z then press Enter");
// loop until user enters the end-of-file indicator
        while (input.hasNext()) {
            int grade = input.nextInt(); // read grade
            total += grade; // add grade to total
            ++gradeCounter; // increment number of grades
        // increment appropriate letter-grade
        switch (grade / 10) {
            case 9: // grade was between 90
            case 10: // and 100, inclusive
                ++aCount;
                break; // exits switch
            case 8: // grade was between 80 and
                ++bCount;
                break; // exits switch
            case 7: // grade was between 70 and
                ++cCount;
                break; // exits switch
            case 6: // grade was between 60 and
                ++dCount;
                break; // exits switch
            default: // grade was less than 60
                ++fCount;
                break; // optional; exits switch
        }
        }
        // display grade report
        System.out.printf("%nGrade Report:%n");
// if user entered at least one grade...
        if (gradeCounter != 0) {
// calculate average of all grades entered
            double average = (double) total / gradeCounter;
        }
    }
}


