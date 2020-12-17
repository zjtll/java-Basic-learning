package coreclass;
public class StringJoiner {
  
	public static void main(String[] args) {
		//使用StringJoiner拼接如下字符串
		//Hello Bob, Alice, Grace!
		String names[] = {"Bob", "Alice", "Grace"};
		java.util.StringJoiner sj = new java.util.StringJoiner(", ", "Hello ", "!"); //如果需要加上字符串开头和结尾就需要多加俩个开头和结尾参数，默认一个参数为分隔符
		for (String name:names) {
			sj.add(name);
		}
		System.out.println(sj.toString());
		//使用静态方法实现，这个方法在内部使用了StringJoiner来拼接，再不需要指定开头和结尾的时候用String.join更方便。
		String names1[] = {"Bob", "Alice", "Grace"};
		String s = String.join(", ", names1);
		System.out.println(s);
		int x=100;
		Integer n=x;
		System.out.println(x);
		System.out.println(n);
	}
   
	/*
	 * 1、使用指定字符串拼接字符串数组时候使用StringJoiner或者String.join()更方便
	 * 2、使用StringJoiner可以额外附加一个开头和结尾
	 * */
	
	
}
