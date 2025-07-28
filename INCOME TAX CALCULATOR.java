//**INCOME TAX CALCULATOR**
//*Salary < 2.5L – No tax
//*Salary >=2.5L<5L – 5%
//*Salary >=5L<10L – 20%
//Salary >10L – 30%

import java.util.Scanner;
class Income_Tax_Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Salary: ");
		int salary = sc.nextInt();
		if(salary<250000) {
			System.out.println("Your Salary: " + salary);
			System.out.println("Tax Deduction: 0");
			System.out.println("Your Net Salary: " + salary);
			}
		else {
			if(salary>=250000 && salary<500000) {
				System.out.println("Your Salary: " + salary);
				int deduction1 = (5*salary)/100;
				System.out.println("Tax Deducted: " + deduction1);
				salary-=deduction1;
				System.out.println("Your Net Salary: " + salary);
				}
			else {
				if(salary>=500000 && salary<1000000) {
					System.out.println("Your Salary: " + salary);
					int deduction2 = (10*salary)/100;
					System.out.println("Tax Deducted: " + deduction2);
					salary-=deduction2;
					System.out.println("Your Net Salary: " + salary);
					}
				else {
					System.out.println("Your Salary: " + salary);
					int deduction3 = (30*salary)/100;
					System.out.println("Tax Deducted: " + deduction3);
					salary-=deduction3;
					System.out.println("Your Net Salary: " + salary);
					}
				}
			}
		}
	}