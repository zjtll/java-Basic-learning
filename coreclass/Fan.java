package coreclass;


import java.util.ArrayList;
import java.util.List;

public class Fan {

	public static void main(String[] args) {
		//java提供了一个可变长度的数组ArrayList ,相比普通数组不需要提取定义长度，他是自动调节的，ArrayList内部就是一个Object[]数组。
		//泛型就是定义一种模板例如ArrayList<T>，然后在代码中为用到的类创建对应的ArrayList<类型>
		//注意泛型的继承关系：可以把ArrayList<Integer>向上转型为List<Integer>（T不能变！），但不能把ArrayList<Integer>向上转型为ArrayList<Number>（T不能变成父类）。
		
		ArrayList<Object> list = new ArrayList<>();
		list.add("asaa");
		list.add(123);
		for (Object a:list) {
			System.out.println(a);
		}
		System.out.println(list.get(0));
		
		//使用ArrayList的时候如果不定义泛型类型的时候，默认是object
		List list2 = new ArrayList(); //List是一个接口，ArrayList是实现接口的一个类，将ArrayList向上转型为List
		list2.add("hello");
		list2.add("world");
		System.out.println(list2.get(0));
		System.out.println(list2.get(1));
		
		//定义泛型类型为String和number,定义String只能传String类型的参数，Number只能传数字，否则会报错
		List<String> list3 = new ArrayList<String>();
		List<Number> list4 = new ArrayList<Number>(); //ArrayList<Number>()可以简写为ArrayList<>();
		list3.add("12");
		list4.add(123);
		
		pair<String> p = new pair<>("d", "df");
		System.out.println(p.getFirst());
	}

}

//编写泛型,将正常类String或者int换成T,并申明<T>, 泛型类型<T>不能用于静态方法（通常泛型类一般用于集合中例如ArrayList<T>）
class pair<T>{
	private T first;
	private T last;
	public pair(T first,T last) {
		this.first = first;;
		this.last = last;
		
	}
	public T getFirst() {
		return first;
	}
	public T getLast() {
		return last;
	}
		
}

//java语言的泛型实现方式是擦拭法，就是指虚拟机对泛型其实一无所知，所有的工作都是编译器做的，例如上面的pair ，虚拟机不知道这是泛型，虚拟机会将T看做是object
/*
Java 泛型的类型擦除机制: Java中的泛型基本上都是在编译器这个层次来实现的. 在生成的 Java 字节代码中是不包含泛型中的类型信息的. 使用泛型的时候加上的类型参数, 
会被编译器在编译的时候去掉. 这个过程就称为类型擦除.
*/

/*
泛型的局限性
 1、<T>不能是基本类型，例如int，因为实际类型是object ,object无法持有基本类型
 2、无法取得泛型的class 例如 p.getClass() 和p1.getClass()是相同的，因为T是object对pair<String>和pair<Integer>获取class时，获取的是同一个class
 3、无法判断带泛型的类型 if (p instanceof pair<String>),原因同上，并不存在pair<String>.class 只有唯一的pair.class
 4、一个类可以继承一个泛型类，例如父类是pair<Integer>,子类是IntPair,可以这么继承public class Intrair extends pair<Integer>，使用的时候因为子类没有泛型类型正常使用就行 
  IntPair ip = new IntPair(xxx);
*/

//java泛型通配符？extends T 和 ？ super T
/*
 * 1、在使用泛型类的时候例如可以定义一个List<Integer>的对象，传入的参数就是Integer,我们也可以使用通配符？来表示一个未知的类型例如List<?>，但是List<?>不等于List<object>，
 * List<?>表示所包含的类型是不确定的有可能是String也有可能是Integer，如果他包含了String的话再往里面添加Integer类型的元素就是错误的。
 * 2、正因为类型未知, 我们就不能通过 new ArrayList<?>() 的方法来创建一个新的ArrayList 对象, 因为编译器无法知道具体的类型是什么. 但是对于 List<?> 中的元素,
 *  我们却都可以使用 Object 来接收, 因为虽然类型未知, 但肯定是Object及其子类.
 * 3、java的泛型机制允许我们对泛型的参数类型的上界和下界做一些限制，例如
 * List<? extends Number> 定义了泛型的上界是Number 即List中包含的元素类型是Number及其子类
 * List<? super Number> 定义了泛型的下界是Number 即List中包含的元素类型是Number及其父类
 * 
 */
//? extends T  描述了通配符上界，泛型参数类型必须是T类型或者他的子类,例如
/*
List<? extends Number> numberArray = new ArrayList<Number>();  // Number 是 Number 类型的
List<? extends Number> numberArray = new ArrayList<Integer>(); // Integer 是 Number 的子类
List<? extends Number> numberArray = new ArrayList<Double>();  // Double 是 Number 的子类
 */
//? super T 描述了通配符下界，泛型参数必须是T类型或者是他的父类，例如
/*
List<? super Integer> array = new ArrayList<Integer>(); // 在这里, Integer 可以认为是 Integer 的 "父类"
List<? super Integer> array = new ArrayList<Number>();  // Number 是 Integer 的 父类
List<? super Integer> array = new ArrayList<Object>();  // Object 是 Integer 的 父类
 */

//使用场景
/*
PECE 原则: Producer Extends, Consumer Super
Producer extends: 如果我们需要一个 List 提供类型为 T 的数据(即希望从 List 中读取 T 类型的数据), 那么我们需要使用 ? extends T, 例如 List<? extends Integer>. 但是我们不能向这个 List 添加数据.
Consumer Super: 如果我们需要一个 List 来消费 T 类型的数据(即希望将 T 类型的数据写入 List 中), 那么我们需要使用 ? super T, 例如 List<? super Integer>. 但是这个 List 不能保证从它读取的数据的类型.
如果我们既希望读取, 也希望写入, 那么我们就必须明确地声明泛型参数的类型, 例如 List<Integer>.
 * 
 */

/*
 * 由于Java是强类型转换，如果不使用泛型，在运行时可能出现类型转换错误，该错误在编译时无法发现。
 * 但是使用了泛型，在编译时会做强类型检查，提高了类型转换的正确率。并且编译时类型擦除，即Java编译源码时，
 * 会删除所有的类型参数，替换类型为上下界，如果没有界限，则替换成Object。
 */






