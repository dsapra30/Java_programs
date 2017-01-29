package prog1;
enum Days
{
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	Days(int n)
	{
		
	}
}

public class Enumexample {
	Days d;
	public Enumexample(Days d){
		this.d=d;
	}
	public static void main(String[] args) {
		
		for(Days d:Days.values())
		{
			System.out.println(d);
		}
	}

}
