import java.util.*;
public class BinaryToDecimal {

    public static int BinToDec(int binNum){
        int pow=0,decimal=0;
        while(binNum >0){
            int lastDigit =binNum % 10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,pow));
            binNum = binNum / 10;
            pow++;
    
        }
         return decimal;
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.print("enter the Binarynumber:");
        int binNum =sc.nextInt();

        int decimal=BinToDec(binNum);
        System.out.println(decimal);
       
    }
}
