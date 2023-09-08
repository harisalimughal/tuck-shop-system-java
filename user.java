package tuckshop;
import java.util.Scanner;
public class user extends tuckshop {
	
	protected String username;
	protected String userpassword;
	protected String useraddress;
	protected String usercontact;
	

public void setname()	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter your name");
	username=s.nextLine();
}
public void setpassword() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your password");
	userpassword=s.nextLine();
}
public void setaddress() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your address");
	useraddress=s.nextLine();
}
public void setcontact() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter your contact");
	usercontact=s.nextLine();
}
}

