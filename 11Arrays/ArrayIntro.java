import java.sql.Array;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] array=new int[7];
        int s=1;
        for (int i=0;i<array.length;i++){
            array[i]=s;
            s++;
        }

        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
