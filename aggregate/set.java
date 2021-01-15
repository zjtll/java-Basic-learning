package aggregate;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class set {
	//hashset用于存储不重复的元素,不保证有序,TreeSet输出是排序后的
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		System.out.println(set.add("abc")); //true
		System.out.println(set.add("xxx")); //true
		System.out.println(set);//[abc,xxx]
		System.out.println(set.add("abc")); //false 因为已经存在
		System.out.println(set.contains("abc"));//true
		System.out.println(set.size());//2
		System.out.println(set.remove("abc")); //true
		
		Set<String> set1 = new TreeSet<>();
		set1.add("aa");
		set1.add("tt");
		set1.add("zz");
		set1.add("cc");
		System.out.println(set1);//[aa,cc,tt,zz]
		
		String arr[] = set1.toArray(new String[set1.size()]);
		System.out.println(arr[1]);
	}

}
