package helloworld;

import jdk.nashorn.internal.runtime.PrototypeObject;

public class Method {

	public static void main(String[] args) {
		//构造方法,在创建实例得时候一次传入参数，完成初始化，任何得class都有构造方法，如果不写也会默认有一个
		//public Persion(){}的方法，默认没有参数。类似python的__init__方法，
		//构造方法可以创建多个通过new实例化的时候编译器自动根据参数数量和类型自动区分
		
		Person1 p = new Person1("xiao ming",12); //调用有参构造方法
		System.out.println(p.getName());
		System.out.println(p.getAge());
		Person1 p2 = new Person1(); //默认调用无参构造方法
		
	    Person1 p3 = new Person1("zhang");
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		//方法重载
		Hellow h = new Hellow();
		h.hello();
		h.hello("ppp");
		h.hello("ppp",123);
		
		//继承
		Student student=new Student("xiao Ming",25,90);
		System.out.println(student.hello());
		
		//向上转型
		Father a = new Son(); 
		a.Song(); //调用父类得方法
		//((son)a)将强制转换为Son应用类型(向下转型)
		((Son)a).sleep(); //调用子类方法，不转换直接调用会出错
		if (a instanceof Son) { //使用instanceof判断一个变量所指向得实例是否是指定类型，避免向下转换出错
			((Son)a).sleep();
		}
	}

}
class Person1 {
	protected String name ;
	protected int age ;
	public Person1() {
		
	}
	public Person1(String name) {
		this(name,100); //使用this()调用另一个构造方法Person1(String,int)也就是下面的，这样的目的就是便于代码复用
	}
	//构造方法
	public Person1(String name,int age) {
		this.name = name;
		this.age = age;
		
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
}
//方法重载 就是方法名相同参数不同称为方法重载
class Hellow{
	public void hello() {
		System.out.println("hello world!");
	}
	public void hello(String name) {
		System.out.println("Hi, "+ name + "!");
	}
	public void hello(String name,int age) {
		System.out.println( name + " is " + age);
	}
}
/*
1、 继承，继承可以获得父类也称(超类)(基类)所有的功能，要注意子类定义的字段不能和父类重名,
2、java中继承关系 Student ————>Person1————>Object;默认创建的类编译器自动会加上extends Object,任何类(除了Object)都会继承某个类
3、java继承，一个类只能有一个父类。
4、继承的特点子类无法访问父类的private字段或者方法,需要将private改为protected才可以访问
*/
class Student extends Person1{
	
	private int score;
	
	public Student(String name,int age,int score) {
		super(name,age);      //任何class的构造方法，第一行必须是调用父类的构造方法，默认会在第一行加super();在这个case中使用默认的super()会报错
		//super();
		this.score=score;
	}
	
	public String hello() {
		return super.name+","+super.age+","+this.score;	//子类引用父类字段时可以用super.fieldName
	}
}

/*
向上转型和向下转型
向上转型：父类引用类型指向了子类得实例对象，此时无法使用子类得变量以及方法
向下转型：通过类型得强转，恢复了子类得成员变量以及方法
*/
class Father{
	String name="老爸";
	public void Song() {
		System.out.println(name+"在唱歌");
	}
}
class Son extends Father{
	String name="儿子";
	public void sleep() {
		System.out.println(name+"在睡觉");
	}
}











