package coreclass;

public class stringbuilder {
/*
 * StringBuilder是可变对象用来高效的拼接字符串
 * StringBuilder可以支持链式操作，实现链式操作的关键是返回实例本身
 * StringBuffer是StringBuilder的线程安全版本，现在很少用
 * */
	public static void main(String[] args) {
		//下面这种方式的字符串拼接方式，每次都会创建新的字符串对象，然后扔掉旧的字符串，大多数字符串都是临时对象，浪费内存和影响gc效率
		String s = "";
		for (int i = 0; i < 1000; i++) {
		    s = s + "," + i;
		}
		System.out.println(s);
		//java标准库提供了stringBuilder，是一个可变的对象，可以预分配缓存区，在StringBuilder中新增加字符的时候不会创建新的临时对象。
		StringBuilder sb=new StringBuilder(1024);
		for(int i=0;i<=1000;i++) {
			sb.append(",");
			sb.append(i);
		}
		String ss = sb.toString();
		System.out.println(ss);
		
		//使用stringBuilder进行链式操作,查看StringBuilder的源码，可以发现，进行链式操作的关键是，定义的append()方法会返回this，这样，就可以不断调用自身的其他方法。
		StringBuilder sb1 = new StringBuilder(1024);
		sb1.append("Mr")
		  .append("Bob")
		  .append("!")
		  .insert(0, "Hello , ");
		System.out.println(sb1.toString());
		
		// 创建支持链式操作的类，类似于StringBuilder
		Adder adder = new Adder();
		adder.add(3)
			 .add(5)
			 .inc()
			 .add(10);
		System.out.println(adder.value());
	
		}
	
		

}
class Adder{
	private int sum = 0;
	public Adder add(int n) {
		sum = sum +n;
		return this; 
		
	}
	public Adder inc() {
		sum++;
		return this;
	}
	public int value() {
		return sum;
	}
	
}


