package Five;

//Manager��̳�Employee�� 
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
		//super�ؼ��ֵ�ʹ�ã�������Ҫʹ�ó����ͬ������
		//super��һ��ָʾ���������ó��෽��������ؼ���
		return super.getSalsary() + bonus;
	}
	
	public Manager(String aname,int asalary)
	{
		super(aname,asalary);
		bonus = 0;
	}
	
	/**
	 * this�ؼ�����������;��
	 * 1.������ʽ����
	 * 2.���ø��������Ĺ�����
	 * super�ؼ���Ҳ��2����;
	 * 1.���ó���ķ���
	 * 2.���ó���Ĺ�����
	 */
	
	//�������е���equals���������ȵ��ø����equals��������ʧ�ܣ�����Ҫ�����Ƚ� ; ����ȣ�������Ƚ�
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
