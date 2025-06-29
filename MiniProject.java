import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many students? ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();

            System.out.print("Enter grade for " + name + ": ");
            double grade = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(name, grade);
        }

        ScoreService.printReport(students);
    }

    static class Student {
        private String name;
        private double grade;

        public Student(String name, double grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public double getGrade() {
            return grade;
        }
    }

    static class ScoreService{
        public static double calculateAverage(Student[] students) {
            double sum = 0;
            for (Student s : students) {
                sum += s.getGrade();
            }
            return sum / students.length;
        }

        public static Student findHighest(Student[] students) {
            Student highest = students[0];
            for (Student s : students) {
                if (s.getGrade() > highest.getGrade()) {
                    highest = s;
                }
            }
            return highest;
        }

        public static Student findLowest(Student[] students) {
            Student lowest = students[0];
            for (Student s : students) {
                if (s.getGrade() < lowest.getGrade()) {
                    lowest = s;
                }
            }
            return lowest;
        }

        public static void printReport(Student[] students) {
            System.out.println("\n--- Grade Report ---");

            for (Student s : students) {
                System.out.println("- " + s.getName() + ": " + s.getGrade());
            }

            System.out.printf("\nAverage: %.2f\n", calculateAverage(students));
            Student high = findHighest(students);
            Student low = findLowest(students);

            System.out.println("Highest: " + high.getName() + " (" + high.getGrade() + ")");
            System.out.println("Lowest: " + low.getName() + " (" + low.getGrade() + ")");
        }
    }
}
