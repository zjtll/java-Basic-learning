package aggregate;

import java.util.EnumMap;
import java.util.Map;

public class enummap {
   //使用Enummap ,因为HashMap是一种通过对key计算hashCode()，通过空间换时间的方式，直接定位到value所在的内部数组的索引，因此，查找效率非常高。
	//如果作为key的对象是enum类型，那么，还可以使用Java集合库提供的一种EnumMap，它在内部以一个非常紧凑的数组存储value，并且根据enum类型的key直接定位到内部数组的索引，
	//并不需要计算hashCode()，不但效率最高，而且没有额外的空间浪费。
	public static void main(String[] args) {
		Map<Weekday,String> map = new EnumMap<>(Weekday.class);
		map.put(Weekday.MON, "星期一");
		map.put(Weekday.TUE, "星期二");
		System.out.println(map);
	}

}
enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}