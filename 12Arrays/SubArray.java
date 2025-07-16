public class SubArray {
    public static void main(String[] args) {
//        subarray=n(n+1)/2
        int numbers[]={1,2,3,4,5};
//        totalsubarrays=5(5+1)/2=15

        for (int i = 0; i < numbers.length; i++) {
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
