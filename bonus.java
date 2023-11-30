import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sp = sc.nextInt();
        int sal = sc.nextInt();
        sc.close();
        if(sp>=15){
            System.out.println("Salary is " + (sal + 0.05*sal));
        }

        else{
            System.out.println("Service is less than 15 years");
        }
    }
    
}
