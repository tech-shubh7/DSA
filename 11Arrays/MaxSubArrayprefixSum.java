public class MaxSubArrayprefixSum {
    public static void prefixsummethod(int numbers[]){
        int sum=0,maxsum=Integer.MIN_VALUE;
        int prefixarray[]=new int[numbers.length];
        prefixarray[0]=numbers[0];
        for (int i = 1; i < prefixarray.length; i++) {
            prefixarray[i]=prefixarray[i-1]+numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
                for(int j=i;j< numbers.length;j++){
                    sum= i==0?prefixarray[j]:prefixarray[j]-prefixarray[i-1];
               if(maxsum<sum){
                   maxsum=sum;
               }
            }
        }
        System.out.println("max sum is : "+maxsum);
    }

    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        prefixsummethod(numbers);
    }
}
