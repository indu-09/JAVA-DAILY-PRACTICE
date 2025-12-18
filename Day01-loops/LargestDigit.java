public class LargestDigit {
    public static void main(String[] args) {
        int n = 10123;
        int largest = Integer.MIN_VALUE;  

        while (n > 0) {
            int r = n % 10;  
            if (r > largest) {
                largest = r;  
            }
            n = n / 10;  
        }

        System.out.println(largest);
    }
}
