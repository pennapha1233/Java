import java.util.Scanner;

public class Example3_1 {

    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = scanner.nextLine();
        if (name == "Java") {
            System.out.println("Hello,  " +name);
        }
        System.out.println("Good bye,   " + name);
        scanner.close();
    }
}