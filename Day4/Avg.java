import java.util.Scanner;
public class Avg
{
public static void main(String args[])
{
int i,num;
float avg,sum=0.0f;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
num = sc.nextInt();
int arr[] = new int[num];
System.out.println("Enter the elements of the array");
for(i=0;i<num;i++)
{
arr[i] = sc.nextInt();
sum = sum+arr[i];
}
avg = sum/num;
System.out.println("The avg of the array elements is "+avg);
}
}


