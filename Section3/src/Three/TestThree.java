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
		//String����ʹ��
		String str = "Hello ";
		System.out.println(str.compareTo("Hello"));
		System.out.println(str.indexOf("l",3));
		System.out.println(str.codePointCount(0, 4));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		//�����ո�
		System.out.println(str.trim());
		System.out.println(str.join(" ",str , "World!"));
		
		//�����ַ���
		StringBuilder builder = new StringBuilder();
		builder.append(str);
		builder.append(" World");
		String completedString = builder.toString();
		System.out.println(completedString);
		
		Scanner in = new Scanner(System.in);
		System.out.println("What's your name? ");
		String name = in.nextLine();
		System.out.println("Your name is" + name);
		//in.next ��ȡ�Կո�ָ�
		
		double a = (-10000.0 / 3.0);
		//printf���Դ�ӡ��ͬ��ʽ������C����
		//��,�ָ�����
		System.out.printf("%,.2f\n", a);
		//��������()������
		System.out.printf("%(.2f\n", a);
		
		//д��txt�ļ�
		PrintWriter out = new PrintWriter("src\\\\Three\\\\txt\\\\1.txt","UTF-8");
		out.append("Hello java ~");
		out.flush();
		out.close();
		
		//��ȡtxt�ļ�
		Scanner ini = new Scanner(Paths.get("src\\Three\\txt\\1.txt"),"UTF-8");//Ҫ���쳣
		System.out.println(ini.nextLine());
		
		BigInteger bi = BigInteger.valueOf(1);
		for (int i = 2; i < 10000; i++) {
			//bi = bi.multiply(i).divide(i - 1);
			//ע��BigInteger��ֵ�Լ�����ֻ������Ӧ�ĺ���
			bi = bi.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(i - 1));
		}
		System.out.println(bi);
		
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		//for-each����
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println();
		//��ӡ������ֵ�ü򵥷���
		System.out.println(Arrays.toString(array));
		
		//�����ʼ���Լ���������
		int[] annoymous = {12 , 19 , 26 , 31};
		int[] smallPrimes = annoymous;
		System.out.println(Arrays.toString(smallPrimes));
		
		//���鿽����������0��boolean��false
		int[] luckynumbers = Arrays.copyOf(smallPrimes, smallPrimes.length * 2);
		System.out.println(Arrays.toString(luckynumbers));
		//��������
		Arrays.sort(luckynumbers);
		System.out.println(Arrays.toString(luckynumbers));
		//���ֲ���
		int flag = Arrays.binarySearch(luckynumbers, 12);
		System.out.println(flag);
		//���帳ֵ
		Arrays.fill(luckynumbers, 12);
		System.out.println(Arrays.toString(luckynumbers));
		
		//��λ����
		int[][] balance = 
		{
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//��ӡ��λ����
		for (int i = 0; i < balance.length; i++) {
			for (int j = 0; j < balance[i].length; j++) {
				System.out.print(balance[i][j] + " ");
			}
		}
		System.out.println();
		//���ٴ�ӡ
		System.out.println(Arrays.deepToString(balance));
		
		//����һ������������,javaʵ�ʲ�û�ж�ά���飬����"���������"
	}
}
