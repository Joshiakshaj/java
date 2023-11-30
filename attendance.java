import java.util.Scanner;

public class attendance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter classes attended");
        double attended = sc.nextInt();
        System.out.println("Enter total classes held");
        double total = sc.nextInt();
        sc.close();
        double p = (attended/total)*100;
        System.out.println("Attendance percentage");
        System.out.println(p + "%");
        if(p <= 75){
            System.out.println("Not allowed to appear for exams");
        }
        else{
            System.out.println("Allowed to appear for exams");
        }
    }
}
