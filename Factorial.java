// program to find Factorial
import java.util.*;
public class Factorial
{
public static void main(String args[])
{
int num;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
num=s.nextInt();

int fact=1;
int i;
for(i=num;i>0;i--)
{
fact*=i;
}
System.out.println("factorial of"+num+": "+ fact);
}
}