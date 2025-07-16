public class Sortestpath {
    //given a route containing 4 directions E W N S  find shortest path
    //to reach destination
    //path="WNEENESENNNESNWENSWNESNWN"

    public static float findpath(String path){

        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            } else if (dir=='N') {
                y++;
            } else if (dir=='W') {
                x--;
            } else {
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNNESNWENSWNESNWN";
        System.out.println(findpath(path));
    }
}
