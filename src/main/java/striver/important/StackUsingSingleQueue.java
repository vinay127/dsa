package striver.important;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSingleQueue {

    Queue<Integer> q1 = new LinkedList<>();

    public static void main(String[] args) {

        StackUsingSingleQueue stack = new StackUsingSingleQueue();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.top());
        stack.pop();
        stack.pop();
        System.out.println(stack.top());
    }

    /*
     * TC : O(N)
     * SC : O(N)
     * */
    public void push(int num) {
        q1.add(num);
        for (int i = 0; i < q1.size() - 1; i++) {
            q1.add(q1.peek());
            q1.poll();
        }
    }

    public int pop() {
        if (!q1.isEmpty()) {
            return q1.poll();
        }
        return -1;
    }

    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return -1;
    }


}
