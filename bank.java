import java.util.Scanner;

class bankdemo {
	String name;
	String accno;
	String typacc;
	static float bal;
	float dep;
	float withd;
	Scanner s=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the name of the depositor");
		name=s.nextLine();
		System.out.println("Enter the account number");
		accno=s.next();
		System.out.println("Enter the type of account");
		typacc=s.next();
		System.out.println("Enter the initial balance");
		bal=s.nextFloat();
		
	}
	void deposit()
	{
		System.out.println("Enter the amount to be deposited");
		dep=s.nextFloat();
		bal+=dep;
	}
	void withdraw()
	{
		System.out.println("Enter the amount to be withdrawn from your account");
		withd=s.nextFloat();
		bal-=withd;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Available Balance"+bal);
	}
}
public class bank
{
	public static void main(String[] args) {
		bankdemo b=new bankdemo();
		b.input();
		b.deposit();
		b.withdraw();
		b.display();
	}
}
