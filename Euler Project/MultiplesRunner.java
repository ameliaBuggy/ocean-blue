public class MultiplesRunner {
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int count = 7;
        int num = 13;
        while (count <= 10001) {
            num++;
            if (isPrime(num)) {
                count++;
            } 
        }
        System.out.println(num);
    }
}