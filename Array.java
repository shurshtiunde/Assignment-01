//program to add numbers by array
import java.util.*;
public class Array{
    public static void main(String args[]){
       int n,sum=0;
    Scanner input = new Scanner(System.in);
System.out.println("Enter the size:");

      n=input.nextInt();
     int arr[]=new int[n];
System.out.println("Enter the numbers:");
      for (int i=0;i<n;i++){
       arr[i]=input.nextInt();
      sum+=arr[i];
    }
System.out.println("Sum:"+sum);
    
}


}