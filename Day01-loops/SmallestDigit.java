public class SmallestDigit {
    public static void main(String[] args) {
        int n = 10123, smallest = Integer.MAX_VALUE;
        while (n > 0) {
            int r = n % 10;
            if (r < smallest) {
                smallest = r;
            }
            n = n / 10;
        }
        System.out.println(smallest);
    }
}
