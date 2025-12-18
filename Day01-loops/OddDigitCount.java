public class OddDigitCount {
    public static void main(String[] args) {
       int n=13579,r,c=0;
       while(n>0){
           r=n%10;
           if(r % 2 != 0){
               c++;
           }
           n=n/10;
       }
       System.out.println(c);
}
}
