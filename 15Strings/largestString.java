public class largestString {


    public static void main(String[] args) {
        String names[]={"apple","banana","mango","shubham","rajabhoj"};

        String largest=names[0];
        for(int i=1;i< names.length;i++){
            if(largest.compareTo(names[i])<0){
                    largest=names[i];

            }
        }
        System.out.println(largest);
    }
}
