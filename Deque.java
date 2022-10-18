import java.util.ArrayDeque;
import java.util.Deque;
public class Dequeing
{
    public static void main(String args[])
    {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(7);
        dq.add(6);
        dq.add(3);
        System.out.println("Inserted three elements are :");
        for(Integer i : dq)
            System.out.println(i);
        dq.add(9);
        System.out.println("add(9) : "+dq);
        dq.addFirst(2);
        System.out.println("addFirst(2) : "+dq);
         dq.addLast(100);
        System.out.println("addLast(100) : "+dq);
        dq.push(5);
        System.out.println("push(5) : "+dq);
        dq.offer(4);
        System.out.println("offer(4) : "+dq);
        dq.offerFirst(1);
        System.out.println("offerFirst(1) : "+dq);
        dq.removeFirst();
        System.out.println("removeFirst() : "+dq);
        dq.removeLast();
        System.out.println("removeLast() : "+dq);
        dq.pop();
        System.out.println("pop() : "+dq);
        dq.remove(6);
        System.out.println("remove(6) : "+dq);
    }
}
