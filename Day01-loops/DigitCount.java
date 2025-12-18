public class DigitCount {
    public static void main(String[] args) {
        int n = 252, count = 0;
        while (n > 0) {
            n = n / 10; 

            count++;
        }  
        System.out.println(count);
    }
}
