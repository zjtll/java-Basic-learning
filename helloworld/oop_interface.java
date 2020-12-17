package helloworld;

public class oop_interface {

	public static void main(String[] args) {
		person4 p4= new Student4("lehehe");
		p4.run();
		System.out.println(p4.getName());
		p4.getage();
	}

}
//在抽象类中，抽象方法的本质就是定义接口规范，保证所有的子类都有相同的接口，如果一个抽象类没有字段，所有方法都是抽象方法就可以把这个抽象类改写为接口。
/*
 * 1、java中使用interface可以声明一个接口
 * 2、interface就是比抽象类还要抽象的纯抽象接口、它连字段都不能有
 * 3、interface定义的所有方法默认都有public abstract的，所以这俩个修饰符可以不写（效果一样）
 * 4、当一个class去实现一个interface的时候需要用到implements关键字
 * 5、一个类可以implements多个interface
 * 6、default方法(在接口可以定义default方法)目的是当我们为为接口增加一个方法时，会涉及到修改全部子类（子类需要覆写），
 *    如果增加的是default方法那么子类就不用全部修改，只需要在需要覆写的地方去覆写即可
 */
interface person4{
	public abstract void run();
	public abstract String getName();
	
	default void getage() {
		System.out.println("100");
	}
}
class Student4 implements person4{
	private String name;
	public Student4(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(this.name+" run");
		
		
	}

	@Override
	public String getName() {
		return this.name;
		
	}
	@Override
	public void getage() {
		System.out.println("222");
	}
}
//接口继承，一个interface可以继承另一个interface，它相当于扩展了接口的方法,此时world接口继承了Hello接口，所以world接口现在实际有3个抽象方法签名，其中一个来自继承的Hello接口
interface Hellos{
	void hellos();
}
interface world extends Hellos{
	void hrun();
	void wrun();
}






