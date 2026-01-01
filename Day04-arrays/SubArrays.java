public class SubArrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        int totalpairs=0;
     int maxSum=Integer.MIN_VALUE;
     int minSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
           
            for(int j=i;j<arr.length;j++){
                 int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];     
                }
                if(sum<minSum){
                    minSum=sum;
                }
                if(sum>maxSum){
                    maxSum=sum;
                }
                
                System.out.println("sum: "+sum);
                totalpairs++;
                System.out.println();
            }         
            System.out.println();
           
        }
         System.out.println("Maximum sum:"+maxSum);
         System.out.println("Minimum sum:"+minSum);
        System.out.println("total pairs: "+totalpairs);
    }
}
