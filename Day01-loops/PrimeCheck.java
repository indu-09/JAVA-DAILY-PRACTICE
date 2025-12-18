public class PrimeCheck {
    public static void main(String[] args) {
        int n=13;
        boolean isPrime =true;
       
       if(n==2){
          System.out.println("prime");
           
       }else{
           for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime = false;
                break;
            }
        }
        
         if(isPrime == true){
            System.out.println("prime");
        }  
        else
           {
            System.out.println("not a prime");
           }
        }
    }
}
