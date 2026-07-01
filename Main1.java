import java.util.Scanner;

class Student {
    String name;
    int[] marks;

    Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    double calculateAverage() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];

        if (n > 0) {
            System.out.println("Enter marks:");
            for (int i = 0; i < n; i++) {
                marks[i] = sc.nextInt();
            }
        }

        Student s = new Student(name, marks);
        System.out.println(s.calculateAverage());

        sc.close();
    }
}