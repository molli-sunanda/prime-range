import java.util.*;
public class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter max number");
int max=sc.nextInt();
System.out.println("Enter min number");
int min=sc.nextInt();
System.out.println("the prime numbers are");
int count;
for(int i=max;i<=min;i++)
{
count=0;
for(int j=1;j<=i;j++)
{
if(i%j==0)
count=count+1;
}
if(count==2)
System.out.println(i);
}
}
}