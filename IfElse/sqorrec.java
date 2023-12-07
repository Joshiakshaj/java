import java.util.Scanner;

public class sqorrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if(l == b){
            System.out.println("Square");
        }

        else{
            System.out.println("Not Square");
        }

    }
    
}
