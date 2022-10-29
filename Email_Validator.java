import java.util.*;

public class Main
{
	public static void main(String[] args) {
       Scanner myObject = new Scanner(System.in);
       System.out.print("Enter the Email ID : ");
       char[] email_id = myObject.next().toCharArray();
       
       boolean status = true;
       int count = 0;
       int index = 0;
       for ( int i = 0 ; i < email_id.length ; i++ )
       {
    	   if ( email_id[i] == '@' )
    		   {
    		       count++; 
    		       index = i;
    		   }
    	   
       }
       
       if ( count > 1 || count == 0 )
	   {
		   status = false;
	   }
       
       if ( status = true )
       {
    	   if ( index == 0 || email_id[index+1] == 46 )      // First char should not be @ and after @ immediately there should not be a ' . ' 
    		   status = false;
       }
       
       if ( status == true )
       {
    	   status = false;
    	   for ( int i = index + 2 ; i < email_id.length - 1 ; i++ )
    	   {
    		   if ( email_id[i] == 46 )              //46 is ASCII value of dot '.'
    		   {
    			   status = true;
    			   break;
    		   }
    	   }
       }
       
       System.out.print("The status of your Email ID : "+status);
       
	}
}
