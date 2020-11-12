package helloworld;

public class oop_abstract {

	public static void main(String[] args) {
		// 抽象类
		abs s = new stu();
		s.run();
	}

}
/*
 * 1、如果父类得方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是为了让子类去覆写它，那么可以将父类得方法和类 声明为抽象方法 
 * 2、把一个方法声明为抽象方法，本身没有任何方法语句，这个抽象方法本身无法执行不能实例化
 * 3、抽象类本身设计只能被用作继承，抽象方法实际上相当于定义了规范
 */

abstract class abs{
	public abstract void run();
}
class stu extends abs{
	@Override
	public void run() {
		System.out.println("继承抽象类");
		
	}
	
	
	
}