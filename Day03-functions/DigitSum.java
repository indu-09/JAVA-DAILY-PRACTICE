import java.util.Scanner;

public class DigitSum {
    public static void digitSum(int n) {
        int r,sum=0;
        while(n>0){
            r = n % 10;
            sum=sum+r;
            n=n/10;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        digitSum(n);
    }
}
