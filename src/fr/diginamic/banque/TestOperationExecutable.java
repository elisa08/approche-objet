package fr.diginamic.banque;

import fr.diginamic.entites.Credit;
import fr.diginamic.entites.Debit;
import fr.diginamic.entites.Operation;

public class TestOperationExecutable {
 public static void main(String[] args) {
	 
	 Credit credit= new Credit("11/02/2021",3000);
	 Credit credit2= new Credit("11/02/2021",1500);
	 Debit debit= new Debit("11/02/2021",150);
	 Credit debit2= new Credit("11/02/2021",300);
	 
	 Operation[] operation = {credit,debit,credit2,debit2};
	 
	 
	 for (int i = 0; i < operation.length; i++) {
		
		System.out.println(operation[i]);
		
	} 
	 
	 int soldeDebit= credit.getMontant()-debit.getMontant();
		System.out.println(soldeDebit);
		
	int montantDebit= credit.getMontant()+debit.getMontant();
	System.out.println(montantDebit);
 }
}
