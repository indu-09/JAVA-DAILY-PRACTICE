import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        int sum=0;
        int arr[]=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the elements in index no. "+ i);
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum of arr elements is:"+sum);
        sc.close();
    }
}
