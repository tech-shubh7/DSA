public class BinomialCoefficient {
//    binomial coefficient nCr = n!/r!(n-r)!;
    public static void BinomailcoefficientofNum(int a,int r){
        int factofa=1;
        int factofr=1;
        int factofnMinusr=1;
        int n=a-r;
        while(a>0){
            factofa=factofa*a;
            a--;
        }
        while(r>0){
            factofr=factofr*r;
            r--;
        }
        while (n>0) {
            factofnMinusr=factofnMinusr*n;
            n--;
        }
        System.out.println(factofa);
        System.out.println(factofr);
        System.out.println(factofnMinusr);
        int nCrdown=factofr*factofnMinusr;
        int nCr=factofa/nCrdown;
        System.out.println(nCr);
    }

    public static void main(String[] args) {
        BinomailcoefficientofNum(5,2);
    }
}
