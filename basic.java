package prog1;

import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		int ch;
		System.out.println("------Menu------");
		System.out.println("1.Enter Data");
		System.out.println("2.Update Data");
		System.out.println("3.Display Data");
		System.out.println("4.Exit");
		System.out.println("Enter your choice:");
		Scanner sc =new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1: System.out.println("Enter data");
				break;
		case 2: System.out.println("Update data");
		 		break;
		case 3: System.out.println("Display Data");
				break;
		case 4: System.out.println("Bye");
		}
		
		
	}

}
