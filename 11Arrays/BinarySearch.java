public class BinarySearch {
    public static int binarysearch(int aray[],int key){
        int start=0,end=aray.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if(aray[mid]==key){
                return mid;
            }
            if(aray[mid]<key){//right
                start=mid+1;
            } else{//left
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6,7,8,9};
        int key=9;

    System.out.println("index for key is : "+binarysearch(array,key));
    }
}
