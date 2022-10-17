import java.util.Scanner;
class InvalidAccess extends Exception{
    public InvalidAccess(String s){
        super(s);
    }
}
public class Userdef
{
    public static void main(String args[])
    {
        String username = "user1";
        String password = "pass123";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String user = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        try
        {
            if((user.equals(username)) && (pass.equals(password)))
            {
                System.out.println("ACCESS GRANTED");
            }
            else
            {
                throw new InvalidAccess("Invalid Username or Password");
            }
        }
        catch(InvalidAccess e)
        {
            System.out.println(e.getMessage());
        }
    }
}
