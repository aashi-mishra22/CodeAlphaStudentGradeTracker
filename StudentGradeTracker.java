import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            double marks = sc.nextDouble();
            sc.nextLine();

            students.add(new Student(name, marks));
        }

        double total = 0;
        double highest = students.get(0).marks;
        double lowest = students.get(0).marks;

        String topper = students.get(0).name;
        String lowScorer = students.get(0).name;

        for (Student s : students) {
            total += s.marks;

            if (s.marks > highest) {
                highest = s.marks;
                topper = s.name;
            }

            if (s.marks < lowest) {
                lowest = s.marks;
                lowScorer = s.name;
            }
        }

        double average = total / students.size();

        System.out.println("\n========== STUDENT REPORT ==========");
        System.out.println("Name\t\tMarks");

        for (Student s : students) {
            System.out.println(s.name + "\t\t" + s.marks);
        }

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Highest Marks: " + highest + " (" + topper + ")");
        System.out.println("Lowest Marks: " + lowest + " (" + lowScorer + ")");

        sc.close();
    }
}
