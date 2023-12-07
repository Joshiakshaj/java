import java.util.Scanner;

public class mulFunc {
    public static int printProd(int a, int b){
        int prod = a*b;
        return prod;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int prod = printProd(a, b);
        System.out.println(prod);
    }
    
}
