import java.util.*;
public class perfect {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        if(n==sum){
            System.out.print(n + " is a Perfect Number");
        }
        else{
            System.out.print(n + " is not a Perfect Number");
        }

    }
}
