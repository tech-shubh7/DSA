public class spiralmatrixProblem {
    //in this problem we have to print matrix in spiral form like given below
//          1  2  3  4
//          5  6  7  8
//          9  10  11 12
//          12 14  15 16
// output will be : 1 2 3 4 8 12 16 15 14 12 9 5 6 7 11 10
// like in round shape jalebi type formation
    public static void printSpiral(int nums[][]){
        int startRow=0,startCol=0;
        int endrow= nums.length-1;
        int endcolumn=nums[0].length-1;
        
        while(startRow<=endrow && startCol<=endcolumn){
            //top
            for (int j = startCol; j <= endcolumn; j++) {
                System.out.print(nums[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endrow;i++){
                System.out.print(nums[i][endcolumn]+" ");
            }
            //bottom
            for(int j=endcolumn-1;j>=startCol;j--){
                if(startRow==endrow){
                    break;
                }
                System.out.print(nums[endrow][j]+" ");
            }
            //left
            for(int i=endrow-1;i>=startRow+1;i--){
                if(startCol==endcolumn){
                    break;
                }
                System.out.print(nums[i][startCol]+" ");
            }
            startCol++;
            startRow++;
            endcolumn--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    int  nums[][]=  {{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

                 printSpiral(nums);
    }
}

