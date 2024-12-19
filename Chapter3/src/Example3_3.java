import java.util.Scanner;
public class Example3_3 {
    public static void main(String[] args) {
        int num1, num2, num3, min = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter tree integers : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();
        if (num1 < num2)
            if (num1 < num3)
                min = num1;
            else
                min = num3;
        else if (num2 < num3)
            min = num2;
        else
            min = num3;
            System.out.println("Minimum value : " + min);
            scanner.close();
    }
    
}
