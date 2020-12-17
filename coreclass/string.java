package coreclass;

import java.util.Arrays;

public class string {
	public static void main(String [] args) {
		//比较字符串相等使用eqals()，不能使用==，要忽略大小写比较可以使用equalsIgnorecase().
		String s1="hello";
		String s2="HELLO".toLowerCase(); //转化为小写字母
		System.out.println(s2); //hello
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		
		//String 类提供的搜索子串、提取子串 常用方法
		//是否包含子串
		System.out.println("Hello".contains("ll"));//true
		//返回字符串中第一个出现这个指定字符的索引，和最后一个出现指定字符的索引
		System.out.println("Hello".indexOf("l")); //2
		System.out.println("Hello".lastIndexOf("l"));//3
		//如果内容是字符串的前缀 和字符串的后缀则返回true,空和字符串本身都返回true
		System.out.println("Hello".startsWith("He"));
		System.out.println("Hello".endsWith("llo"));
		//提取子串,索引从0开始
		System.out.println("Hello".substring(2));   //llo
		System.out.println("Hello".substring(2,4));//ll
		//去掉首尾空白字符，trim() 包括\t(tab) \r(回车) \n(换行) ;
		System.out.println("\t Hello\r\n".trim());
		//System.out.println("\u3000Hello".strip()));//strip()可以删除中文的空格字符，在jdk11的时候才能使用。
		//isEmpty() isBlank() 判断字符串是否为空和空白字符串,isEmpty判断字符串长度是否为0或者str=null。isBlank判断是否为空白字符串
		System.out.println("".isEmpty()); //true 
		System.out.println(" ".isEmpty()); //false
		//" \n".isBlank(); //true 因为只有空白字符串
		// "hello ".isBlank();//false 包含非空白字符串
		//替换子串
		String s="hello";
		System.out.println(s.replace("ll", "cc")); //hecco
		//分割字符串
		String s3="A,B,C,D";
		String ss3[]=s3.split("\\,");
		System.out.println(Arrays.toString(ss3)); //[A,B,C,D]
		//拼接字符串
		String s4= String.join("***", ss3);
		System.out.println(s4);//A***B***C***D
		//格式化字符串
		System.out.printf("Hi %s, your score is %d! \n","boy",18);
		
		//类型转化
		//1、将任意类型转化为字符串使用静态方法valueof()
		System.out.println(String.valueOf(123.45)); //"123.45"
		System.out.println(String.valueOf(true)); //"ture"
		System.out.println(String.valueOf(new Object()));//"java.lang.Object@232204a1"
		//2、将字符串转化为int类型
		int n1 = Integer.parseInt("123"); //123
		int n2 = Integer.parseInt("ff",16); //256
		System.out.println(n1);
		System.out.println(n2);
		//3、将字符串转化为boolean类型
		boolean b1=Boolean.parseBoolean("true"); //true
		boolean b2 = Boolean.parseBoolean("false"); //false
		System.out.println(b1+" "+b2);
		//string和char可以相互转化 
		char[] cs = "hello".toCharArray(); //将字符串通过toCharArray 转化为字符数组
		System.out.println(cs); //hello
		String ss = new String(cs); //将字符数组转化为字符串
		System.out.println(ss);//hello
		
	}
}
