public class PerfectNumber {
     public static void main(String[] args) {
        int n=6,sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                
                sum=sum+i;
            }
        }
        System.out.println(sum);
        if(n==sum){
            System.out.println("prefect");
        }else{
            System.out.println("not a perfect");
        }
    }
}
