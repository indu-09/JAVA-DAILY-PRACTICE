import java.util.*;

public class CheckPalindrome {

    public static void palindrome(int n) {
        int sum=0;
        int p=n;
        while(n>0){
            int lastDigit = n % 10;
            sum = (sum * 10 )+ lastDigit;
            n = n / 10;     
        }
         
        if(sum == p ){
            System.out.println("palindrome");
        } else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        palindrome(n);
    }
}
