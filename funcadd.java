import java.util.*;
public class funcadd {

    public static int addnumb(int a , int b){
       int add = a+b;
      // system.out.println(add);

       return add;
        
    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

       int add= addnumb(a,b);

       System.out.println(add);
    }

    
    
}
