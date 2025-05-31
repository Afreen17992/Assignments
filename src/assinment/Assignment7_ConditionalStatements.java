package assinment;
public class Assignment7_ConditionalStatements {

	/**
 	Assignment-7 (Conditional Statements)

A bank evaluates loan applicants based on the following criteria:
	1. Credit Score:
		o If the credit score is above 750, the loan is automatically approved.
		o If the credit score is between 650 and 750, additional checks are performed.
		o If the credit score is below 650, the loan is denied.
	2. Income:
		o For credit scores between 650 and 750, the customer’s income must be at least $50,000	for the loan to be considered.

	3. Employment Status:
		o If the customer’s income is at least 50,000, the system checks whether the customer is employed.
		o If the customer is unemployed, the loan is denied.
	4. Debt-to-Income Ratio:
		o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
		o If the DTI ratio is less than 40%, the loan is approved.
		o If the DTI ratio is 40% or greater, the loan is denied.

	Now based on below details, print whether user is eligible to get the loan or not
	customerName = "John Doe";
	creditScore = 720;
	income = 55000.0;
	isEmployed = true;
	debtToIncomeRatio = 35.0;

 */														

	public static void main(String[] args) {
		
		String	customerName = "John Doe";
		int creditScore = 720;
		float income = 55000.0f;
		boolean isEmployed=true;
		float debtToIncomeRatio = 35.0f;


		if(creditScore>750) {
			System.out.println("Customer’s CreditScore : " + creditScore);
			System.out.println(customerName +" Loan is Approved");
		}
			else if((creditScore>650) && (creditScore<750)) {
				System.out.println("Customer’s CreditScore : " + creditScore);
				if(income>=50000) {
				System.out.println("Customer’s income is : " + income);
				if(isEmployed)
				{
					System.out.println("Customer isEmployed : " + isEmployed);
					if (debtToIncomeRatio < 40.0) {
						System.out.println("Customer’s Debt-To-Income Ratio : "+debtToIncomeRatio);
					    System.out.println(customerName +" DTI ratio is lesser than 40%");
					    System.out.println(customerName +" Loan can be Approved");
					} else {
						System.out.println("Customer’s Debt-To-Income Ratio : "+debtToIncomeRatio);
						System.out.println(customerName +" DTI ratio is greater, than 40%");
					    System.out.println(customerName +" Loan is Denied");
					}
			}
				}
			}
			else {
				System.out.println("customer’s CreditScore : " + creditScore);
				System.out.println(customerName +" Loan is Denied");
			}
			
	
	}
}