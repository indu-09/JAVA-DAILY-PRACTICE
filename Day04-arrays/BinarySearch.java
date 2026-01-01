import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,4,5,2,6};
        int key =2;
        Arrays.sort(arr);
        int start=0;
        int end=arr.length-1;
       
        while(start <= end){
             int mid=(start + end)/2;
            if(arr[mid] == key){
                System.out.println("found at index"+mid);
                return;
            }else if(arr[mid] > key){
                end = mid-1;
            }else if(arr[mid] < key){
                start = mid + 1;
            }
        }      
    }
}
