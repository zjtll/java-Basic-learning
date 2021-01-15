package aggregate;

import java.util.Deque;
import java.util.LinkedList;

public class stack {
	//1、栈是一种先进后出的数据结构，stack只有入栈和出栈操作，
	//2、元素压栈:(push)、弹出栈顶元素(pop)、取出栈顶元素但不弹出(peek)
	/*3、在java中可以用Deque实现Stack的功能，因为java有个遗留的类名叫stack所以没办法直接创建stack的接口，只能通过Deque来模拟一个stack,
	  在我们把Deque当作Stack使用的时候注意只调用push pop peek，其他方法不需要调用
	  4、栈有容量限制 嵌套调用过多会造成栈溢出，即引发StackOverflowError：
	*/

	public static void main(String[] args) {
		// 使用stack实现一个整数转换为16进制的字符串
	     String hex = toHex(12500);
	        if (hex.equalsIgnoreCase("30D4")) {
	            System.out.println("测试通过");
	        } else {
	            System.out.println("测试失败");
	        }
	    

	}
	static String toHex(int n) {
		Deque<String> deq = new LinkedList<>();
		while (n != 0) {
			
			deq.push(Integer.toHexString(n % 16));
			n = n / 16;
		}
		StringBuilder sb = new StringBuilder();
		for (String key : deq) {
			System.out.println(key);
			sb.append(key);
		}
        return sb.toString();
    }

}
