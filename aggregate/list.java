package aggregate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class list {
	//java数组可以看做是一种集合，但是数组初始化后大小是固定的，只能按照索引顺序读取。
	/*
	 * java的util包中主要提供一下三种类型的集合 ,
	 	1、List :一种有序列表集合
	 	2、Set :一种保证没有重复元素的集合
	 	3、Map : 一种通过键值k-v查找的映射表集合
	
	 */
		
		public static void main(String[] args) {
			//ArrayList在内部使用数组来存储所有的元素，通常优先使用ArrayList,List接口允许添加重复的元素,list允许添加null元素
			//例如，一个ArrayList拥有5个元素，实际数组大小为6（即有一个空位）,当添加一个元素并指定索引到ArrayList时，ArrayList自动移动需要移动的元素,然后将size+1；
			List<String> list = new ArrayList<>();
			list.add("apple"); //size=1
			list.add("pear"); //size=2
			list.add("apple"); //size=3
			System.out.println(list.size());
			//遍历list常见方法 使用for each
			for (String o : list) {
				System.out.println(o+",");
			}
			//List和array相互转化
			//list转化为数组使用list.toArray()
			String array[] = list.toArray(new String[list.size()]);
			for (String arr:array) {
				System.out.print(arr+" ");
			}
			//数组转化为List使用Arrays.asList()
			Integer[] arr1 = {1,2,3};
			List<Integer> list3 = Arrays.asList(arr1);
			for (Integer arr3:list3) {
				System.out.print(arr3+" ");
			}
			
		}

	}
