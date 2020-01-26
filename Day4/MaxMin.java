import java.util.Scanner;
import java.util.Arrays;
class MaxMin
{
public static void main(String args[])
{
int size,i;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
size = sc.nextInt();
int arr[] = new int[size];
System.out.println("Enter the elements");
for(i=0;i<size;i++)
{
arr[i] = sc.nextInt();
}
Arrays.sort(arr);
System.out.println("The smallest element is "+arr[0]);
System.out.println("The largest element is "+arr[i-1]);
}
}