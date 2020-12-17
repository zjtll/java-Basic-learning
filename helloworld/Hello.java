package helloworld;

import java.util.concurrent.ArrayBlockingQueue;

/**
@author zjt
@version v1.0
文档注释，注释内容可以被JDK提供的工具javadoc所解析，生成一套以网页形式的说明文档
javadoc -d myjava -author -version www.java 
-d 指定生成的目录，www.java是java程序
*/
/*
	注释
	1、一个java文件可以有多个class 但是只能有一个class声明为public,并且这个类的名称必须与文件名称相同
	2、java程序需要通过javac编译为.class的字节码文件，完后通过java命令运行程序，java命令其实就是调用了jvm
	3、main 方法为程序的入口
*/
public class Hello {
	public static void main(String[] args) {
		System.out.println("hello world !");
		//final 为常量不能被修改
		final int a=1;
		System.out.println(a);
		char c1 = 'A';
		System.out.println((int)c1);
		/*
		 \\u为转义字符后面为16进制的数字
		*/
		char c2 = '\u0041'; 
		System.out.println(c2);
		//+号链接字符，\n换行 \t tab键 \回车 \转义字符
		String s = "first line "
				+ "second line "
				+"end";
		System.out.println(s);
		//位移运算，x<< 2  表示将x得二进制数向左移2位，>>2表示向右移动2位。
		//如果x为负数,x>>2表示x最高位还是1不动，结果仍然是负数，>>>(无符号右移，右移动后高位补0对负数右移会变成正数)
		int m=1;
		System.out.println(m << 3);
		/*
		 关系运算优先级从高到底
		 ！
		 > >= < <=
		 == !=
		 &&
		 ||
		 */
		
		boolean nn = 2>1;
		System.out.println(nn);
		
		byte abc='A';
		System.out.println(abc);
		//异或运算规则，俩数不同结果为1，俩数相同为0
		int n = 0 ^ 0;
		System.out.println(n);
		//三元运算 b ? x : y  意思是如果b为true则只计算x否则只计算y
		int k = 10;
		int mm = k < 10 ? k : -k;
		System.out.println(mm);
		//数组类型
		int arr[] = new int[5];
		arr[0]=11;
		arr[1]=22;
		arr[3]=44;
		System.out.println(arr[3]);
		System.out.println("arr数组的长度是:"+arr.length);
		//定义数组时直接指定初始化元素
		int arrb[]=new int[] {68,69,70,71,72,74,90};
		System.out.println("arrb数组的长度为："+arrb.length);
		//简写为
		int arrc[]= {68,69,70,71,72,74,90,100};
		System.out.println("arrc数组的长度为："+arrb.length);
		System.out.println(arrc[1]);
		//字符串数组
		String name[] = {"aa","bb","cc"};
		System.out.println(name[1]);
		
	}
}

