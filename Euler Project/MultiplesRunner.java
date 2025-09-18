public class MultiplesRunner {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            System.out.print(num);
            if (num % 2 != 0 || (num >= 6 && num <= 20)) {
                System.out.println(" Weird");
            } else {
                System.out.println(" Not Weird");
            }
        }
    }
}