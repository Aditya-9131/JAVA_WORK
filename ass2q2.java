package labassignment.javaassignment;
import java.util.*;
public class ass2q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int numbers[] = new int[length];
        int size = numbers.length;
        int sum=0;
     // for taking input of element
     for(int i=0; i<=size; i++){
        numbers[i]=sc.nextInt();
         sum = sum + numbers;
     }
     //output
     for(int i=0; i<=size; i++){
        System.out.println(numbers[i]);
     }

        
    }
    
}
