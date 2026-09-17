
import java.util.Stack;

class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    // add = O(n)
    public static void add(int data){

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    // remove=O(1) 
    public static int remove(){
        if(isEmpty()){
            return -1;
        }

        return s1.pop();
    }

    // peek=O(1)
    public static int peek(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return -1;
        }

        return s1.peek();
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(5);
        q.add(2);
        q.add(7);
        q.add(6);
        q.add(2);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
