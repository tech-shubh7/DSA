public class MaxSearch {
    public static void main(String[] args) {
        int marks[]={1,2,3,4,5,6,7,8,9,535,2,46,4,524};
        int max=marks[0];

        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>max){
                max=marks[i];
            }
        }
        System.out.println("max from array is "+max);
    }
}
