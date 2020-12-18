package coreclass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Biginteger {

	public static void main(String[] args) {
		//1、BigInteger的作用可以表示任意大小的整数，BigInteger的内部使用int[]来模拟一个非常大的数字，常用在使用的整数范围超过Long的长度
		//2、和long型整数相比较没有范围限制，缺点是运算速度有点满
		BigInteger bi =new BigInteger("123456789");
		System.out.println(bi.pow(5)); //取5次方计算结果远超过long范围但是还能输入
		//做BigInteger运算的时候只能用实例方法
		BigInteger i1 = new BigInteger("1234567890");
		BigInteger i2 = new BigInteger("12345678901234567890");
		BigInteger sum = i1.add(i2); // 12345678902469135780
		System.out.println(sum);
		/*
		   将Biginteger转换为long型,转换时如果超过了基本类型的范围将会丢失最高位结果不准确，可
		    以使用intValueExact()、longValueExact()等方法，在转换时如果超出范围，将直接抛出ArithmeticException异常。
		*/

		System.out.println(bi.intValue());
		//System.out.println(i2.intValueExact());
		/*
		 * 转换为byte：byteValue()
		   转换为short：shortValue()
		   转换为int：intValue()
		   转换为long：longValue()
		   转换为float：floatValue()
		   转换为double：doubleValue()
		 * 
		 * */
		
		//BigDecimal 和 BigInteger 类似，BigDecimal可以表示一个任意大小且精度完全准确的浮点数
		
		BigDecimal bd = new BigDecimal("123.4567");
		BigDecimal bd1 = new BigDecimal("123.4500");
		BigDecimal bd2 = new BigDecimal("1234500");
		System.out.println(bd.multiply(bd));// 15241.55677489 计算乘
		
		System.out.println(bd.scale());//4 scale表示小数的位数
		System.out.println(bd1.scale());//4 
		System.out.println(bd2.scale());//0
		
		System.out.println(bd1.stripTrailingZeros());//123.45 去掉末尾的0
		
		BigDecimal bd3 = bd.setScale(2, RoundingMode.HALF_UP); //设置保留位数，并四舍五入
		BigDecimal bd4 = bd.setScale(2, RoundingMode.DOWN); //设置保留位数，直接截断
		System.out.println(bd3 + ", "+bd4); //123.46 123.45
		
		//对BigDecimal做加、减、乘时精度不会丢失，但是在做除时候，无法除尽的情况下需要指定精度截断
		BigDecimal bd5 = new BigDecimal("23.456789");
		BigDecimal bd6 = bd.divide(bd5, 10,RoundingMode.HALF_UP); //保留10位小数并四舍五入
		System.out.println(bd6);
		
		//BigDecimal比较数字大小的时候使用compareTo()而不能使用equals,因为使用equals不仅要求值相等还要求scale相等
		//必须使用compareTo()方法来比较，它根据两个值的大小分别返回负数、正数和0，分别表示小于、大于和等于。
		System.out.println(bd.compareTo(bd1)); //1
		
	}

}
