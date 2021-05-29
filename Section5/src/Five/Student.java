/**
 * @author fly_beep
 */
package Five;

public class Student extends Person {
	private String major;
	
	public Student(String name,String major)
	{
		super(name);
		this.major = major;
	}
	
	public String getDercription()
	{
		return "A student majoring in " + major;
	}
}
