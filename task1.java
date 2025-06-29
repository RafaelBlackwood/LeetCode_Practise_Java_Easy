import java.util.Scanner;

public class task1 {
    public static void main(String[] args){

        //Write a program that:
        //
        //Takes your name, age, and favorite color as input
        //
        //Prints it back like this:
        //"My name is Rafael, I'm 25 years old, and I like blue."

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter the colour: ");
        String colour = sc.nextLine();

        System.out.println(String.format("Hello %s, you are %d years old." +
                "your favorite colour is %s. ", name,age,colour));

    }
}
