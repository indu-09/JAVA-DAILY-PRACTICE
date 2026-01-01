import java.util.Scanner;

public class OccuranceArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the values:");
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the Target:");
        int target =sc.nextInt();
         int count = 0;
        for(int i=0;i<arr.length;i++){
            if(target == arr[i]){
                count++;
            }
        }
        System.out.println(" Occurance count : "+ count);
        sc.close();
    }
}
