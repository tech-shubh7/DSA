public class serachInSortedMatrix {
//given matrix is sorted rowwise and colwise find key index
    public static boolean searchKey(int nums[][],int key) {
        int row=0,col=nums[0].length-1;

        while (row<nums.length && col>=0){
            if(nums[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(key<nums[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String[] args) {
        int  nums[][]= {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
                searchKey(nums,33);
    }
}
