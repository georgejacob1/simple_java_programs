import java.util.Scanner;
public class overload
{
    public static void main(String args[]) 
    {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int s = sc.nextInt();
        System.out.print("Enter the sides of rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the radius of circle : ");
        float  r = sc.nextFloat();
        OverloadDemo ob = new OverloadDemo();
        ob.area(s);
        ob.area(l,b);
        ob.area(r);
	}
}
class OverloadDemo
{
    void area(int x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    void area(float x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
