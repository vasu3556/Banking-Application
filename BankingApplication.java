package importjava.util.scanner;

import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true) {
		System.out.println("GREETINGS FROM FEDERAL BANK");
		System.out.println("FEDERAL BANK WELCOMES YOU");
		System.out.println("DO YOU HAVE AN ACCOUNT");
		System.out.println("PRESS 1 IF YOUR ALREADY A CUSTOMER");
		System.out.println("PRESS 2 IF YOU ARE A NEW CUSTOMER");
	
		
		Scanner a = new Scanner(System.in); 
		int choice=a.nextInt();
		
		switch (choice)
		{
		case 1:	
			System.out.println("ENTER USER ID");
			Scanner  A=new Scanner(System.in);
			int B=A.nextInt();
			
			System.out.println("ENTER YOUR PASSWORD");
			Scanner  C=new Scanner(System.in);
			int D=C.nextInt();
			if(B==3556&&D==3556) {
				
				System.out.println("--------------------------------------");
				System.out.println("ACCOUNT HOLDER NAME" +":"+ "PALLE VASU GOUD");
				System.out.println("BRANCH" + ":"+"HYDERABAD");
				System.out.println("AVAILABLE BALANCE" +":"+ "65000💸");
				System.out.println("THANKS FOR VISITING.🙏");
				System.out.println("--------------------------------------");
			}
				
					

					
				
if(B==1234&&D==1234) {
				
				System.out.println("--------------------------------------");
				System.out.println("ACCOUNT HOLDER NAME" +":"+ "VENKATESH");
				System.out.println("BRANCH" + ":"+"HYDERABAD");
				System.out.println("AVAILABLE BALANCE" +":"+ "10RS💸");
				System.out.println("THANKS FOR VISITING.🙏");
				System.out.println("--------------------------------------");
			}
				
if(B==5678&&D==5678) {
	
	System.out.println("--------------------------------------");
	System.out.println("ACCOUNT HOLDER NAME" +":"+ "VINAY");
	System.out.println("BRANCH" + ":"+"HYDERABAD");
	System.out.println("AVAILABLE BALANCE" +":"+ "15RS💸");
	System.out.println("THANKS FOR VISITING.🙏");
	System.out.println("--------------------------------------");
}
	else  {
		System.out.println("PLEASE ENTER A VALID DETAILS❌");
		
	     }
	break;
		case 2:{
			System.out.println("WELCOME TO FEDERAL BANK ");
			System.out.println("YOU ARE JUST FEW STEPS AWAY");
			
			System.out.println("PLEASE ENTER YOUR FIRST NAME");
			Scanner sc=new Scanner (System.in);
			String fname=sc.next();
			
			System.out.println("PLEASE ENTER YOUR LAST NAME");
			Scanner scc=new Scanner (System.in);
			String lname=sc.next();
			
			System.out.println("PLEASE ENTER YOUR BANK ACCOUNT NO");
			Scanner sccc=new Scanner (System.in);
			double acc=sccc.nextDouble();
			
			System.out.println("ENTER USER ID");
			Scanner scccc=new Scanner (System.in);
			String userid=sc.next();
			
			System.out.println("PLEASE ENTER YOUR PASSWORD");
			Scanner sccccC=new Scanner (System.in);
			int password=sc.nextInt();
			
			System.out.println("--------------------------------------");
			System.out.println("YOUR NAME :"+""+fname+""+lname);
			System.out.println("YOUR BANK ACCOUNT NO IS :"+""+acc);
			System.out.println("YOUR USER ID IS :"+" "+userid);
			System.out.println("YOUR PASSWORD IS :"+""+"***********");
			System.out.println("YOUR REGISTRATION IS SUCCESSFULL✅");
			System.out.println("--------------------------------------");

			}
			break;
			default:
				System.out.println("ENTER VALID DETAILS");
				
	



			
			
			


			
			
		}

			



				
			}

			}	
			}

			
		
		
		
	



