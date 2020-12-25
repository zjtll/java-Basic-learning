package coreclass;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Trycatch {

	public static void main(String[] args) {
		/*
		 java中凡是可能跑出异常的语句都可以用try...catch捕获。把可能发生异常的语句放在try{...}中，然后使用catch捕获对应的Exception
		   1、多catch语句，就是每个catch分别捕获对应的Exception及其子类，jvm在捕获到异常后会从上到下匹配catch语句，匹配到后执行catch代码块，后面不在执行
		           简单讲就是多个catch语句只能有一个被执行,
		   2、存在多个catch语句时候，catch的顺序为Exception子类写在前面。
		   3、使用try catch不会中断程序。try catch捕获的异常是源代码里定义的throw new 抛出的异常
		*/
		
		/*
	    try {
	        process1();
	        process2();
	        process3();
	    } catch (UnsupportedEncodingException e) {
	        System.out.println("Bad encoding");
	    } catch (IOException e) {
	        System.out.println("IO error");
	    }
       */
		//finally语句 的作用就是不管有没有发生异常都会执行该语句，下面的语句不管捕获异常都会在最后打印END，这个语句是保证一些必须执行的代码，可有可无，总是在最后执行
		/*
		public static void main(String[] args) {
		    try {
		        process1();
		        process2();
		        process3();
		    } catch (UnsupportedEncodingException e) {
		        System.out.println("Bad encoding");
		    } catch (IOException e) {
		        System.out.println("IO error");
		    } finally {
		        System.out.println("END");
		    }
		}
	   */
		//断言使用关键字assert来实现断言,断言预期结果为true如果为false则断言失败抛出AssertionError，会找出程序中断，只应该用于测试，对于可恢复的错误正确的做法是抛出异常在上层捕获
		int x = 1;
		assert x<0 : "x小于0"; //加上: "xxxx"是一个可选断言消息，会在断言失败的时候打印“xxx”便于调试
		//当某个方法抛出了异常时，如果当前方法没有捕获异常，异常就会被抛到上层调用方法，直到遇到某个try ... catch被捕获为止：
		try {
			process1();
		} catch (Exception e) {
			e.printStackTrace(); //通过printstacktrace()方法打印方法的调用栈
		}
		
		process3(null);
		
}
		static void process1() {
			process2();
		}
		static void process2() {
			Integer.parseInt(null);// 会抛出NumberFormatException
		}
		
		
		//抛出异常,当调用process3传入的是null的时候会抛出异常
		
		static void process3(String s) {
			if(s == null) {
				throw new NullPointerException();
			}
		}
	
	
	
}
