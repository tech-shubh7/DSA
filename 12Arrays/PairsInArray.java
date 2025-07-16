public class PairsInArray {
    public static void main(String[] args) {
        //array=[2,4,6,8]
        //pairs: (2,4) (2,6) (2,8) (4,6) (4,8) (6,8)
//        total pairs=n(n-1)/2
        int array[]={2,4,6,8};
        for (int i = 0; i < array.length; i++) {
            int current=array[i];
            for(int j=i+1;j<array.length;j++){
                System.out.print("("+current+","+array[j]+")");
            }
            System.out.println();
        }
    }
}
