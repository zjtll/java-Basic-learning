package coreclass;

public class Enum {

	public static void main(String[] args) {
		//枚举类说明，使用enum定义枚举类
		/* 1、枚举类本身是有类型的Weekday.SUN的类型是Weekday,他只能和同类型的比较不能和int等进行比较，也不能和不同类型的枚举类相互比较，因为类型不符。
		 * 2、枚举类是引用类型但是可以使用“==”比较，因为enum类型的每个常量再jvm中有唯一的实例，所以可以直接用==比较
		 * 3、枚举类总是继承自java.lang.Enum，且无法被继承；
		 * 4、只能定义出Enum的实例无法进行new创建实例
		 * 5、可以将enum应用于switch
		 * */
		Weekday day = Weekday.SUN;
		if (day == Weekday.SAT || day == Weekday.SUN) {
			System.out.println("work at home");
		}else {
			System.out.println("work is office");
		}
		System.out.println(Weekday.MON.name()); //MON 返回常量名
		System.out.println(Weekday.MON.ordinal()); //1 返回常量的顺序，从0开始，改变枚举类定义的顺序就会导致ordinal()返回值异常。
		//
		Weekdays days = Weekdays.SUN;
		
		if (days.dayvalue == 6 || days.dayvalue ==0) {
			System.out.println("work at home");
		}else {
			System.out.println("work is office");
		}
	}

}
enum Weekday{
	 SUN, MON, TUE, WED, THU, FRI, SAT;
}
//定义private构造方法给每个枚举常量添加字段
enum Weekdays{
	MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6), SUN(0);
	public final int dayvalue;
	private Weekdays(int dayvalue) {
		this.dayvalue=dayvalue;
	}
	
}
//在switch的应用
/*
 * public class Main {
    public static void main(String[] args) {
        Weekday day = Weekday.SUN;
        switch(day) {
        case MON:
        case TUE:
        case WED:
        case THU:
        case FRI:
            System.out.println("Today is " + day + ". Work at office!");
            break;
        case SAT:
        case SUN:
            System.out.println("Today is " + day + ". Work at home!");
            break;
        default:
            throw new RuntimeException("cannot process " + day);
        }
    }
}

enum Weekday {
    MON, TUE, WED, THU, FRI, SAT, SUN;
}

 * 
 */











