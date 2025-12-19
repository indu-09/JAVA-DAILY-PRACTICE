 import java.util.*;

public class DecimalToBinary {

    public static int DecToBin(int decNum){
        int pow=0,Binary=0;
        while(decNum >0){
            int rem =decNum % 2;
            Binary = Binary + (rem * (int)Math.pow(10,pow));
            decNum = decNum / 2;
            pow++;
    
        }
         return Binary;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("enter the decimal number:");
        int decNum =sc.nextInt();

        int Binary=DecToBin(decNum);
        System.out.println(Binary);
       
    }
}


