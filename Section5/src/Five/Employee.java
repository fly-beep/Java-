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
		
		//getClass��������һ�������������࣬�ڼ���У�ֻ��������������ͬһ����ʱ�����п�����ȡ�
		if (getClass() != otherObject.getClass()) {		//<3>
			return false;
		}
		
		Employee other = (Employee) otherObject;	//<4>
		
		/*
			return name.equals(other.name) 
			       && salsary == other.salsary;
		*/
		//Ϊ��ֹname����null�������ʹ������ķ���
		//��������������null��Objects.equals����true
		//��һ��null������false
		//������Ϊnull,�����name.equals(other.name)
		return Objects.equals(name, other.name)		//<5>
			   && salsary == other.salsary;
	}
	
	//7,11���Լ����ѡ��
	/*
	public int hashCode()
	{
		return 7 * name.hashCode() + 11 * Double.hashCode(salsary);
	}
	*/
	
	//��������null��ȫ
	/*
	public int hashCode()
	{
		return 7 * Objects.hashCode(name) + 11 * Double.hashCode(salsary);
	}
	*/
	
	//��õķ���
	public int hashCode()
	{
		return Objects.hash(name,salsary);
	}
	
	//equals��hashCode�Ķ������һ�£����x.equals(y)����true����ôx.hashCode()==y.hashCode()
	//equals�Ƚ�ʲô��,hashCode��Ҫ����ʲô
	
	//toString���������ڷ��ر�ʾ����ֵ���ַ���
	public String toString()
	{
		return getClass().getName()
			+ "[name=" + name
			+ ",salsary" + salsary
			+ "]";
	}
}




