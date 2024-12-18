import java.util.Scanner;

public class Example3_5 {
    public static void main(String[] args) {
        int num, numOld;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4 digit number : ");
        num = scanner.nextInt();
        numOld = num;
        // logic for check count digit
        int count = 0;
        if (num > 0) { // check digit 1
            count++;
            num = num / 10;
            if (num > 0) { //check digit 2
                count++;
                num = num / 10;
                if (num > 0){
                    count++;
                    num = num / 10;
                    if (num > 0) {
                        count++;
                        num = num / 10;
                    }
                }
            }
        }
        if(num == 0 && count == 4)
            System.out.println("Number " + numOld + " is 4 digits. ");
        else
            System.out.println("Number " + numOld + " is not equal 4 digits. ");
    }
}    