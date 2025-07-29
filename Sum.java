//sum of odd even numbers in array
import java.util.*;
public class Sum
{
public static void main(String[] args)
{
int n,sumE=0,sumO=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of array");

n=input.nextInt();
int[] a =new int[n]; 
System.out.println("Enter the elements");

for(int i=0;i<n;i++)
{

a[i]=input.nextInt(System.in);
}
for(int i=0;i<0;i++)
{
if(i%2==0)
{
sumE=sumE+a[i];
}
else
{
sumO=sumO+a[i];
}
}
System.out.println("The sum of even number is:  "+sumE);
System.out.println("The sum of odd number is:  "+sumO);

}
}
