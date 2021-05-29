package Five;

import java.util.Objects;

public class Employee extends Person {
	private String name;
	private int id;
	private double salsary;
	
	private static int nextId = 1;
	
	/*public Employee()
	{
		this.setName("");
		this.setSalsary(0.);
	}*/
	
	{
		setId(nextId);
		nextId++;
	}
	
	public Employee(String aname,int asalary)
	{
		super(aname);
		this.name = aname;
		this.salsary = asalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalsary() {
		return salsary;
	}

	public void setSalsary(double salsary) {
		this.salsary = salsary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDercription()
	{
		return String.format("An employee with a salary of $%.2f", salsary);
	}
	
	public boolean equals(Object otherObject)
	{
		if (this == otherObject) {	//<1>
			return true;
		}
		
		if (otherObject == null) {	//<2>
			return false;
		}
		
		//getClass方法返回一个对象所属的类，在检测中，只有两个对象属于同一个类时，才有可能相等。
		if (getClass() != otherObject.getClass()) {		//<3>
			return false;
		}
		
		Employee other = (Employee) otherObject;	//<4>
		
		/*
			return name.equals(other.name) 
			       && salsary == other.salsary;
		*/
		//为防止name出现null的情况，使用下面的方法
		//若两个参数都是null，Objects.equals返回true
		//有一个null，返回false
		//若都不为null,则调用name.equals(other.name)
		return Objects.equals(name, other.name)		//<5>
			   && salsary == other.salsary;
	}
	
	//7,11是自己随机选的
	/*
	public int hashCode()
	{
		return 7 * name.hashCode() + 11 * Double.hashCode(salsary);
	}
	*/
	
	//下面这种null安全
	/*
	public int hashCode()
	{
		return 7 * Objects.hashCode(name) + 11 * Double.hashCode(salsary);
	}
	*/
	
	//最好的方法
	public int hashCode()
	{
		return Objects.hash(name,salsary);
	}
	
	//equals与hashCode的定义必须一致，如果x.equals(y)返回true，那么x.hashCode()==y.hashCode()
	//equals比较什么，,hashCode就要计算什么
	
	//toString方法，用于返回表示对象值的字符串
	public String toString()
	{
		return getClass().getName()
			+ "[name=" + name
			+ ",salsary" + salsary
			+ "]";
	}
}




