import java.util.Scanner;

public class fandl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        if(x%5==0 && x%11==0){
            System.out.println("Divisible by 5 & 11");
        }
        else{
            System.out.println("Number is not a multiple of 5 or 11");
        }
    }
    
}
