package normal_Program;

public class PrimeNum_between {
    public static void main(String[] args) {
        // Loop through numbers 1 to 20
        for (int i = 1; i <= 20; i++) {
            boolean isPrime = true;

            // Check if number is prime
            for (int j = 2; j<i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print prime number
            if (isPrime && i > 1) {
                System.out.print(i + " ");
            }
        }
    }
}
