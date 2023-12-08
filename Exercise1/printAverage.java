//Enter 3 numbers from the user & make a function to print their average.
import java.util.Scanner;

public class QueOne{

    public static double printAverage(double a, double b, double c){
        double avg = (a+b+c)/3 ;
        return avg;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double avg = printAverage(a, b, c);
        System.out.println(avg);
        
    }
}
