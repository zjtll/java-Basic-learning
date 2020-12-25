package coreclass;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Commontools {

	public static void main(String[] args) {
		//Math类的作用就是用来计算的
		System.out.println(Math.abs(-100));//100 取绝对值 
		System.out.println(Math.max(100, 99)); //100 取最大值
		System.out.println(Math.min(1, 2)); //1 取最小值
		System.out.println(Math.pow(2, 6)); //64 计算2的6次方
		System.out.println(Math.sqrt(2)); //1.414 开根
		System.out.println(Math.exp(2));//7.389 计算e的2次方 
		System.out.println(Math.log(4)); //1.369 计算以e为低4的对数
		System.out.println(Math.log10(10));//1 计算以10位低的10对数
		//三角函数
		System.out.println(Math.sin(3.14));
		System.out.println(Math.cos(3.14));
		System.out.println(Math.tan(3.14));
		System.out.println(Math.asin(1.0));
		System.out.println(Math.acos(1.0));
		//常量
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//随机数，Math.random() 范围在 [0,1)
		System.out.println(Math.random());
		
		Random a = new Random();
		System.out.println(a.nextInt()); //生成int范围内的随机整数
		System.out.println(a.nextInt(10)); //生成[0,10)范围内的随机整数
		System.out.println(a.nextLong()); //生成long范围内的随机整数
		System.out.println(a.nextFloat());//生成float范围内的随浮点数
		System.out.println(a.nextDouble());//生成double范围内的随机浮点数
		
		//使用random生产伪随机数,伪随机数就是指定一个初始的种子，产生的序列号是一样的
		//前面使用的Math.random()实际上内部调用了Random类，所以它也是伪随机数，只是我们无法指定种子。如果不给定种子，就使用系统当前时间戳作为种子，因此每次运行时，种子不同，得到的伪随机数序列就不同。
		Random r = new Random(12345);
		for (int i=1;i <=10; i++) {
			System.out.println(r.nextInt(100));
			//51、80、41、28、55
		}
		
		
		 //真随机数，SecureRandom,
		SecureRandom se = new SecureRandom();
		System.out.println(se.nextInt(100));//[1,100)
		
		SecureRandom sr = null;
	        try {
	            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
	        } catch (NoSuchAlgorithmException e) {
	            sr = new SecureRandom(); // 获取普通的安全随机数生成器
	        }
	        byte[] buffer = new byte[16];
	        sr.nextBytes(buffer); // 用安全随机数填充buffer
	        System.out.println(Arrays.toString(buffer));

	}

}
