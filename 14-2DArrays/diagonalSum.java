public class diagonalSum {

    public static void getSum(int nums[][]){

        int sum=0;
        //below commented code is not optimized its time complexity is
        //O(n^2) we can optimize this with below without commented code
//        for(int i=0;i< nums.length;i++){
//            for(int j=0;j<nums[0].length;j++){
//                if(i==j || i+j==nums.length-1){
//                    sum=sum+nums[i][j];
//                }
//            }
//        }
        for(int i=0;i<nums.length;i++){
            //primary diagonal
            sum+=nums[i][i];
            //seconary diagonal
            if(i!= nums.length-1-i) {
                sum += nums[i][nums.length - i - 1];
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int  nums[][]=  {{1,2,3},
                         {5,6,7},
                         {9,10,11},
                        };

        getSum(nums);
    }
}
