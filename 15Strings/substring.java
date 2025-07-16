public class substring {

    public static String substring(String str,int si,int ei){
        String substr="";
        for (int i = si; i <ei ; i++) {
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="hello world";
        System.out.println(str.substring(1,8));
        //1 positionn will be printed means start position will print but not last position till before last index will be printed
        System.out.println(substring(str,1,8));
    }
}
