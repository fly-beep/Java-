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
		//下面使用ArrayList实现上述功能
		ArrayList<Employee> staff = new ArrayList<Employee>();
		
		staff.add(boss);
		staff.add(new Employee("John",1000));
		staff.add(new Employee("Mary",1500));
		
		for (Employee e : staff) {
			System.out.println(e.getName() + "-" +  e.getSalsary());
		}
		
		/*
		 * 在java中，对象变量是多态的
		 * 一个Employee变量既可以引用一个Employee对象，也可以引用一个Employee子类对象
		 */
		
		//若一个类和它的子类都定义了一个方法，若一个对象实际类型是子类，则调用子类的方法，若子类没有该方法，则去它的超类中找该方法。
		
		//若想阻止某个类定义子类，则可以写final关键字
		//将方法或类声明成final主要目的是：确保它们不会在子类中改变语义。
		/*
		public final class Excutive extends Manager
		{
			//final 类中所有方法自动成为final方法
			public final String getName()
			{
				return name;
			}
		}
		*/
		
		//使用类型转换的唯一原因：在暂时忽略对象的实际类型之后，使用对象的全部功能。
		
		//尽量少用
		//一个良好的编程习惯：
		//这句是有错的
		//Manager aboss = (Manager) staff[1];
		//要在类型转换之前，看看是否可以成功转换，一般是将超类转换为子类
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
		 * 控制可见性的4个访问修饰符总结：
		 * 1.仅对本类可见--->private
		 * 2.对所有类可见--->public
		 * 3.对本包和所有子类可见--->protected
		 * 4.对本包可见--->默认，不需要修饰符
		 */
		
		//Object是超类，使用Object类型的变量引用任何类型的对象
		//下面这些都是可以的
		//在java中，只有基本类型不是对象
		Object obj = new Employee("Harry", 1000);
		Employee[] astaff = new Employee[10];
		obj = astaff;
		obj = new int[10];
		
		//散列码
		//s,t有相同散列码，而sb,tb不一样
		//如果重新定义equals，就必须重新定义hashCode方法，以便用户可以将对象插入到散列表中
		String s = "Ok";
		StringBuilder sb = new StringBuilder(s);
		System.out.println(s.hashCode() + " " + sb.hashCode());
		String t = "Ok";
		StringBuilder tb = new StringBuilder(t);
		System.out.println(t.hashCode() + " " + tb.hashCode());
			
		//强烈建议为每个自定义类都增加toString方法
		System.out.println(boss);
		//String str = Arrays.toString(staff);
		//System.out.println(str);
		
		//有时需要将基本类型转换为对象类型
		/*
		  *  对象包装器
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
		list.add(3); //等价于list.add(Integer.valueOf(3)); 自动装箱机制
		int n = list.get(0); //相当于int n = list.get(0).intValue(); 自动拆箱机制
		//将字符串变成整型
		String sint = "1689";
		int x = Integer.parseInt(sint);
		System.out.println(x);
		
		double m = max(6.2,7.4,-6.2,51);
		System.out.println(m);
		
		
	}
	
	//参数可变的方法
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
	 * 设计继承关系建议
	 * 1.将公共操作和域放在超类
	 * 2.不要使用受保护的域（protected）
	 * 3.使用继承实现“is-a”关系（不要滥用继承）
	 * 4.除非所有的继承都有意义，否则不要使用继承
	 * 5.在覆盖方法时，不要改变预期的行为
	 * 6.使用多态，而非类型信息
	 */
}


