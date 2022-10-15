import java.util.Scanner;
public class Armstrong 
{
  public static void main(String[] args) 
  {
   Scanner readme = new Scanner(System.in);
   System.out.println("Enter the Number:");
   int n,r,sum=0,temp;
   n = readme.nextInt();
   temp=n;
   while(n>0)
   {
   r=n%10;
   sum = sum+(r*r*r);
   n=n/10;
   }
   if(temp==sum)
   {
   System.out.println("It is an Armstrong number.");
   } 
   else
   {
   System.out.println("It is not an Armstrong number.");
   }
}
}
