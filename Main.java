
import java.util.Scanner;
public class Main {
	//Making the objects static allows access from other classes using
	static Customer vito1 = new Customer(); 
	static BankAccount vito = new BankAccount();
	static ATM atm = new ATM("a","The Worst Bank",0,0);
	
    public static void main(String[] args) {
    	
    	vito.checkingdeposit();//Make a deposit to the checking account
        System.out.println(vito.getcheckingBalance());//Show that the deposit worked
       atm.checkVerification();
       atm.withdraw();//Use the atm to withdraw from the checking account
       System.out.println(vito.getcheckingBalance());//Bank Account shows new balance
    
    }
}
