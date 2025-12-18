public class DigitProduct {
    public static void main(String[] args) {
        int n=12345,r,product=1;
        while(n>0){
            r=n%10;
            product=product*r;
            n=n/10;
        }
        System.out.println(product);
}
}
