import java.util.ArrayList;
import java.util.List;

public class MiniProjectOOP {
    public static void main(String[] args) {
        //You're building a system that manages:
        //
        //Different types of people (students, professors, staff)
        //Courses that students can enroll in
        //Professors who teach courses
        //Staff who support operations

        Student person = new Student("Kris", 29);
        Student person2 = new Student("Bread", 29);

        ArrayList<Student> people = new ArrayList<>();
        people.add(person);
        people.add(person2);

        Professor p1 = new Professor("Banana", 29);

        Course course = new Course("Introduction to Computer Science");

        course.showCourseDetails(people, p1);
    }

    static class Person{
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        void displayInfo(){
            System.out.println("Name: " + name);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class Course{
        private String name;

        public Course(String name) {
            this.name = name;
        }

        public void showCourseDetails(ArrayList<Student> students,Professor professor){
            System.out.println("Course: " + name);
            System.out.println("Taught by: " + professor.getName());
            System.out.println("Enrolled Students:");
            for(Student s : students){
                System.out.println("- " + s.getName());
            }
        }
    }

    static class Student extends Person{

        public Student(String name, int age) {
            super(name, age);
        }

        @Override
        void displayInfo() {
            super.displayInfo();
        }

        @Override
        public String getName() {
            return super.getName();
        }
    }

    static class Professor extends Person{

        public Professor(String name, int age) {
            super(name, age);
        }
        @Override
        void displayInfo() {
            super.displayInfo();
        }
    }

    static class Staff extends Person{

        public Staff(String name, int age) {
            super(name, age);
        }
        @Override
        void displayInfo() {
            super.displayInfo();
        }
    }
}
