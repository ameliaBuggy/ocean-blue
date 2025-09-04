public class MultiplesRunner {
    public static void main(String[] args) {
        int sum = 0;
        int current = 1;
        int previous = 0;
        int next = 0;
        while (current < 4000000) {
            if (current % 2 == 0) {
                sum += current;
            }
            next = current + previous;
            previous = current;
            current = next;
        }
        System.out.println(sum);
    }
}