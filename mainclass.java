package tuckshop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.*;
import java.util.Scanner;
class mainclass
{
	public static void main(String[]args)
	{ 

			
			
		Scanner t=new Scanner(System.in);
		int y;
		System.out.println("Press 1 for manager");
		System.out.println("Press 2 for user");
		y=t.nextInt();
		if(y==1) {
			
			Manager m=new Manager();
			m.Managername();
			m.Managerpassword();		
		}
		else if(y==2) {
			user u=new user();
			u.setname();
			u.setpassword();
			u.setaddress();
			u.setcontact();
		}
		int marzi;
		System.out.println("--------------------- welcome to the TUCK SHOP-------------------------------------");
		int tprice=0;
		do {
		int choice;
		Scanner s=new Scanner(System.in);
		System.out.println("press 1 for purchasing ghee");
		System.out.println("press 2 for purchasing colddrink");
		System.out.println("press 3 for purchasing  pen");
		System.out.println("press 4 for purchasing milk");
		System.out.println("press 5 for purchaisng cake");
		System.out.println("press 6 for purchasing oil");
		choice=s.nextInt();
		//-------------------------------------Ghee portion----------------------------------------
		if(choice==1) {
			int option;
			System.out.println("               welcome to the portion of ghee         ");  
			System.out.println("press 1 for purchasing  meezan ghee");
			System.out.println("press 2 for purchasing dalda ghee");
			System.out.println("press 3 for purchasing handi ghee");
			System.out.println("press 4 for purchasing manpasand ghee");
			System.out.println("press 4 for purchasing manpasand ghee");
			System.out.println("                         ");
			option=s.nextInt();
			if(option==1) {
				int quantity;
				System.out.println("please enter quantity of meezan ghee");
				quantity=s.nextInt();
				System.out.println("you select the quantity of meezan ghee is"+" "+quantity);
				tprice=500*quantity;
				System.out.println("you have to pay is"+" "+tprice);
			}
			else if(option==2)
		
			{
				int quantity;
				System.out.println("please enter quantity of dalda ghee");
				quantity=s.nextInt();
				System.out.println("you select the quantity of dalda ghee is"+" "+quantity);
				tprice=600*quantity;
				System.out.println("you have to pay is"+" "+tprice);
			}
			else if(option==3)
			{
				int quantity;
				System.out.println("please enter quantity of handi ghee");
				quantity=s.nextInt();
				System.out.println("you select the quantity of dalda ghee is"+" "+quantity);
				tprice=650*quantity;
				System.out.println("you have to pay is"+" "+tprice);
			}
			else if(option==4)
			{
				int quantity;
				System.out.println("please enter quantity of manpasand ghee");
				quantity=s.nextInt();
				System.out.println("you select the quantity of dalda ghee is"+" "+quantity);
				tprice=700*quantity;
				System.out.println("you have to pay is"+" "+tprice);
			}
					
		}
		
	        //========================COldDrinks================================
		else if(choice==2) {
			int option;
		System.out.println("               welcome to the portion of ColdDrinks         ");  
		System.out.println("press 1 for purchasing  pepsi coldrink");
		System.out.println("press 2 for purchasing dew colddrink");
		System.out.println("press 3 for purchasing  apple colddrink");
		System.out.println("press 4 for purchasing manpasand ghee");
		System.out.println("                                     ");
		System.out.println("which ghee do you want");
		option=s.nextInt();
			if(option==1) {
		
			int quantity;
			System.out.println("please enter quantity of pepsi colddrink  ");
			quantity=s.nextInt();
			System.out.println("you select the quantity of pepsi 6colddrink is"+" "+quantity);
			tprice=100*quantity;
			System.out.println("you have to pay is"+" "+tprice);
		}
		else if(option==2) {
			int quantity;
			System.out.println("please enter quantity of dew colddrink  ");
			quantity=s.nextInt();
			System.out.println("you select the quantity of dew colddrink is"+" "+quantity);
			tprice=110*quantity;
			System.out.println("you have to pay is"+" "+tprice);
		}
		else if(option==3)
		{
			int quantity;
			System.out.println("please enter quantity of apple colddrink  ");
			quantity=s.nextInt();
			System.out.println("you select the quantity of apple colddrink is"+" "+quantity);
			tprice=120*quantity;
			System.out.println("you have to pay is"+" "+tprice);
		}
		else if(option==4)
		{
			int quantity;
			System.out.println("please enter quantity of 7up colddrink  ");
			quantity=s.nextInt();
			System.out.println("you select the quantity of 7up colddrink is"+" "+quantity);
			tprice=120*quantity;
			System.out.println("you have to pay is"+" "+tprice);
		}
	}
		

	                   //=====================pen class==================================
else if(choice==3) {
	int option;
	System.out.println("               welcome to the portion of Pen         ");  
	System.out.println("press 1 for purchasing  dollar pen");
	System.out.println("press 2 for purchasing marker pen");
	System.out.println("press 3 for purchasing  color pen");
	System.out.println("press 4 for purchasing glitter pen");
	System.out.println("                              ");
	System.out.println("which pen do you want");
	option=s.nextInt();
	if (option==1) {
	int quantity;
	System.out.println("please enter quantity of dollar pen  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of dollor pen is"+" "+quantity);
	tprice=10*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==2)
{
	int quantity;
	System.out.println("please enter quantity of marker pen  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of marker pen is"+" "+quantity);
	tprice=15*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==3)
{
	int quantity;
	System.out.println("please enter quantity of color pen  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of color pen is"+" "+quantity);
	tprice=20*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==4)
{
	int quantity;
	System.out.println("please enter quantity of glitter pen  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of glitter pen is"+" "+quantity);
	tprice=30*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
}
		               // =================Milk Class======================
else if(choice==4)
{
	System.out.println("               welcome to the portion of Milk         ");
	System.out.println("press 1 for purchasing Habib milk");
	System.out.println("press 2 for purchasing Dosti milk");
	System.out.println("press 3 for purchasing Olper milk");
	System.out.println("press 4 for purchasing Fresh milk");
	System.out.println("                              ");
	int option;
	option=s.nextInt();
	if(option==1) {
	int quantity;
	System.out.println("please enter quantity of habib milk  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of habib milk is"+" "+quantity);
	tprice=120*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==2)
{
	int quantity;
	System.out.println("please enter quantity of dosty milk  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of dosty milk is"+" "+quantity);
	tprice=40*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(choice==3)
{
	int quantity;
	System.out.println("please enter quantity of olper milk  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of olper milk is"+" "+quantity);
	tprice=150*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==4) {
	int quantity;
	System.out.println("please enter quantity of Fresh milk  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of Fresh milk is"+" "+quantity);
	tprice=130*quantity;
	System.out.println("you have to pay is"+" "+tprice);
	
}
}
		//==========================================CAKE CLASS================================================
 else if(choice==5)
{
	System.out.println("               welcome to the portion of Cake         ");
	System.out.println("                              ");
	System.out.println("press 1 for purchasing Chocolate Cake");
	System.out.println("press 2 for purchasing PineApple Cake");
	System.out.println("press 3 for purchasing Almond Cake");
	System.out.println("                              ");
	int option;
	option=s.nextInt();
	if(option==1) {
	int quantity;
	System.out.println("please enter quantity of Chocolate cake  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of chocolate cake is"+" "+quantity);
	tprice=650*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==2)
{
	int quantity;
	System.out.println("please enter quantity of PineApple cake  ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of PineApple cake is"+" "+quantity);
	tprice=600*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
else if(option==3)
{
	int quantity;
	System.out.println("please enter quantity of Almond Cake   ");
	quantity=s.nextInt();
	System.out.println("you select the quantity of Almond Cake is"+" "+quantity);
	tprice=500*quantity;
	System.out.println("you have to pay is"+" "+tprice);
}
}
		//======================Oil Class======================================
 else if(choice==6)
 {
 	System.out.println("               welcome to the portion of Oil        ");
 	System.out.println("                              ");
	System.out.println("press 1 for purchasing Meezan Oil");
	System.out.println("press 2 for purchasing Dalda Oil ");
	System.out.println("press 3 for purchasing Handi Oil");
	System.out.println("press 4 for purchasing Manpasand Oil");
	System.out.println("                              ");
 	int option;
 	option=s.nextInt();
 	if(option==1) {
 	int quantity;
 	System.out.println("please enter quantity of habib Oil  ");
 	quantity=s.nextInt();
 	System.out.println("you select the quantity of Habib oil"+" "+quantity);
 	tprice=500*quantity;
 	System.out.println("you have to pay is"+" "+tprice);
 }
 else if(option==2)
 {
 	int quantity;
 	System.out.println("please enter quantity of Dalda Oil  ");
 	quantity=s.nextInt();
 	System.out.println("you select the quantity of Dalda oil is"+" "+quantity);
 	tprice=600*quantity;
 	System.out.println("you have to pay is"+" "+tprice);
 }
 else if(option==3)
 {
 	int quantity;
 	System.out.println("please enter quantity of Handi Oil  ");
 	quantity=s.nextInt();
 	System.out.println("you select the quantity of Handi oil is"+" "+quantity);
 	tprice=650*quantity;
 	System.out.println("you have to pay is"+" "+tprice);
 }
 else if(option==4)
 {
 	int quantity;
 	System.out.println("please enter quantity of Manpasand Oil  ");
 	quantity=s.nextInt();
 	System.out.println("you select the quantity of Manpasand oil is"+" "+quantity);
 	tprice=700*quantity;
 	System.out.println("you have to pay is"+" "+tprice);
 }
 }
		System.out.println("Press 7 for buying more items");
		System.out.println("Press 8 for exit" );
		marzi=s.nextInt();
		}while(marzi==7);
		System.out.println("Your total bill is :"+" "+tprice);

	}

}




	 
 

	
					