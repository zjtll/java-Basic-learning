package coreclass;

public class PackagingType {

	public static void main(String[] args) {
		
	/*
	 * java的数据类型分为俩种
	 * 1、基本数据类型：byte,short,int,long,boolean,float,double,char
	 * 2、引用类型：所有class和interface，string
	  *  引用类型可以赋值为null,表示空，基本数据类型不能赋值bull
	 */
		
		int i = 100;
		//通过new操作符创建Integer实例可以将int转化为Integer(引用类型) (不推荐使用,会有编译警告)
		// 创建新对象时，优先选用静态工厂方法而不是new操作符。
		Integer n1 = new Integer(i);
		System.out.println(n1);//100
		//通过静态方法valueof(int)创建Integer实例
		Integer n2 = Integer.valueOf(i);
		System.out.println(n2); //100
		//通过静态方法valueof(String)创建Integer实例
		Integer n3 = Integer.valueOf("100");
		System.out.println(n3.intValue());//100
		
		//int和Integer相互转化
		int i1=200;
		Integer n4 = Integer.valueOf(i1);
		int x1 = n4.intValue();

		//Auto Boxing(自动装箱:这种直接把int变为Integer的赋值写法。把Integer变为int的赋值写法，称为自动拆箱（Auto Unboxing)
		int x = 100;
		Integer y = x;  // 编译器自动使用Integer.valueOf(int)
		int m = y;      // 编译器自动使用Integer.intValue()
		System.out.println(y);
		System.out.println(x);
		//对俩个Integer实例比较实用equals不能使用“==”，因为Integer属于引用类型
		//parseInt()方法可以将字符串解析为整数
		int x2 = Integer.parseInt("100"); //100
		int x3 = Integer.parseInt("100", 16); //256,按16进制解析

	}

}
class test{
	private String name;
	private int age;

	
	
}
