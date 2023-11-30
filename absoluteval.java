import java.util.Scanner;

public class absoluteval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if(x<0){
            System.out.println("Absolute Value: " + -1*x);
        }
        else {
            System.out.println("Absolute Value: " + x);
        }
    }
    
}
