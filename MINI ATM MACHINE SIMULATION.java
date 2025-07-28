//*Mini ATM Machine Simulation*
import java.util.Scanner;
class Mini_ATM_Machine_Simulation{
	public static void main(String[] args) {
		int pin = 3190;
		String password = "Chaitu319";
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM ");
		System.out.println("Select any one of these 2 options");
		System.out.println("1.PIN");
		System.out.println("2.PASSWORD");
		int input = sc.nextInt();
		if(input==1) {
			System.out.print("Enter Your PIN Number: ");
			int PINNUMBER = sc.nextInt();
			if(PINNUMBER==pin) {
				System.out.println("Select any one Option");
				System.out.println("1.Check Balance");
				System.out.println("2.Withdraw Money");
				System.out.println("3.Deposit");
				System.out.println("4.Exit");
				int input1 = sc.nextInt();
				if(input1==1) {
					System.out.println("Balance Checked Successfully");
					}
				else if(input1==2) {
					System.out.println("Withdraw Money Success");
					}
				else if(input1==3) {
					System.out.println("Money Deposited Successfully");
					}
				else if(input1==4) {
					System.out.println("Transcation Cancelled");
					}
				else {
					System.out.println("Invalid input");
					}
				}
			else {
				System.out.println("Incorrect PIN");
				}
			}
		else if(input==2) {
			System.out.print("Enter your Password: ");
			String PASSWORD = sc.next();
			if(PASSWORD.equals(password)) {
				System.out.println("Select any one Option");
				System.out.println("1.Check Balance");
				System.out.println("2.Withdraw Money");
				System.out.println("3.Deposit");
				System.out.println("4.Exit");
				int input2 = sc.nextInt();
				if(input2==1) {
					System.out.println("Balance Checked Successfully");
					}
				else if(input2==2) {
					System.out.println("Withdraw Money Success");
					}
				else if(input2==3) {
					System.out.println("Money Deposited Successfully");
					}
				else if(input2==4) {
					System.out.println("Transaction Cancelled");
					}
				else {
					System.out.println("Invalid Input");
					}
				}
			else {
				System.out.println("Incorrect Password");
				}
			}
		else {
			System.out.println("Invalid Input");
			}
		}
	}