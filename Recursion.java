//Program for factorial using recursion
import java.util.*;
public class Recursion
{
public int fact(int n)
{
int total=1;
if(n>=1)
total=n*fact(n-1);
return total;
}
public static void main(String[] args)
{
int n;
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
n=s.nextInt();

Recursion f=new Recursion();
System.out.println("Factorial is "+f.fact(n));


}
}