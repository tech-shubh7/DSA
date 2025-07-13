public class CheckPrime {

    public static boolean CheckIfPrime(int a) {
        boolean isPrime = true;
        if (a == 1) {
            System.out.println("niether prime nor composite");
            return false;
        } else {
            for (int i = 2; i <= a / 2; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    return false;

                }
            }
            return true;

        }
    }
    public static void PrimesInRange(int a){
        for (int i = 2; i <=a ; i++) {
            if(CheckIfPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        CheckIfPrime(7);
        CheckIfPrime(9);
        CheckIfPrime(8);
        CheckIfPrime(13);
        CheckIfPrime(1);
        PrimesInRange(20);
    }
}