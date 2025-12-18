public class EvenOddDifference {
    public static void main(String[] args) {
        int n=10;
        int esum=0,osum=0;
         for(int i=2;i<=n;i=i+2){
             esum=esum+i;
         }
          for(int i=1;i<=n;i=i+2){
             osum=osum+i;
         }
         int difference=osum-esum;
         System.out.println(Math.abs(difference));
    }
}
