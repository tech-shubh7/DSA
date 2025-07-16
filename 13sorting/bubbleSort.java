public class bubbleSort{

    public static void bubblesort(int nums[]){
       ;
        for(int i=0;i<nums.length-1;i++){
             int count=0;
            for(int j=0;j<nums.length-1-i;j++) {
                    if(nums[j]>nums[j+1]){
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                        count++;
                }    
            }
            if(count==0){
                break; // If no swaps were made, the array is sorted    
        }
     } 
}
    public static void printnums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
   int nums[]={3,5,5,6,3,6,3,5,7,4,3,56,7,3,6,7,4,3};
      bubblesort(nums);
        printnums(nums);
    }
}