package Five;

/*
 * 抽象方法充当占位的角色，它们的具体实现在子类中。
 * 扩展抽象类有两种选择
 * 1.在抽象类中定义部分抽象类方法或不定义抽象类方法，这样就必须把子类也标记成抽象类
 * 2.定义全部的抽象方法，这样子类就不是抽象的了
 * 
 *  抽象类不能被实例化
 *  new Person("fly_beep"); //这句话就是错误的
 *  
 * 但是可以定义一个抽象类的对象变量
 * Person p = new Student("fly_beep","CS");
 * 这里p是一个抽象类Person的变量，Person引用了一个非抽象子类Student的实例
 */
public abstract class Person {
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	
	public abstract String getDercription();
	
	public String getName()
	{
		return name;
	}
}
