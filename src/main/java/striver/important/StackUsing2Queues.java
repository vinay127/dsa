package striver.important;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public static void main(String[] args) {
        StackUsing2Queues stack = new StackUsing2Queues();
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
     * TC : O(N) mainly for swapping between queues
     * SC : O(N) + O(N) - 2 queues
     * */
    public void push(int num) {
        /*
         * Steps
         * 1. Add the number to q2.
         * 2. Copy all the elements from q1 to q2.
         * 3. Swap q1 and q2.
         * */

        q2.add(num);

        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        Queue<Integer> temp;
        temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int top() {
        if (!q1.isEmpty()) {
            return q1.peek();
        }
        return -1;
    }

    public void pop() {
        q1.poll();
    }



}
