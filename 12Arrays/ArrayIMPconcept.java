public class ArrayIMPconcept {


    //the main difference in array is java pases reference of array variable not value like normal variables
    //here in below example you can see the marks value will when in update function then main marks variable value also changes
    //but the int variable value does not change with same logic because java pases value of int variable
    //and java pased reference of array as it passes in all time
    public static void update(int marks[],int nonChangeable){

        for (int i = 0; i < marks.length ; i++) {
            marks[i]=marks[i]*24;
            nonChangeable=nonChangeable*55;
        }
    }

    public static void main(String[] args) {

    int nonChangeable=7;
    int marks[]={97,98,99};

    update(marks,nonChangeable);

    for (int i:marks){
        System.out.print(i+",");
    }
        System.out.println();
        System.out.println(nonChangeable);


    }
}
