package aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class equal {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("Xiao", "Ming", 18));
		list.add(new Person("Xiao", "Hong", 25));
		list.add(new Person("Bob", "Smith", 20));
		
	
		boolean exist = list.contains(new Person("Bob", "Smith", 20)); //调用contains和indexof这些方法会调用equals()方法
		System.out.println(exist ? "测试成功!" : "测试失败!");
	}
}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	/**
	 * TODO: 覆写equals方法
	   注：要正确使用List的contains()、indexOf()这些方法，放入的实例必须正确覆写equals()方法，
	         否则，放进去的实例，查找不到。我们之所以能正常放入String、Integer这些对象，是因为Java标准库定义的这些类已经正确实现了equals()方法。
	   1、先确定实例“相等”的逻辑，即哪些字段相等，就认为实例相等；
	   2、用instanceof判断传入的待比较的Object是不是当前类型，如果是，继续比较，否则，返回false；
	   3、对引用类型用Objects.equals()比较，对基本类型直接用==比较。
	   4、使用Objects.equals()比较两个引用类型是否相等的目的是省去了判断null的麻烦。两个引用类型都是null时它们也是相等的。
       5、如果不调用List的contains()、indexOf()这些方法，那么放入的元素就不需要实现equals()方法。
	 */
	public boolean equals(Object o) {
		if (o instanceof Person) { //用instanceof判断传入的待比较的Object是不是当前类型，如果是，继续比较，否则，返回false；
			Person p =  (Person) o; //使用Objects.equals()比较两个引用类型是否相等的目的是省去了判断null的麻烦。两个引用类型都是null时它们也是相等的。
			return Objects.equals(this.firstName, p.firstName) && Objects.equals(this.lastName, p.lastName)
					&& this.age == p.age;
		}
		return false;
	}
}
