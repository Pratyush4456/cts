package helloString;
import java.util.Scanner;
public class GetCharFromIndex {
	String str;
	void getting() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	str = sc.nextLine();
	System.out.println("Enter the index");
	int i = sc.nextInt();
	System.out.println("The value at index "+i+" is "+str.charAt(i));
	sc.close();
	}
}
