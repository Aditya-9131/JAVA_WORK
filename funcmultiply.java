import java.util.*;
public class funcmultiply {
    public static int MulNumber(int a , int b){
        int mul = a*b;
       // System.out.println(mul);

        return mul;
    }

    public static int  main(){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int mul = MulNumber(a,b);

       System.out.println(mul);
    }
}
