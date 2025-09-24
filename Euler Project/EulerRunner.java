public class EulerRunner {
    public static boolean isPrime(int n) {
        if (n <= 1) return true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int sum = 3;
        for (int i = 3; i < 2000000; i+=2) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}