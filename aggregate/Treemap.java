package aggregate;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
	//hashmap是一种空间换时间的映射表，他的实现原理决定了key是无序的，遍历key的时候顺序不可预测（但每个key都会遍历一次且仅一次）
	//SortedMap会对key在内部进行排序，SortedMap接口的实现类是TreeMap
	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("orange", 1);
		map.put("apple", 2);
		map.put("pear", 3);
		for (String key : map.keySet()) {
			System.out.println(key); //apple orange pear 输出的顺序是按照字母排序的
		}

		/*
		 * 1、使用Treemap的时候放入的类必须实现comparable接口。String和integer这些类以及实现了所以可以直接使用，作为value的对象没有任何要求
		 * 	   如果作为key的class没有实现comparable接口，那么必须在创建TreeMap的时候指定一个自定义排序算法
		 * 2、Comparator接口要求实现一个比较方法，它负责比较传入的两个元素a和b，如果a<b，则返回负数，通常是-1，如果a==b，则返回0，如果a>b，则返回正数，通常是1。
		 *    TreeMap内部根据比较结果对Key进行排序。
		 */
		Map<Student, Integer> map1 = new TreeMap<>(new Comparator<Student>() {
			@Override
			public int compare(Student p1, Student p2) {
				// TODO Auto-generated method stub
				//return p1.name.compareTo(p2.name); //使用key排序
				if (p1.score == p2.score) {          //使用value分数排序
					return 0;
				}
				return p1.score > p2.score ? 1 : -1;
			}
		});
		 map1.put(new Student("Tom", 77), 1);
	     map1.put(new Student("Bob", 66), 2);
	     map1.put(new Student("Lily", 99), 3);
	     for (Student key1 : map1.keySet()) {
	    	 System.out.println(key1);
	     }
	     System.out.println(map1.get(new Student("Bob", 66)));
	}

}
class Student{
	public String name;
	public int score;
	Student(String name,int score){
		this.name=name;
		this.score=score;
		
	}
	public String toString(){ //toString相当于System.out.println();
		return String.format("{%s:score=%d}", name,score);
	}
}
