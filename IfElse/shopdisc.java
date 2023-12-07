import java.util.Scanner;

public class shopdisc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant = sc.nextInt();
        sc.close();
        

        if(quant>=1000){
            System.out.println(quant-(0.1*quant));
        }

        else{
            System.out.println("Bill: " + quant);
        }
    }
}
