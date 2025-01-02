import java.util.*;
public class 2Darray {
    public static void main(String args[]){
        Scanner Sc = new Scanner();
            int row = Sc.nextInt();
            int column = sc.nextInt();

            int numbers[][] = new int[row][column];
            //input 
           // row
            for(int i=0; i<=row; i++){
                  for(int j=0; j<=column; j++){
                    numbers[i][j] = sc.nextInt();// code for  taking input
                  }
                }  
                
                int x = sc.nextInt();
                    // output
                    for(int i=0; i<=row; i++){
                        for(int j=0; j<=column; j++){
                            //compare with x
                            if(numbers[i][j]==x){
                                 system.out.println("x found at locations(" + i +" ," + j +")");

                            }
    
                        }
                        
                    }
                  }
            
        
    }
    

