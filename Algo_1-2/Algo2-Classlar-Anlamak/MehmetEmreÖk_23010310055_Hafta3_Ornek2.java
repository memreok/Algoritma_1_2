
public class MehmetEmreÖk_23010310055_Hafta3_Ornek2 {

	public static void main(String[] args) {

		BankAccount a1 = new BankAccount();
		System.out.println("a1 account: " + a1.getId()+ " , " + a1.getName());
		BankAccount a2 = new BankAccount();
		System.out.println("a2 account: " + a2.getId()+ " , " + a2.getName());
		
		String [] names = {"Ahmet" , "Ali" , "Ayşe" , "Veli" , "Osmam"};
		BankAccount [] accounts = new BankAccount[5];
		
		for(int i = 0 ; i < accounts.length; i++) {
			accounts[i] = new BankAccount(names[i]);
			System.out.println(i + ". account: " + accounts[i].getId() + " , " + accounts[i].getName());
		}
		
		System.out.println(BankAccount.numberOfAccount());
		System.out.println(a1.numbers_Accounts() + " , " + a2.numbers_Accounts());
	}

}
