package Five;

//Manager类继承Employee类 
public class Manager extends Employee{
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double abonus) {
		this.bonus = abonus;
	}
	
	public double getSalsary()
	{
		//super关键字的使用，子类想要使用超类的同名函数
		//super是一个指示编译器调用超类方法的特殊关键字
		return super.getSalsary() + bonus;
	}
	
	public Manager(String aname,int asalary)
	{
		super(aname,asalary);
		bonus = 0;
	}
	
	/**
	 * this关键字有两个用途：
	 * 1.引用隐式参数
	 * 2.调用该类其他的构造器
	 * super关键字也有2个用途
	 * 1.调用超类的方法
	 * 2.调用超类的构造器
	 */
	
	//在子类中调用equals方法，首先调用父类的equals，若调用失败，则不需要继续比较 ; 若相等，则继续比较
	public boolean equals(Object otherObject)
	{
		if (!super.equals(otherObject)) {
			return false;
		}
		Manager other = (Manager) otherObject;
		return bonus == other.bonus;
	}
	
	public String toString()
	{
		return super.toString()
			 + "[bonus" + bonus
			 + "]";
	}
}
