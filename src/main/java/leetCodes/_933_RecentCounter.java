package leetCodes;

import java.util.LinkedList;
import java.util.Queue;

public class _933_RecentCounter {
    public _933_RecentCounter(){}
    Queue<Integer> queue = new LinkedList<>();
    public int ping(int t) {
        queue.add(t);
        if(queue.peek() < (t-3000)) {
            queue.remove();
        }
        return queue.size();
    }
}
