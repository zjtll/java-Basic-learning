package helloworld;
/*
 * 1、类中实例字段的特点是，每个实例都有独立的字段，各实例的同名字段互不影响
 * 2、使用static修饰的字段称为静态字段 : static filed
 * 3、实例字段在每个实例中都有自己的一个独立“空间”，但是静态字段只有一个共享“空间”，所有实例都会共享该字段
 * 4、对于静态字段无论那个实例修改了值，效果都是一样的，所有的实例值都会被修改，因为静态字段并不属于实例。
 * */
public class static_field {

	public static void main(String[] args) {
		person6 p6 = new person6();
		person6 p7 = new person6();
		p6.name6="aaa";
		System.out.println(p7.name6);
		p7.name6="bbb";
		System.out.println(p6.name6);
		
		System.out.println(zoo.number);
		zoo.setnum(200);
		System.out.println(zoo.number);
}
}
class person6{
	public static String name6;
}
//静态方法，用static修饰的方法称为静态方法
//调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以访问，静态方法类似其他编程的函数
class zoo{
	public static  int number=100;
	public static void setnum(int value) {
		number=value;
	}
}
//接口的静态字段，因为interface是一个纯抽象类不能又实例字段，但是可以又静态字段，并且静态字段必须为final类型
interface person7{
	// 不写编译器会自动加上public statc final:
	public static final  int age=1;
	public static final String name = "vvv";
}
