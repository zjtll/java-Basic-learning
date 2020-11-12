package helloworld;

public class oop_dt {

	public static void main(String[] args) {
		Person2 a = new student2();
		//应用类型为person2 实际类型为student2调用www()方法,调用的是person2还是student2？-->实际结果是调用student2的www()方法
		//结论：java的实例方法调用结果是基于运行时的实际类型的动态调用，而非变量的声明类型，这个特征在面向对象变成中称为多态(polymorphic)
		a.www();
	}

}
//覆写，子类如果定义一个与父类方法签名完全相通的方法，被称为覆写(Override)
//方法签名:方法名相同、方法参数相同、方法返回值类型相同
class Person2{
	public void www() {
		System.out.println("www.xsky.com");
	} 
}
class student2 extends Person2{
	//子类覆写www方法,@Override可以让编译器帮助检查是否进行了正确的覆写。@Override不是必须的,不加也可以
	@Override
	public void www() {
		System.out.println("www.baidu.com");
	}
	
	
}
/*
 * final 
 * 		 1、如果父类不允许子类对他某个方法进行覆写可以把这个方法标记为final
 *       2、使用final修饰的类不能被继承
 *       3、使用final修饰类的实例字段该值在初始化后不能修改 
 * 
 */