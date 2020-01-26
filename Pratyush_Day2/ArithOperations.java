import java.util.Scanner;
class ArithOperations
{
public static void  main(String args[])
{
int num1,num2;
float output;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the two nos");
num1=sc.nextInt();
num2=sc.nextInt();
output=num1+num2;
System.out.println("The sum of the entered nos is "+output);
output=num1*num2;
System.out.println("The multiplication of the entered nos is "+output);
output=num1-num2;
System.out.println("The difference of the entered nos is "+output);
output=num1/num2;
System.out.println("The division of the entered nos is "+output);
output=num1%num2;
System.out.println("The remainder of the entered nos is "+output);
}
}

