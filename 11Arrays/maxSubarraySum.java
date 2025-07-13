public class maxSubarraySum {
    public static void findmaxsum(int numbers[]){
        int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            for(int j=i;j< numbers.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                     sum=sum+numbers[k];
                }
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }
            }
        }
        System.out.println("Max sum is : "+max);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        findmaxsum(numbers);
    }
}
