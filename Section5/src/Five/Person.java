package Five;

/*
 * ���󷽷��䵱ռλ�Ľ�ɫ�����ǵľ���ʵ���������С�
 * ��չ������������ѡ��
 * 1.�ڳ������ж��岿�ֳ����෽���򲻶�������෽���������ͱ��������Ҳ��ǳɳ�����
 * 2.����ȫ���ĳ��󷽷�����������Ͳ��ǳ������
 * 
 *  �����಻�ܱ�ʵ����
 *  new Person("fly_beep"); //��仰���Ǵ����
 *  
 * ���ǿ��Զ���һ��������Ķ������
 * Person p = new Student("fly_beep","CS");
 * ����p��һ��������Person�ı�����Person������һ���ǳ�������Student��ʵ��
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
