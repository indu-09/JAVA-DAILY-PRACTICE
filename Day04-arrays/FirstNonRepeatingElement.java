import java.util.Scanner;

public class FirstNonRepeatingElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] =new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter the values:");
            arr[i] = sc.nextInt();
        }
         boolean found =false;
         int result=0;
        for(int i=0;i<arr.length;i++){
              int count = 0;

           for(int j=0;j<arr.length;j++){
             if(arr[i] == arr[j]){
                count++;                
             }
           }
            if(count == 1){
               result = arr[i];
               found = true;
                break;
             }
        }
       if(found){
        System.out.println("First non-repeating element : " + result);
       }else{
        System.out.println("No non-repeating element found");
       }
        sc.close();
    }
}
