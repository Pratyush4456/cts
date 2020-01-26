package helloString;
import java.util.Scanner;
public class StringRev {
	String str;
	int j = 0;
	Scanner sc = new Scanner(System.in);
	void reverse() {
		
		System.out.println("Enter the string");
		str = sc.nextLine();
		char a[] = new char[str.length()];
	for(int i=str.length()-1;i>=0;i--)
	{
		
	     a[i] = str.charAt(j);
	      	     j++;
	}
	String str3 = String.valueOf(a);
	
		if(str.equals(str3))
		{
			System.out.println("Pelindrome");
		}
		else
		{
			System.out.println("not a pelindrome");
		}
	
}
}