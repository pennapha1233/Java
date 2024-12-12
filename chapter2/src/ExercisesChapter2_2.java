import java.util.Scanner;

public class ExercisesChapter2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float celsius, fahrianheit;

        System.out.print("Enter Fahrenheit: ");
        fahrianheit = scanner.nextFloat();

        celsius = (fahrianheit - 32) * 5 / 9;

        System.out.printf("Celsius: %.2f", celsius);

        scanner.close();
    }
}

