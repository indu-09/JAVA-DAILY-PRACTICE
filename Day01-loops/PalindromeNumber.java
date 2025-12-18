public class PalindromeNumber {
     public static void main(String[] args) {
     int n=121,r,sum=0;
     int p=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(sum == p){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
