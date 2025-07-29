import java.util.*;
public class Swap {

public static void main(String args[]){
    
 Scanner input = new Scanner(System.in);
int a,b,temp;
System.out.println("Enter the value of a: ");
a= input.nextInt();
System.out.println("Enter the value of b: ");
b=input.nextInt();

System.out.println("Before a,b :"+a+b);
temp=a;
a=b;
b=temp;
System.out.println("After a,b : "+a+b);

}

}