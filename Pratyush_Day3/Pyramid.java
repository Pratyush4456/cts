import java.util.Scanner; 
class Pyramid
{
public static void main(String args[])
{
int i,j,num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no");
num = sc.nextInt();
for(i=0;i<=num;i++){
for(j=num;j>i;j--){
System.out.print(" ");
}
for(j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println();
}
}
}
