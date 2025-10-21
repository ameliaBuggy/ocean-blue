public class EulerRunner {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i <= 1000; i++) {
            sum += i**i;
        }

        sum = sum.toString().substring(-10,-1);
        System.out.println(sum);
    }
}