import java.util.*;
public class CheckEven {
    public static Boolean isEven(int n) {
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();

         boolean answer=isEven(n);
         System.out.println(answer);

    }
}
