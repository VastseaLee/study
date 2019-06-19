package leetcode.one;

import java.util.Stack;

/**
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 */
public class FiftyFive {
    private Stack<Integer> min;
    private Stack<Integer> stack;

    public FiftyFive() {
        min = new Stack<>();
        stack = new Stack();
    }

    public void push(int x) {
        if (min.empty() || x <= min.peek()) {
            min.push(x);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.peek().equals(min.peek())) {
            min.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
