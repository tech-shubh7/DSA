public class reverseArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int first=0,last=array.length-1,temp;
       while (first!=last){
            temp=array[first];
            array[first]=array[last];
            array[last]=temp;
            first++;
            last--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

    }
}
