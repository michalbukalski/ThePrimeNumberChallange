public class BreakLoopAfter3FirstPrimeNumber {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 10; i <= 50; i++) {
            if(isPrime(i)){
                System.out.println("Number " + i + " is a prime number");
                count++;
                if(count == 3){
                    System.out.println("I have found 3 first prime numbers in this loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int divisor = 2; divisor < wholeNumber; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
