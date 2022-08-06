package striver.important;

public class StackImplUsingArray {

    public int[] stack = new int[5];
    int top = -1;

    public static void main(String[] args) {
        StackImplUsingArray stackImpl = new StackImplUsingArray();
        stackImpl.push(10);
        stackImpl.push(20);
        stackImpl.push(30);
        stackImpl.push(40);
        System.out.println(stackImpl.top());
        stackImpl.pop();
        System.out.println(stackImpl.top());
        System.out.println(stackImpl.isEmpty());
    }


    public int top() {
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void pop() {
        top--;
    }

    public void push(int num) {
        top++;
        stack[top] = num;
    }

    public int size() {
        return top + 1;
    }

}
