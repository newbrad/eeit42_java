import java.util.Collections;
import java.util.LinkedList;

public class PokerV3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<52; i++) list.add(i);
        Collections.shuffle(list);
        
        for(Integer v : list){
            System.out.println(v);
        }
    }
}
