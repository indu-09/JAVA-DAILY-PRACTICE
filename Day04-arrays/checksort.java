import java.util.Scanner;

public class checksort {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the number:");
            arr[i]=sc.nextInt();
        }
        boolean isSort =true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                isSort =false;
                break;
            }
            
        }
        if(isSort){
            System.out.println("sort");
        }else{
            System.out.println("not sorted");
        }
        
      sc.close();
    }
}
