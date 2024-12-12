import java.util.Scanner;

public class ExercisesChapter2_4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int number, digit1, digit2, digit3, sum;
        
        System.out.print("Enter Number : ");
        number = scan.nextInt();
        
        // แยกตัวเลขแต่ละหลัก
        digit1 = number / 100; // หลักพัน
        digit2 = (number / 10) % 10; // หลักสิบ
        digit3 = number % 10; // หลักหน่วย
        
        sum = digit1 + digit2 + digit3; // ผลรวม
        
        System.out.print("Summation of digit : " + sum);
    }
    
}
