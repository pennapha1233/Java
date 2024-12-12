import java.util.Scanner;

public class ExercisesChapter2_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num;
        int multiplied, firstDecimal, secondDecimal, thirdDecimal;
        
        System.out.print("Enter Floating Number : ");
        num = scan.nextFloat();
        
        // คูณตัวเลขทศนิยมด้วย 1000 เพื่อให้เกิดจำนวนเต็ม
        multiplied = (int) (num * 1000);
        firstDecimal = (multiplied / 100) % 10;
        secondDecimal = (multiplied / 10) % 10;
        thirdDecimal = multiplied % 10;
        
        System.out.println("Decimal Number #1: " + firstDecimal);
        System.out.println("Decimal Number #2: " + secondDecimal);
        System.out.println("Decimal Number #3: " + thirdDecimal);
    }
}
