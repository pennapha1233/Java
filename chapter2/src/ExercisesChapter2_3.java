import java.util.Scanner;

public class ExercisesChapter2_3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float principal, interestRate, interest;

        System.out.print("ป้อนเงินต้น: ");
        principal = scan.nextFloat();

        System.out.print("ป้อนอัตราดอกเบี้ย : ");
        interestRate = scan.nextFloat();

        System.out.println("ปี\tเงินฝากที่ได้");
        interest = principal * (interestRate / 100);
        principal += + interest;
        System.out.println("1 \t" + principal);
        principal += + interest;
        System.out.println("2 \t" + principal);
        principal += + interest;
        System.out.println("3 \t" + principal);
        principal += + interest;
        System.out.println("4 \t" + principal);

    }
}
