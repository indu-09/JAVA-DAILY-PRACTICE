public class AverageOfThreeNumbers {
    public static int Avg(int a,int b,int c){
        int avg=(a+b+c)/3;
        return avg;

    }

    public static void main(String[] args) {
        int a=2;
        int b=5;
        int c=5;

        int avg=Avg(a,b,c);
        System.out.println(avg);

    }
}
