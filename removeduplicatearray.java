import java.util.Scanner;

public class removeduplicatearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int slow=0;
        for(int fast=1;fast<n;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow]=arr[fast];
            }
           
        }
        for(int i=0;i<=slow;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
