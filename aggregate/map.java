package aggregate;

import java.util.HashMap;
import java.util.Map;

public class map {
	//Map<k,v>是一种键-值映射表，Map也是一种接口最常用的实现类就是HashMap,hashmap根据key的hash值来确定value得位置，可以直接找到对应数据，不需要遍历
	//一个key只能关联一个value，上传多个同名key值不相同前面的值会被覆盖。key不能重复，value可以重复。
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("apple", 123); //传入k,v
		System.out.println(map.get("apple")); //123 获取apple的值
		System.out.println(map.containsKey("apple"));//true 判断是否存在key
		
	//遍历map,使用for each 。map.keyset()方法会返回不重复的key集合。
		map.put("pear", 456);
		map.put("banana", 789);
		
		for(String key : map.keySet()) {
			Integer value = map.get(key);
			System.out.println(key + "==" + value);
			
		}
		
	//同时遍历key和value可以使用for each 循环遍历Map对象的entryset集合
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + "==" + value);
		}
	}

}
