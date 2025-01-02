# include<stdio.h>

int fibonacci(int n){
    if(n<=1){
        return n;
    }
    int fib[n + 1];
    fib[0] = 0;
    fib[1] = 1;
    for(int i = 2; i<= n; i++){
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    return fib[n];
}
int main(){
    int n;
    printf("Enter the value of n:");
    scanf("%d",&n);
    if(n<0){
        printf("please enter a noon-negative integer.\n");
        return 1;
        int result = fibonacci(n);
        printf("The %dth fibonacci number is:%d\n",n,result);
    }
    return 0;
}