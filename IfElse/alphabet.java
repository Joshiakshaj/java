import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        sc.close();

        if(ch>= 'a' && ch<= 'z' || ch>= 'A' && ch<= 'Z'){
            System.out.println("This is an Alphabet");
        }
        else{
            System.out.println("This is not an Alphabet");
        }

    }
}
