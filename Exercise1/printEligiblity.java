import java.util.Scanner;

public class QueFive {

    public static boolean printEligiblity(int age){
        if(age >=18){
            return true;        
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        sc.close();
        System.out.println(printEligiblity(age));
    }
    
}
