import java.util.*;
public class gcd {
    static int gcd(int a,int b){
        int temp;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        

        
    }
}
