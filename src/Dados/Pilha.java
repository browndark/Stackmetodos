package Dados;

import java.util.Stack;

public class Pilha {
    private Stack<Integer> stack;

    public Pilha() {
        stack = new Stack<>();
    }

    public void push(int element) {
        stack.push(element);
    }

    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        } else {
            return null;
        }
    }

    public Integer peek() {
        if (!stack.isEmpty()) {
            return stack.peek();
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clear() {
        stack.clear();
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
