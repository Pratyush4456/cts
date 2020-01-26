import java.util.Scanner;
public class Search
{
public static void main(String args[])
{
int num,i,size;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
size = sc.nextInt();
int arr[] = new int[size];
System.out.println("Enter the elements of the array");
for(i=0;i<size;i++)
{
arr[i] = sc.nextInt();
}
System.out.println("Enter the no to be searched");
num = sc.nextInt();
for(i=0;i<size;i++)
{
if(num==arr[i])
{
System.out.println("The no is found at index "+i);
break;
}
}
if(i==size)
{
System.out.println("The no is not present in the array");
}
}
}