import java.util.Stack;
//Time Complexity - O(1)
//Space Complexity - O(n)
class MinStack {
   private Stack<Integer> stack;
	private Stack<Integer> minStack;
	private int min;

	public MinStack() {
		this.stack = new Stack();
		this.minStack = new Stack();
		this.min = Integer.MAX_VALUE;
	}

	public void push(int val) {
		stack.push(val);
		if (val <= min) {
			minStack.push(val);
			min = val;
		}
	}

	public void pop() {
		if (stack.isEmpty())
			return;
		Integer pop = stack.pop();
		if (pop == min) {
			minStack.pop();
			min = minStack.peek();
		}

	}

	public int top() {
		return stack.peek();
	}

	public int getMin() {
		return minStack.isEmpty() ? Integer.MAX_VALUE : min;
	}
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */