package helloworld;
//内部类，定义在一个类内部的类称为内部类。分为inner类、匿名类、静态类

public class inner {

	public static void main(String[] args) {
		//inner 类
		Outer outer = new Outer("sun");
		//先创建outer的实例，完后调用outer实例的new来创建Inner实例。
		Outer.Inner inner = outer.new Inner();
		inner.hello();
		//匿名类
		Outer2 outer2 = new Outer2();
		outer2.method();
		//静态内部类
		Outer3.StaticNested sn= new Outer3.StaticNested();
		sn.hello();
	}

}
//inner class类 匿名类 、静态内部类
class Outer{
	private String name;
	public Outer(String name) {
		this.name=name;
	}
	//inner 内部类，可以引用外部实例还能修改外部类的private字段，（因为内部类的作用域在外部类的内部，所以能访问外部类的private字段和方法）
	class Inner{
	
		public void hello() {
			System.out.println("HELLO, "+Outer.this.name);
		}
	}
}

/*
 * 1、匿名内部类只针对重写一个方法或接口时使用，
 * 2、格式为new类名或者接口名(){重写方法}
 * */
interface Inter{
	public void show1();
	public void show2();
}

class Outer2{
	public void method() {
		Inter i=new Inter() {
		
			@Override
			public void show2() {
				System.out.println("show1");
				
			}
			
			@Override
			public void show1() {
				System.out.println("show2");
				
			}
	};
	i.show1();
	i.show2();
}
}

/* 
 * 1、静态内部类和inner类相识但是使用static修饰，称为静态内部类
 * 2、使用静态内部类和Inner class有很大不同，他不在依赖于Outer实例，而是一个独立的类，因此无法应用Outer.this.name,但是可以访问outer的静态字段和方法。
 * 
 */
class Outer3{
	private static String Name="OUTER";
	
	static class StaticNested{
		void hello() {
			System.out.println(Outer3.Name);
		}
	}


}





