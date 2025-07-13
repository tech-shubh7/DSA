public class FactorialOfNum {

    public static void Factorial(int a){
        int fact=1;
        while(a>0){
            fact=fact*a;
            a--;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
            Factorial(0);
    }
}
