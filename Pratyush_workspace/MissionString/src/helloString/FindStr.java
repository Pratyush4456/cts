package helloString;
import java.util.Scanner;
public class FindStr {
 String str;
 String subStr;
 Scanner sc = new Scanner(System.in);
 void find() {
	 System.out.println("Enter the string");
	 str = sc.nextLine();
	 System.out.println("Enter the substring");
	 subStr = sc.nextLine();
	 if(str.contains(subStr))
	 {
		 System.out.println("Substring is present in the string");
	 }
	 else
	 {
		 System.out.println("Substring is't present in the string");
	 }
 }
 
}
