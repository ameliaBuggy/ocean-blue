public class EulerRunner {
    public static boolean isPalindrome(String number){
        for (int i = 0; i < number.length()/2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Integer sum = 0;
        for (Integer i = 0; i < 1000000; i++) {
            String number = i.toString();
            String binary = Integer.toBinaryString(i);
            if (isPalindrome(number) && isPalindrome(binary)) {
                System.out.println("Number: " + number);
                System.out.println("Binary " + binary);
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);
    }
}