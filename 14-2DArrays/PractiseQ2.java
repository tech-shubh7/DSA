public class PractiseQ2 {
//print the su of number in second row of nums array
public static void main(String[] args) {

    int[][] matrix={{4,7,8},{11,4,3},{21,2,3}};
    int sum=0;


        for(int j=0;j<matrix[0].length;j++){
                    sum+=matrix[1][j];
        }
    System.out.println(sum);
}
}
