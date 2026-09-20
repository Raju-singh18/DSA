import java.util.*;

public class Interleave2Halives {

    public static void interLeave(java.util.Queue<Integer> q){
       java.util.Queue<Integer> fh = new LinkedList<>();
        int size = q.size();

        for(int i=0; i<size/2; i++){
            fh.add(q.remove());
        }

        while(!fh.isEmpty()){
          q.add(fh.remove());
          q.add(q.remove());
        }

    }
    public static void main(String[] args) {
        java.util.Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interLeave(q);

        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
