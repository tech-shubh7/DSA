public class countingSort{

public static void countingsort(int nums[]){
        int largest=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++){
      largest=Math.max(largest,nums[i]);
    }
    int[] count=new int[largest+1];

    for(int i=0;i<nums.length;i++){
        count[nums[i]]++;
    }
    //sorting
    int j=0;
    for(int i=0;i<count.length;i++){
        while(count[i]>0){
            nums[j]=i;
            j++;
            count[i]--;
        }
    }
}

public static void printnums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args){
    int[] nums={5,4,3,2,1};
    countingsort(nums);
    printnums(nums);

    }
}