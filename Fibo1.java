import java.util.*;

public class Fibo1
{
     public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int a=0,b=1,c,n;
System.out.print("Enter the Series: ");
n= input.nextInt(); 

if(n<=0)
{
System.out.println("Please Enter Positive value.");

}
else if(n==1)
{
System.out.println(a);
System.out.println(b);

}
else
{
System.out.println(a);
System.out.println(b);
for (int i=2;i<n;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}


}