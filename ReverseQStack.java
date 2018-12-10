import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQStack {
	public static Queue<String> queue = new LinkedList<>();
	public static Stack<String> stack = new Stack<String>(); 
	public static Stack<String> reverse(Queue<String> q){
		while(!q.isEmpty()) {
		stack.push(q.poll());
		
		}
		return stack;
	}
	public static Queue<String> printreverseQ(Stack<String> s) {
		while(!s.isEmpty()) {
			queue.add(s.pop());
		}
	return queue;
	}
	public static void main(String[] args) {
		queue.add("Roger");
		queue.add("Tom RIDDLE");
		queue.add("RON");
		queue.add("HARRY");
		queue.add("JACK");
		System.out.println(queue);
		System.out.println(reverse(queue));
		//System.out.println(stack.pop();
		System.out.println(printreverseQ(stack));
	}

}
