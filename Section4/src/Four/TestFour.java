/**
 * @author fly_beep
 */
package Four;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Date;
//静态导入
import static java.lang.Math.*;

public class TestFour {
	public static void main(String[] args)
	{
		//类是构造对象的模板和蓝图
		//类构造对象的过程称为创建类的实例
		//封装将数据和行为组合在一个包里，并对对象的使用者隐藏了数据的实现形式
		//对象中的数据称为实例域、操纵数据的过程称为方法
		//实现封装的关键在于绝对不能让类中的方法直接访问到其他类的实例域
		
		/*
		 * 类之间的关系
		 * 1.依赖 若类A的方法操作类B的对象，则说类A依赖于类B  要尽量减少依赖，低耦合
		 * 2.聚合 类A的对象包含类B的对象
		 * 3.继承 类A扩展类B，类A不但包含从类B继承的方法，并且拥有一些额外的功能
		 */
		
		//使用构造器构造实例
		System.out.println(new Date());
		//对象
		String s = new Date().toString();
		//对象变量
		Date birthday = new Date();
		//一个对象变量并没有实际包含一个对象，而仅仅引用一个对象
		//可以显式地将对象变量设置为null，相当于只是指向null,但是不能将一个方法应用于一个值为null的对象
		birthday = null;
		//ERROR 不能将一个方法应用于一个值为null的对象
		//s = birthday.toString();
		
		/*类库设计者将保存时间和给时间点命名分开
		  表示时间点：Date类
		  日历表示法：LocalDate类	
		*/
		LocalDate date = LocalDate.of(2021, 5, 24);
		int year = date.getYear();
		int month = date.getMonthValue();
		int day_month = date.getDayOfMonth();
		int day_year = date.getDayOfYear();
		System.out.println(year + "-" + month + "-" + day_month + "-" + day_year);
		
		//使用自己的类
		MyClass myClass = new MyClass("fly_beep", 18);
		MyClass[] myClass_set = new MyClass[3];
		
		System.out.println(myClass.getName() + "-" + myClass.getAge());
		myClass.addAge(50);
		System.out.println(myClass.getName() + "-" + myClass.getAge());
		
		//若把name-> private final String name，不能修改，也就不需要setName方法
		//myClass.setName("flybeep");
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
		NumberFormat percentFormatter = NumberFormat.getPercentInstance();
		double x = 0.1;
		System.out.println(currencyFormatter.format(x));
		System.out.println(percentFormatter.format(x));
		//方法参数共有两种类型：
		// - 基本数据类型
		// - 对象引用
		// 一个方法不能修改基本数据类型的参数，但是可以改变对象引用，对象引用和其他拷贝共同引用一个对象
		// java的调用是值调用，而非引用调用 eg. 交换两个对象引用并不能实现，因为方法结束时，参数变量被舍弃，原来的变量仍然引用方法调用之前的对象
		
		//如下这种特征叫做重载(overloading) 
		//如果多个方法有相同的名字，不同的参数，便产生了重载
		//不能有相同的名字，相同的参数返回不同的类型
		StringBuilder messages = new StringBuilder();
		StringBuilder todoList = new StringBuilder("To do :\n");
		
		//在编写一个类时没有编写构造器系统会提供一个无参构造器、但若自己写了，系统不会提供一个无参构造器
		//java不需要析构函数，因为java有垃圾自动回收机制
		
		//不会报错，使用了静态导入
		sqrt(2);
	}
}

/*
 * static关键字
 * 1.静态域
 * eg. MyClass类的number，若我建立100个MyClass，那么会有100个name和age，但是只有一个number
 * 	   它属于类，即使没有一个MyClass对象，但是number也存在
 * 2.静态常量
 * eg. public static final doube PI = 3.1415926535;
 * 	   System.out是一个静态常量，在System类中声明
 * 3.静态方法 --> 不能向对象实施操作的方法
 * eg. Math.pow()
 * 	   get方法如果返回的是static，下面的getNumber，自动生成的时候就是带static的，调用的时候必须用类名.getNumber()
 * 4.工厂方法 工厂方法模式通过定义工厂抽象父类(或接口)负责定义创建对象的公共接口，而工厂子类(或实现类)则负责生成具体的对象。
 * eg. LocalDate、NumberFormat
 * 5.main方法
  * 不需要使用对象调用静态方法，每一个类都可以有一个main
 */

//定义自己的类
class MyClass
{
	//强烈建议类本身的方法（实例域）标记为private
	//private final String name;
	private String name;
	private int age;
	private static int number;
	
	//构造器
	/*构造器与类同名
	 * 每个类可以有超过1个构造器
	 * 构造器可以有0、1、多个参数
	 * 构造器没有返回值
	 * 构造器总是伴随着new操作一起调用
	 */
	public MyClass(String n,int a) {
		name = n;
		age = a;
	}
	
	//域访问器
	//注意不要编写引用可变类型对象的访问器方法，eg. Date、LocalDate不需要访问器
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
	
	//这种和下面这种都可以，但下面那种更好一些，因为可以区分实例域和局部变量
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
 * 类设计技巧
 * a.一定要保证数据私有
 * b.一定要对数据初始化
 * c.不要在类中使用过多的基本类型
 * d.不是所有的域都需要独立的域访问器和域更改器
 * e.将职责过多的类进行分解
 * f.类名和方法名要能体现他们的职责
 * g.优先使用不可变的类
 */
