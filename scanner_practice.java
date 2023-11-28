import java.util.Scanner;

public class scanner_practice {
    public static void main(String[] args) {
        Scanner haha = new Scanner(System.in);
        int a = haha.nextInt();
        int b = haha.nextInt();
        int c = haha.nextInt();
        int sum = a+b+c;
        int mul = a*b*c;
        int diffone = a-b;
        int difftwo = b-c;
        int diffthree = c-a;
        System.out.println(sum);
        System.out.println(mul);
        System.out.println(diffone);
        System.out.println(difftwo);
        System.out.println(diffthree);
        System.out.println("What is your name?");
        String name = haha.next();
        System.out.println("Thanks " + name);
        haha.close();
    }
    
}
