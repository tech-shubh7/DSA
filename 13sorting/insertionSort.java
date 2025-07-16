public class insertionSort{

public static void insertionsort(int nums[]){

    for(int i=1;i<nums.length;i++){
        int current=nums[i];
        int prev=i-1;
         //finding out the correct position to insert
         while(prev>=0&&nums[prev]>current){
            nums[prev+1]=nums[prev];
            prev--;
         }
         //insertion
         nums[prev+1]=current;
    }
}

public static void printnums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
    int[] nums={5,4,3,2,1};
    insertionsort(nums);
    printnums(nums);

    }
}