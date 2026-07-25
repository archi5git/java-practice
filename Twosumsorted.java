import java.util.*;
public class Twosumsorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int left=0;
        int right=n-1;
        int sum=0;
        while(left<right){
            sum=arr[left]+arr[right];
            if(sum==k){
                System.out.println(left+","+right);
                break;
            }
            else if(sum<k){
                left++;
            }
            else{
                right--;
            }
        }
    }
}
