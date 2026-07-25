import java.util.*;
public class palindromearray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        boolean isPalindrome=true;
        while(left<right){
            if(arr[left]!=arr[right]){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome){
            System.out.println("The array is a palindrome.");
        }
        else{
            System.out.println("The array is not a palindrome.");
        }
    }
}