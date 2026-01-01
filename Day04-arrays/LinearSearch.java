import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int key=10;
        int arr[] =new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the value into "+i);
            arr[i]=sc.nextInt();
        }
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(key == arr[i]){
                index = i;
                break;
            }
        }
         if(index != -1){
            System.out.println("found at index "+index);
         }else{
            System.out.println("not found");
         }
        

        sc.close();
    }
}
