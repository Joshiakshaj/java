import java.util.Scanner;

public class scanner_input {
    public static void main(String[] args) {
        System.out.println("Type name below:");
        Scanner input = new Scanner(System.in);
        String name =  input.next();
        System.out.println("Your name is:");
        System.out.println(name);
        input.close();
    }
    
}
