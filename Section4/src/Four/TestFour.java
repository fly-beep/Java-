/**
 * @author fly_beep
 */
package Four;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
//��̬����
import static java.lang.Math.*;

public class TestFour {
	public static void main(String[] args)
	{
		//���ǹ�������ģ�����ͼ
		//�๹�����Ĺ��̳�Ϊ�������ʵ��
		//��װ�����ݺ���Ϊ�����һ��������Զ����ʹ�������������ݵ�ʵ����ʽ
		//�����е����ݳ�Ϊʵ���򡢲������ݵĹ��̳�Ϊ����
		//ʵ�ַ�װ�Ĺؼ����ھ��Բ��������еķ���ֱ�ӷ��ʵ��������ʵ����
		
		/*
		 * ��֮��Ĺ�ϵ
		 * 1.���� ����A�ķ���������B�Ķ�����˵��A��������B  Ҫ�������������������
		 * 2.�ۺ� ��A�Ķ��������B�Ķ���
		 * 3.�̳� ��A��չ��B����A������������B�̳еķ���������ӵ��һЩ����Ĺ���
		 */
		
		//ʹ�ù���������ʵ��
		System.out.println(new Date());
		//����
		String s = new Date().toString();
		//�������
		Date birthday = new Date();
		//һ�����������û��ʵ�ʰ���һ�����󣬶���������һ������
		//������ʽ�ؽ������������Ϊnull���൱��ֻ��ָ��null,���ǲ��ܽ�һ������Ӧ����һ��ֵΪnull�Ķ���
		birthday = null;
		//ERROR ���ܽ�һ������Ӧ����һ��ֵΪnull�Ķ���
		//s = birthday.toString();
		
		/*�������߽�����ʱ��͸�ʱ��������ֿ�
		  ��ʾʱ��㣺Date��
		  ������ʾ����LocalDate��	
		*/
		LocalDate date = LocalDate.of(2021, 5, 24);
		int year = date.getYear();
		int month = date.getMonthValue();
		int day_month = date.getDayOfMonth();
		int day_year = date.getDayOfYear();
		System.out.println(year + "-" + month + "-" + day_month + "-" + day_year);
		
		//ʹ���Լ�����
		MyClass myClass = new MyClass("fly_beep", 18);
		MyClass[] myClass_set = new MyClass[3];
		
		System.out.println(myClass.getName() + "-" + myClass.getAge());
		myClass.addAge(50);
		System.out.println(myClass.getName() + "-" + myClass.getAge());
		
		//����name-> private final String name�������޸ģ�Ҳ�Ͳ���ҪsetName����
		//myClass.setName("flybeep");
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		double x = 0.1;
		System.out.println(currencyFormatter.format(x));
		System.out.println(percentFormatter.format(x));
		//�������������������ͣ�
		// - ������������
		// - ��������
		// һ�����������޸Ļ����������͵Ĳ��������ǿ��Ըı�������ã��������ú�����������ͬ����һ������
		// java�ĵ�����ֵ���ã��������õ��� eg. ���������������ò�����ʵ�֣���Ϊ��������ʱ������������������ԭ���ı�����Ȼ���÷�������֮ǰ�Ķ���
		
		//��������������������(overloading) 
		//��������������ͬ�����֣���ͬ�Ĳ����������������
		//��������ͬ�����֣���ͬ�Ĳ������ز�ͬ������
		StringBuilder messages = new StringBuilder();
		StringBuilder todoList = new StringBuilder("To do :\n");
		
		//�ڱ�дһ����ʱû�б�д������ϵͳ���ṩһ���޲ι������������Լ�д�ˣ�ϵͳ�����ṩһ���޲ι�����
		//java����Ҫ������������Ϊjava�������Զ����ջ���
		
		//���ᱨ��ʹ���˾�̬����
		sqrt(2);
	}
}

/*
 * static�ؼ���
 * 1.��̬��
 * eg. MyClass���number�����ҽ���100��MyClass����ô����100��name��age������ֻ��һ��number
 * 	   �������࣬��ʹû��һ��MyClass���󣬵���numberҲ����
 * 2.��̬����
 * eg. public static final doube PI = 3.1415926535;
 * 	   System.out��һ����̬��������System��������
 * 3.��̬���� --> ���������ʵʩ�����ķ���
 * eg. Math.pow()
 * 	   get����������ص���static�������getNumber���Զ����ɵ�ʱ����Ǵ�static�ģ����õ�ʱ�����������.getNumber()
 * 4.�������� ��������ģʽͨ�����幤��������(��ӿ�)�����崴������Ĺ����ӿڣ�����������(��ʵ����)�������ɾ���Ķ���
 * eg. LocalDate��NumberFormat
 * 5.main����
  * ����Ҫʹ�ö�����þ�̬������ÿһ���඼������һ��main
 */

//�����Լ�����
class MyClass
{
	//ǿ�ҽ����౾��ķ�����ʵ���򣩱��Ϊprivate
	//private final String name;
	private String name;
	private int age;
	private static int number;
	
	//������
	/*����������ͬ��
	 * ÿ��������г���1��������
	 * ������������0��1���������
	 * ������û�з���ֵ
	 * ���������ǰ�����new����һ�����
	 */
	public MyClass(String n,int a) {
		name = n;
		age = a;
	}
	
	//�������
	//ע�ⲻҪ��д���ÿɱ����Ͷ���ķ�����������eg. Date��LocalDate����Ҫ������
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//���ֺ��������ֶ����ԣ����������ָ���һЩ����Ϊ��������ʵ����;ֲ�����
	/*public void addAge(int byPercent) {
		int raise = age * byPercent / 100;
		age += raise;
	}*/
	
	public void addAge(int byPercent) {
		int raise = this.age * byPercent / 100;
		this.age += raise;
	}

	public static int getNumber() {
		return number;
	}

	public static void setNumber(int number) {
		MyClass.number = number;
	}
}

/**
 * ����Ƽ���
 * a.һ��Ҫ��֤����˽��
 * b.һ��Ҫ�����ݳ�ʼ��
 * c.��Ҫ������ʹ�ù���Ļ�������
 * d.�������е�����Ҫ����������������������
 * e.��ְ����������зֽ�
 * f.�����ͷ�����Ҫ���������ǵ�ְ��
 * g.����ʹ�ò��ɱ����
 */
