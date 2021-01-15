package aggregate;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
	/*1、队列也是一种集合，queue实际上就是一个先进先出(FIFO)的有序表,他和list的区别在于，list可以在任意位置添加和删除元素，而queue只有俩个操作：
	  1)、把元素添加到队列末尾
	  2)、从队列头部取出元素
	  
	  2、通过add()/offer()方式将元素添加到队尾，如果使用add当添加失败的时候(比如容量满)会抛出异常，而offer()是返回false
	  	 通过remove()/poll()从队首获取元素并删除,如果队列为空使用remove移除会抛出异常，而poll()会返回null
	  	 通过element()/peek()从队首获取元素但不删除,如果队列为空使用移除会抛出异常，而poll()会返回null
	  	 以上方法推荐使用后面的(offer()、poll()、peek())，
	  3、避免把null添加到队列，否则poll在判断时很难判断时null元素还是队列空
	*/
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>(); //LinkedList既可以实现List接口又可以实现queue接口。
		//添加三个元素到队列
		q.offer("a");
		q.offer("b");
		q.offer("c");
		System.out.println(q.peek());//a
		System.out.println(q.peek());//a peek不删除队首元素。
		
		System.out.println(q.poll());//a
		System.out.println(q.poll());//b
		System.out.println(q.poll());//c
		System.out.println(q.poll());//null,因为队列为空了
		


	}

}
