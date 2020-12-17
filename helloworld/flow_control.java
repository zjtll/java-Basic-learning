package helloworld;

import java.util.Scanner;
/**
  @author zjt
  @version 1.0
 */
public class flow_control {

	public static void main(String[] args) {
		//格式化输出使用printf，常用占位符有%d(整数)、%x(十六进制数)、%f(浮点数)、%e(科学计数法)、%s(字符串)
		
		double d = 3.1415926;
		int n = 97;
		System.out.printf("%.2f\n", d);
		//俩个占位符传入俩个参数
		System.out.printf("n=%d,hex=%x\n",n,n);
		//输入
		Scanner scannet = new Scanner(System.in); //创建scanner对象.system.in代表输入 system.out代表输出
		System.out.println("请输入name:");
		String name = scannet.nextLine();       //获取输入的字符串赋值给name
		System.out.println("请输入age:");
		int age = scannet.nextInt();           //获取输入的数字赋值给age
		System.out.printf("名字:%s,年龄:%d\n",name,age);
		
		//if判断
		if (d>n) {
			System.out.println("3.14大");
		}else {
			System.out.println("3.14小");
		}
		//判断变量是否相等可以用"=="，判断引用类型是否相等使用equals()方法。因为==只能判断他们是否指向同一个对象
		//基本类型：byte，short，int，long，boolean，float，double，char
		//引用类型：String  所有class和interface类型
		String s1 = "hello";
		String s2 = "HELLO".toLowerCase();
		System.out.println(s2);
		if(s1.equals(s2)) {
			System.out.println("s1字符串和s2相等");
		}else {
			System.out.println("s1字符串和s2不相等");
		}
		//计算体质指数BMI
		System.out.println("请输入身高(m):");
		float height = scannet.nextFloat();
		System.out.println("请输入体重(kg)");
		float weight = scannet.nextFloat();
		float mbi = weight/(height*height);
		System.out.println(mbi);
		if (mbi >= 32) {
			System.out.println("非常肥胖");
		}else if(mbi >= 28 && mbi <32) {
			System.out.println("肥胖");
		}else if(mbi >=25 && mbi <28) {
			System.out.println("过重");
		}else if(mbi >=18.5 && mbi <25) {
			System.out.println("正常");
		}else {
			System.out.println("过轻");
		}
		
		//switch语句
		int op = 5;
		switch (op) {
		case 1:
			System.out.println("select 1");
			break;
		case 2:
			System.out.println("select 2");
			break;
		case 4:
			System.out.println("select 4");
			break;
		default:
			System.out.println("Not select");
			break;
		}
		
		//while 语句计算1..100的和
		int i = 1;
		int sum = 0;
		while (i<=100) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
		
		//do while 计算1..100的和
//		do {
//			sum = sum +i;
//			i++;
//		}while(i<=100);
//		System.out.println(sum);
		
		//for 循环
		int sum1 = 0;
		for (int i1=1;i1<=100;i1++) {
			sum1 = sum1 + i1;
		}
		System.out.println(sum1);
		
		//for 循环遍历数组
		int arr1[]= {1,2,4,8,16,32};
		for (int ar=0;ar<arr1.length;ar++) {
			System.out.println(arr1[ar]);
		}
		//for each循环，for each 可以遍历所有“可迭代”的数据类型包括数组、list、map
		for (int ar1 : arr1) {
			System.out.println(ar1);
		}
		//9*9
		for (int x=1;x<=9;x++) {
			for(int y=1;y<=x;y++) {
				
				System.out.printf("%d*%d=%d ",y,x,x*y);
				
			}
			System.out.println("");
		//break语句用于跳出自己所在的循环，continue用于结束本次循环进行下次循环
			
		}

	}

}
