import java.util.Scanner;

public class oddeven{
    public static void main(String[] args){
        System.out.println("Type a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Even");
        }

        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}