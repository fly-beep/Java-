/**
 * @author fly_beep
 */
package Three;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class TestThree {
	public static void main(String[] args) throws IOException
	{
		//String函数使用
		String str = "Hello ";
		System.out.println(str.compareTo("Hello"));
		System.out.println(str.indexOf("l",3));
		System.out.println(str.codePointCount(0, 4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		//消除空格
		System.out.println(str.trim());
		System.out.println(str.join(" ",str , "World!"));
		
		//构造字符串
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		builder.append(" World");
		String completedString = builder.toString();
		System.out.println(completedString);
		
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name? ");
		String name = in.nextLine();
		System.out.println("Your name is" + name);
		//in.next 获取以空格分隔
		
		double a = (-10000.0 / 3.0);
		//printf可以打印不同格式，类似C语言
		//用,分隔数字
		System.out.printf("%,.2f\n", a);
		//将负数用()括起来
		System.out.printf("%(.2f\n", a);
		
		//写入txt文件
		PrintWriter out = new PrintWriter("src\\\\Three\\\\txt\\\\1.txt","UTF-8");
		out.append("Hello java ~");
		out.flush();
		out.close();
		
		//读取txt文件
		Scanner ini = new Scanner(Paths.get("src\\Three\\txt\\1.txt"),"UTF-8");//要抛异常
		System.out.println(ini.nextLine());
		
		BigInteger bi = BigInteger.valueOf(1);
		for (int i = 2; i < 10000; i++) {
			//bi = bi.multiply(i).divide(i - 1);
			//注意BigInteger赋值以及运算只能用相应的函数
			bi = bi.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(i - 1));
		}
		System.out.println(bi);
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		//for-each方法
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println();
		//打印数组内值得简单方法
		System.out.println(Arrays.toString(array));
		
		//数组初始化以及匿名数组
		int[] annoymous = {12 , 19 , 26 , 31};
		int[] smallPrimes = annoymous;
		System.out.println(Arrays.toString(smallPrimes));
		
		//数组拷贝，多余用0，boolean用false
		int[] luckynumbers = Arrays.copyOf(smallPrimes, smallPrimes.length * 2);
		System.out.println(Arrays.toString(luckynumbers));
		//数组排序
		Arrays.sort(luckynumbers);
		System.out.println(Arrays.toString(luckynumbers));
		//二分查找
		int flag = Arrays.binarySearch(luckynumbers, 12);
		System.out.println(flag);
		//整体赋值
		Arrays.fill(luckynumbers, 12);
		System.out.println(Arrays.toString(luckynumbers));
		
		//二位数组
		int[][] balance = 
		{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//打印二位数组
		for (int i = 0; i < balance.length; i++) {
			for (int j = 0; j < balance[i].length; j++) {
				System.out.print(balance[i][j] + " ");
			}
		}
		System.out.println();
		//快速打印
		System.out.println(Arrays.deepToString(balance));
		
		//创建一个不规则数组,java实际并没有多维数组，而是"数组的数组"
	}
}
