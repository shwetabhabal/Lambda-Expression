import java.util.ArrayList;

public class NumberPlay {
    ArrayList<Integer> playlist;
    public NumberPlay(){
        playlist= new ArrayList<>();
    }
    public void addNum(int n){
        playlist.add(n);
    }
    public void displaiPlaylist(){
//        for(int n : playlist){
//            System.out.println(n);
//        }

        playlist.forEach(n-> System.out.println(n));   //using lambda function
    }
    public static void main(String[] args) {
        NumberPlay playlist = new NumberPlay();
        playlist.addNum(1);
        playlist.addNum(2);
        playlist.addNum(3);
        playlist.addNum(4);
        playlist.addNum(5);
        playlist.displaiPlaylist();
    }
}
