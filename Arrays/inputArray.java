package Arrays;

import java.util.*;

public class inputArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        int numbers[] = new int[size];

        //i/p
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //o/p
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] == x){
                System.out.println("x found at index : " + 1);
            }
        }
    }
    
}
