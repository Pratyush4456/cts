package filePackage;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) {
		int i=0,n;
		String x;
		Set s = new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the initial no of elements in the set");
		n = sc.nextInt();
		System.out.println("enter the elements");
		for(i=0;i<n;i++);
		{
			s.add(sc.next());
		}
		System.out.println("Enter the new element");
		x = sc.next();
		s.add(x);
		if(s.add(x))
		{
			System.out.println("new element added");
		}
		else
		{
			System.out.println("element already exists");
		}
      sc.close();
	}

}
