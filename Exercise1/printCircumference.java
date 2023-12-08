import java.util.Scanner;

public class QurFour {
    
    public static double printCircumference(double r){
        double c = 2*3.14*r;
        return c;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        sc.close();
        System.out.println(printCircumference(r));
    }
}
