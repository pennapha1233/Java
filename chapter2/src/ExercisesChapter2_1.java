import java.util.Scanner;
public class ExercisesChapter2_1 {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float celsius, fahrianheit;

        System.out.print("Enter celsius : ");
        celsius = scan.nextFloat();
        fahrianheit = ((9/5)*celsius) + 32;
        System.out.println("Fahrianheit : " + fahrianheit);
    }
}
