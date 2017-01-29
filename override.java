package prog1;
class bike
{
	 void run()
	{
	System.out.println("Bike class");
	}
}
class vehicle extends bike 
{
	void run()
	{
		System.out.println("Vehicle class");
	}
}
public class override {
	
	
	public static void main(String[] args) {
		
		vehicle v=new vehicle();
		v.run();
	}

}
