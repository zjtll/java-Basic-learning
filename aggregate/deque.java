package aggregate;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
	//Deque 允许两头都进和两头都出，这种队列交双端队列（Deque）
	/*
	       将元素添加到队尾或队首：addLast()/offerLast()/addFirst()/offerFirst()；
		从队首／队尾获取元素并删除：removeFirst()/pollFirst()/removeLast()/pollLast()；
		从队首／队尾获取元素但不删除：getFirst()/peekFirst()/getLast()/peekLast()；
		总是调用xxxFirst()/xxxLast()以便与Queue的方法区分开；
		避免把null添加到队列。
	 */
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.offer("A"); //A
		deque.offer("B"); //A<--B
		deque.offer("C"); //A<--B<--C
		System.out.println(deque.pollFirst());//A
		System.out.println(deque.peekFirst());//B
		System.out.println(deque.peekLast());//C
		System.out.println(deque); //[B,C]
		
		
	}

}
