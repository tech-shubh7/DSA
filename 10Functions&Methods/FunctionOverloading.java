public class FunctionOverloading {
    //Function overloading is multiple functions with the same name
    //but with different parameters.
     //for example multiply(int a,int b) and multiply(float a, float b)
    //there can be 2 difference in fn overloading either the number of parameters can be different
    //like 2 parameters 3 parameters or types of parameters can be different like int float duoble


    //FUNCTION OVERLOADING USING PARAMETERS
    public static int sum(int a,int b){
        return a+b;
    }
    public  static int sum(int a,int b,int c){
        return a+b+c;
    }

    //FUNCTION OVERLOADING USING DATA TYPES OF PARAMETERS
    public static int sub(int a,int b){
        return a-b;
    }
    public static float sub(float a,float b){
        return a-b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,6));
        System.out.println(sum(3,6,9));
        System.out.println(sub(7,7));
        System.out.println(sub(6f,6f));
    }

}
