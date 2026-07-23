import java.util.*;
public class harshad {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int og=n;
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        if(og%sum==0){
            System.out.print("harshad number");

        }
        else{
            System.out.print("not");
        }
    }
}
