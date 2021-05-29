/**
 * @author fly_beep
 */
package Five;

import java.util.ArrayList;
import java.util.Arrays;

public class TestFive {
	public static void main(String[] args)
	{
		Manager boss = new Manager("fly-beep",2000);
		boss.setBonus(5000);
		
		/*
		Employee[] staff = new Employee[3];
		staff[0] = boss;
		staff[1] = new Employee("John",1000);
		staff[2] = new Employee("Mary",1500);
		
		for (Employee employee : staff) {
			System.out.println(employee.getName() + "-" +  employee.getSalsary());
		}
		*/
		//����ʹ��ArrayListʵ����������
		ArrayList<Employee> staff = new ArrayList<Employee>();
		
		staff.add(boss);
		staff.add(new Employee("John",1000));
		staff.add(new Employee("Mary",1500));
		
		for (Employee e : staff) {
			System.out.println(e.getName() + "-" +  e.getSalsary());
		}
		
		/*
		 * ��java�У���������Ƕ�̬��
		 * һ��Employee�����ȿ�������һ��Employee����Ҳ��������һ��Employee�������
		 */
		
		//��һ������������඼������һ����������һ������ʵ�����������࣬���������ķ�����������û�и÷�������ȥ���ĳ������Ҹ÷�����
		
		//������ֹĳ���ඨ�����࣬�����дfinal�ؼ���
		//����������������final��ҪĿ���ǣ�ȷ�����ǲ����������иı����塣
		/*
		public final class Excutive extends Manager
		{
			//final �������з����Զ���Ϊfinal����
			public final String getName()
			{
				return name;
			}
		}
		*/
		
		//ʹ������ת����Ψһԭ������ʱ���Զ����ʵ������֮��ʹ�ö����ȫ�����ܡ�
		
		//��������
		//һ�����õı��ϰ�ߣ�
		//������д��
		//Manager aboss = (Manager) staff[1];
		//Ҫ������ת��֮ǰ�������Ƿ���Գɹ�ת����һ���ǽ�����ת��Ϊ����
		/*
		if(staff[1] instanceof Manager)
		{
			Manager aboss = (Manager) staff[1];
		}
		*/
		
		Person[] people = new Person[2];
		people[0] = new Employee("mht",100000);
		people[1] = new Student("fly_beep", "CS");
		
		for (Person p : people) {
			System.out.println(p.getName() + "," + p.getDercription());
		}
		
		/*
		 * ���ƿɼ��Ե�4���������η��ܽ᣺
		 * 1.���Ա���ɼ�--->private
		 * 2.��������ɼ�--->public
		 * 3.�Ա�������������ɼ�--->protected
		 * 4.�Ա����ɼ�--->Ĭ�ϣ�����Ҫ���η�
		 */
		
		//Object�ǳ��࣬ʹ��Object���͵ı��������κ����͵Ķ���
		//������Щ���ǿ��Ե�
		//��java�У�ֻ�л������Ͳ��Ƕ���
		Object obj = new Employee("Harry", 1000);
		Employee[] astaff = new Employee[10];
		obj = astaff;
		obj = new int[10];
		
		//ɢ����
		//s,t����ͬɢ���룬��sb,tb��һ��
		//������¶���equals���ͱ������¶���hashCode�������Ա��û����Խ�������뵽ɢ�б���
		String s = "Ok";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode() + " " + sb.hashCode());
		String t = "Ok";
		StringBuilder tb = new StringBuilder(t);
		System.out.println(t.hashCode() + " " + tb.hashCode());
			
		//ǿ�ҽ���Ϊÿ���Զ����඼����toString����
		System.out.println(boss);
		//String str = Arrays.toString(staff);
		//System.out.println(str);
		
		//��ʱ��Ҫ����������ת��Ϊ��������
		/*
		  *  �����װ��
		 * int--->Integer 
		 * long--->Long
		 * float--->Float
		 * double--->Double
		 * short--->Short
		 * byte--->Byte
		 * char--->Character
		 * void--->Void
		 * boolean--->Boolean
		 */
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3); //�ȼ���list.add(Integer.valueOf(3)); �Զ�װ�����
		int n = list.get(0); //�൱��int n = list.get(0).intValue(); �Զ��������
		//���ַ����������
		String sint = "1689";
		int x = Integer.parseInt(sint);
		System.out.println(x);
		
		double m = max(6.2,7.4,-6.2,51);
		System.out.println(m);
		
		
	}
	
	//�����ɱ�ķ���
	public static double max(double... values)
	{
		double largest = Double.NEGATIVE_INFINITY;
		for (double d : values) 
		{
			if (d > largest) 
			{
				largest = d;
			}
		}
		return largest;
	}
	
	/**
	 * ��Ƽ̳й�ϵ����
	 * 1.����������������ڳ���
	 * 2.��Ҫʹ���ܱ�������protected��
	 * 3.ʹ�ü̳�ʵ�֡�is-a����ϵ����Ҫ���ü̳У�
	 * 4.�������еļ̳ж������壬����Ҫʹ�ü̳�
	 * 5.�ڸ��Ƿ���ʱ����Ҫ�ı�Ԥ�ڵ���Ϊ
	 * 6.ʹ�ö�̬������������Ϣ
	 */
}


