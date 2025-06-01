public class ArmstrongNumbersMainOnly {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 1 and 500:");

        for (int num = 1; num <= 500; num++) {
            int originalNum = num;
            int sum = 0;
            int temp = num;

            
            while (temp > 0) {
                int digit = temp % 10; // Get last digit
                sum += (digit * digit * digit);
                temp /= 10; // Remove last digit
            }

            if (sum == originalNum) {
                System.out.println(num);
            }
        }
    }
}
