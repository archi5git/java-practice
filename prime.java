import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n<= 1) {
            System.out.println("Not Prime Number");
        }
            boolean isPrime = true;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
        if(isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
}

