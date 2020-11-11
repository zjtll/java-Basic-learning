package helloworld;

import java.util.Arrays;



public class arr {

	public static void main(String[] args) {
		
		// 遍历数组
		int arr1[]= {1,4,9,10,18,20};
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
		//for each循环遍历
		for (int o : arr1) {
			System.out.print(o+",");
		}
		
		//直接打印数组变量得到的是数组在jvm中引用的地址
		System.out.println(arr1);
		
		//使用java标准库提供的Arrays.toString()打印数组内容
		System.out.println(Arrays.toString(arr1));
		
		//冒泡排序
		int ns[]= { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		System.out.println("排序前:  "+Arrays.toString(ns)); //排序前
		for (int count = 0;count<ns.length - 1;count++) { //设置一共比较的次数，比如5个数需要4次第一次从左到右相邻的比较完后选出一个最大的在右边， 
			for (int s=0;s < ns.length -1 -count;s++) {    //-count是因为上层for循环完毕后会选出一个最大的数，下次比较的时候就少比较1次，一次类推
				if (ns[s]>ns[s+1]) {
					int tmp =ns[s];
					ns[s]=ns[s+1];
					ns[s+1]=tmp;
				}
				
			}
			System.out.printf("第%d次排序结果:  %s",count+1,Arrays.toString(ns));
			System.out.println("");
			}
		System.out.println("排序后:  "+Arrays.toString(ns));//排序后
		
		//使用java标准可提供的排序功能
		int ns1[]= {3,4,2,56,23,1,12,58,60,100};
		Arrays.sort(ns1);
		System.out.println(Arrays.toString(ns1));
		
		
		//二维数组，二维数组就是数组的数组
		int ms[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11}
		};
		System.out.println(ms.length); //长度为3
		System.out.println(ms[1][2]); //7
		//打印二维数组
		for(int x[] : ms) {
			for (int y:x) {
			System.out.print(y);
			System.out.print(" ");
			}
		}
		//使用java标准库输出二维数组Arrays.deepToString()
		System.out.println(Arrays.deepToString(ms));
        
		//三位数组就是二维数组的数组,很少用
		int ns3[][][] = {
				{
					{1,2,3},
					{4,5,6},
					{7,8,9}
				},
				{
					{10,11,12},
					{13,14,15},
					{15,16,17}
				}	
		};
		System.out.println(ns3[0][1][1]); //5
		System.out.println(Arrays.deepToString(ns3));
		
		//命令行参数
		//public static void main(String[] args) ，main是程序的入口，可以接受一个命令行的参数，类型是String[]数组
		/* 只能在命令行执行，先javac编译完后 java main -version 
		 public class main {
			    public static void main(String[] args) {
			        for (String arg : args) {
			            if ("-version".equals(arg)) {
			                System.out.println("v 1.0");
			                break;
			            }
			        }
			    }
			} 
		  
		 
		 */
	}

}
