package aggregate;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
	//priorityqueue优先队列，放入队列的元素会自动排序。
	public static void main(String[] args) {
		Queue<String> q = new PriorityQueue<>();
		q.offer("a");
		q.offer("c");
		q.offer("b");
		System.out.println(q.poll()); //a
		System.out.println(q.poll()); //b
		System.out.println(q.poll()); //c
		System.out.println(q.poll()); //null
		
		//放入的顺序是a、c、b,取出的顺序是a、b、c说明内部经过排序的，因此放入priority的元素必须实现comparable。
		Queue<User> q1 = new PriorityQueue<>(new Comparator<User>() {

			@Override
			public int compare(User u1, User u2) {
				if (u1.number.charAt(0) == u2.number.charAt(0)) {
					 // 如果两人的号都是A开头或者都是V开头,比较号的大小,charAt(0)取字符串的第一个字母
					return u1.number.compareTo(u2.number);
				}
				if (u1.number.charAt(0) == 'V') {
					return -1;
				}else {
					return 1;
				}
			}
		});
		 q1.offer(new User("Bob", "A1"));
	     q1.offer(new User("Alice", "A2"));
	     q1.offer(new User("Boss", "V1"));
        System.out.println(q1);
        System.out.println(q1.poll()); // Boss/V1
        System.out.println(q1.poll()); // Bob/A1
        System.out.println(q1.poll()); // Alice/A2

	}

}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}

