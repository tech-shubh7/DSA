public class PractiseQ1 {
//print the number of 7s in the array
public static void main(String[] args) {

    int[][] matrix={{4,7,8},{8,8,7}};
    int key=7;
    int count=0;

    for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
               if(matrix[i][j]==key){
                    count++;
               }
           }
        }
    System.out.println(count);
}
}
