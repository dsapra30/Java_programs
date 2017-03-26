abstract class Student
{
	String name;
	int id;
	int grade;
	int age;
	String addr;
	abstract boolean isPassed(double grade);
	
}
class UnderGrad extends Student
{

	
	boolean isPassed(double grade) {
		if(grade>70.0)
		{
			return true;
		}
		else 
		{
		return false;
		}
	}
	
}
class Grad extends Student
{

	
	boolean isPassed(double grade) {
		if(grade>80.0)
		{
			return true;
		}
		else 
		{
		return false;
		}
	}
	
}
public class Test1 {

	public static void main(String[] args) {
		UnderGrad ug=new UnderGrad();
		Grad g=new Grad();
		System.out.println(ug.isPassed(80));
		System.out.println(g.isPassed(45));
		
	}

}
