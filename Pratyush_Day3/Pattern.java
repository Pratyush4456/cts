import java.util.Scanner;
public class Pattern
{
public static void main(String args[])
{
int num,i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no");
num = sc.nextInt();
for(i=1;i<num;i++){
for(j=1;j<=i;j++){
System.out.print(j);
}
System.out.println();
}
}
}