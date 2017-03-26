import java.util.Scanner;

class test
{
	String s;
	Scanner sc=new Scanner(System.in);
	void getStrng()
	{
		System.out.println("Enter the string");
		s=sc.next();
	}
	
	void exchn()
	{
		char []ch=new char[s.length()+2];
		char a=s.charAt(s.length()-1);
		ch[0]=a;
		ch[s.length()+1]=a;
		for(int i=1;i<=s.length();i++)
		{
			ch[i]=s.charAt(i-1);
		}
		String str=new String(ch);
		System.out.println(str);
	}
}
public class CharBackFront {

	public static void main(String[] args) {
		test t=new test();
		t.getStrng();
		t.exchn();

	}

}
