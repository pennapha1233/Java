import java.util.Scanner;

public class Exerci2_3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float principle, rate;
        float interest, deposit, principle_cal;
        System.out.print("Enter principle : ");
        principle= scanner.nextFloat();
        System.out.print("Enter interest rate : ");
        rate = scanner.nextFloat();
        
        // year 1
        principle_cal = principle;
        interest = principle * (rate/100);
        deposit = principle + interest;
        // year 2
        principle_cal = deposit;
        interest = principle * (rate/100);
        deposit = principle + interest;
        // year 3
        principle_cal = deposit;
        interest = principle * (rate/100);
        deposit = principle + interest;
        // year 4
        principle_cal = deposit;
        interest = principle * (rate/100);
        deposit = principle + interest;
        System.out.println("Principle = " + principle);
        System.out.println("Principle rate = " + rate + "%");
        System.out.println("Interest = " + (deposit-principle) );
        System.out.println();
        scanner.close();
    }
}