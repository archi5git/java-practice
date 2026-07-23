import java.util.*;
public class strong{
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int originalNumber=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum+factorial(dig);
            n=n/10;
        }
        System.out.println(sum);
        if(originalNumber==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not Strong Number");
        }
    }
}