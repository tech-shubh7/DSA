public class MaxSubArrayKadaneAlgo {
    public static void kadanealgorithm(int nums[]){
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentsum=currentsum+nums[i];
            if(currentsum<0){
                currentsum=0;
            }
            maxsum=Math.max(currentsum,maxsum);
        }
        System.out.println("max sum is : "+maxsum);
    }

    public static void main(String[] args) {
        int nums[]={-2,4,6,-5,-3,4,-6,-3,9,-3,2,1,-5,-8,7};
        kadanealgorithm(nums);
    }
}
