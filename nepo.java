import java.util.Scanner;

public class nepo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0){
            System.out.println("Num is positive");
        }

        else{
            System.out.println("Num is negative");
        }
        sc.close();
    }
}