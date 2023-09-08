package tuckshop;
import java.util.Scanner;
public class Manager extends tuckshop {
	public void Managername() {
		System.out.println("enter your name");
		Scanner s=new Scanner(System.in);
		Managername=s.nextLine();
		if(Managername=="tabish khan") {
			System.out.println("Good");
		}
		else {
			System.out.println("==============ERROR============================");
		}}
		public void Managerpassword() {
			
			System.out.println("enter your password");
			Scanner s=new Scanner(System.in);
			Managerpassword=s.nextLine();
			if(Managerpassword=="1296543") {
				System.out.println("Right Password");
				}
			
			else {
				System.out.println("========================================ERROR=================================");
		
	}
}
}


