import java.text.NumberFormat;
import java.util.Scanner;

public class Example3_8 {
    public static void main(String[] args) {
        final int NUM_GAMES = 12;
        int won;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of games won(0 to " + NUM_GAMES +") : ");
        won = scanner.nextInt();
        while (won < 0 || won > NUM_GAMES) {
            System.out.print("Invalid input. Please reenter : ");
            won = scanner.nextInt();
        }
        float ration = (float) won / NUM_GAMES;
        NumberFormat fmt = NumberFormat.getPercentInstance();
        System.out.println();
        System.out.println("Winnner precentage : " + fmt.format(ration));
        scanner.close();
    }    
}
