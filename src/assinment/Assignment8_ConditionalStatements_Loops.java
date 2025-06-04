package assinment;

import java.util.LinkedList;
import java.util.List;

/**
 * Bank Transactions Positive value refers Credit and Negative refers Debit
 * Transaction
 *  1. 50000 
 *  2. -2000 
 *  3. 3000 
 *  4. -15000 
 *  5. -200 
 *  6. -300 
 *  7. 4000 
 *  8. -3000 
 *  First Store all the transactions in any data structure of Your Choice from collections, and by using Loops and conditional statements
      	1. Print total number of credit and debit transactions completed 
      	2. Print the total amount credited and debited in account 
      	3. Print total amount remaining at the end in Bank Account 
      	4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit Transaction with Amount” and also print total number of suspicious transactions
 */

public class Assignment8_ConditionalStatements_Loops {

	public static void main(String[] args) {

		List<Integer> Credit = new LinkedList<Integer>();
		Credit.add(50000);
		Credit.add(3000);
		Credit.add(4000);

		List<Integer> Debit = new LinkedList<Integer>();
		Debit.add(-2000);
		Debit.add(-15000);
		Debit.add(-200);
		Debit.add(-300);
		Debit.add(-3000);

		// 1. Print total number of credit and debit transactions completed

		System.out.println("Total number of completed credit transactions : " + Credit.size());
		System.out.println("Total number of completed credit transactions : " + Debit.size());
		System.out.println();
		// 2. Print the total amount credited and debited in account

		// (i) Printing Total Amount Credited
		int CreditSize = Credit.size(), i, TotalAmountCredited = 0;
		for (i = 0; i < CreditSize; i++) {
			TotalAmountCredited += Credit.get(i);
		}
		System.out.println("Total Amount Credited : " + TotalAmountCredited);

		// (ii) Printing Total Amount Debited
		int j, DebitSize = Debit.size(), TotalAmountDebited = 0;
		for (j = 0; j < DebitSize; j++) {

			TotalAmountDebited = TotalAmountDebited + Debit.get(j);
		}
		System.out.println("Total Amount Debited : " + TotalAmountDebited);
		System.out.println();

		// 3. Print total amount remaining at the end in Bank Account

		int RemainingAmountInAccount = TotalAmountCredited - (-TotalAmountDebited);
		System.out.println("Total Amount remaining at the end in Bank Account : " + RemainingAmountInAccount);
		System.out.println();

		// 4. If any transaction limit exceeds +/- 10000 then print the message
		// “Suspicious credit/ debit
		// Transaction with Amount” and also print total number of suspicious
		// transactions

		List<Integer> Transactions = new LinkedList<Integer>();

		// Adding all values in credit array to transaction array
		Transactions.addAll(Credit);

		// Adding all values in debit array to transaction array
		Transactions.addAll(Debit);
		System.out.println("All Transactions : " + Transactions);

		int TotalSuspiciousCreditAmount = 0, TotalSuspiciousDebitAmount = 0,SuspiciousCreditCount=0,SuspiciousDebitCount=0,TotalSuspiciousCount=0;

		for (int TransCount = 0; TransCount < Transactions.size(); TransCount++) {
			int TransactionsAmount = Transactions.get(TransCount);

			if (TransactionsAmount > 10000) {
				System.out.println(
						"Transaction #" + (TransCount + 1) + " with Suspicious Credit Amount : " + TransactionsAmount);
				TotalSuspiciousCreditAmount += TransactionsAmount;
				SuspiciousCreditCount++;
			} else if (TransactionsAmount < -10000) {
				System.out.println(
						"Transaction #" + (TransCount + 1) + " with Suspicious Debit Amount : " + TransactionsAmount);
				TotalSuspiciousDebitAmount += TransactionsAmount;
				SuspiciousDebitCount++;
			}
			
		TotalSuspiciousCount = SuspiciousCreditCount+SuspiciousDebitCount;
		}
		System.out.println("Total suspicious credit Count: " + TotalSuspiciousCount);
		System.out.println("Total suspicious credit amount: " + TotalSuspiciousCreditAmount);
		System.out.println("Total suspicious debit amount: " + (TotalSuspiciousDebitAmount));
		System.out.println();

		if (SuspiciousCreditCount == 0 && SuspiciousDebitCount == 0) {
			System.out.println("No Suspicious Credit/Debit Transactions in this Bank Account");
		}
	}
}
