package helloworld;

import java.util.Arrays;

/*
 * 面向对象学习基础方法学习
 * 
 * 定义方法的语句为：
 * 修饰符  方法返回类型  方法名（方法参数列表）{
 *     方法语句；
 *     return 方法返回值；
 * }
 */
public class Object_Oriented {
	
	public static void main(String[] args) {
		//实例化Person类 
		Person ming = new Person();
		System.out.println(ming.name);
		System.out.println(ming.age);
		
		//实例化Book类
		Book book=new Book();
		book.setName("  java ");
		book.setMoney(50);
		System.out.println(book.getName()+" "+ book.getMoney());
		int aab[] = {1,2,3,4,5};
		for (int x : aab) {
			System.out.println(x);
		}
		//可变参数实例化
		
		Group g=new Group();
		g.setNames("a","b");
		System.out.println(g.getNames());
		g.setAges(new int[] {1,2,3});
		System.out.println(g.getAges());
	}
	
}
	
//创建一个Person类，类中定义俩个字段使用的修饰符public表示公开的，
class Person{
	public String name = "jack";
	public int age = 18;
}
//创建类book,定义name 和money为私有的，不能直接访问，所以需要使用方法来进行访问。class也可以2为私有的作用是内部直接可以访问调用，外部不行
class Book{
	private String name;
	private int money;
	
	public void setName(String name) {
		if(name == null) {
			throw new IllegalArgumentException("invalid name"); 
		}
		this.name=name.trim(); //去掉首尾空格，在方法内部可以使用变量this,他始终指向当前实例，通过this.name就可以访问当前实例的字段
	}
	public void setMoney(int money) {
		if(money < 0 || money >100) {
			throw new IllegalArgumentException("invalid age value");
			
		}else {
		this.money=money;
	}
		}
	public String getName() {
		return this.name;
	}
	public int getMoney() {
		return this.money;
	}
	
}
//可变参数,用“类型...”表示，可变参数相当于数组类型，

class Group{
	private String[] dog;
	private int[] ages;
	//可变参数类型用 类型...表示
	public void setNames(String... dog) {
		this.dog=dog;
		
	}
	public String getNames() {
		return Arrays.toString(this.dog);
	}
	//将可变参数类型写为类型[]，这样写调用得时候需要自己先构造int[]比较麻烦，另一个问题就是这样写可以传如null值(实际接受值为空数组不代表空值)，而上面那种可变参数不可以传null
	public void setAges(int[] ages) {
		this.ages=ages;
	}
	public String getAges() {
		return Arrays.toString(this.ages);
	}

}






