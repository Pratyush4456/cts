import java.util.Scanner;
class Dublicate
{
public static void main(String args[])
{
int i,j,size;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array");
size = sc.nextInt();
System.out.println("Enter the array elements");
int a[] = new int[size];
for(i=0;i<size;i++)
{
a[i] = sc.nextInt();
}
System.out.println("The dublicate elements are");
for(i=0;i<size;i++){
for(j=size-1  ;j>i;j--){
if(a[i]==a[j]&&i!=j){
System.out.println(a[i]);
}
}
}
}
}
