import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int arr[]=new int[5];

            for(int i=0;i<arr.length;i++){
                System.out.println("enter the nummber:");
                arr[i] = sc.nextInt();
            }
            
            int largest=0;
            int secondlargest=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>largest){
                   secondlargest = largest;
                   largest =arr[i];
                }
                else if(arr[i] > secondlargest  &&  arr[i] != largest){
                    secondlargest=arr[i];
                }

            }
            System.out.println(secondlargest);
            sc.close();

       
    }
}
