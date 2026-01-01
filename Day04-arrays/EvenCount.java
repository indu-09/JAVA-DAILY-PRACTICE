import java.util.Scanner;

public class EvenCount {
    public static void main(String[] args) {
        int count=0;
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the value:");
            arr[i]=sc.nextInt();
            if(arr[i]%2 == 0){
                count++;
            }
        }
        
        System.out.println("Even count : "+count);
       
        
        sc.close();
    }
}
