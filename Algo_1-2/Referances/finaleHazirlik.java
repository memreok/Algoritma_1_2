
public class finaleHazirlik {
	public static void main(String[] args) {
		  String name = "Bahar";
		  int money =20;
		  Account a = new Account(name,money);
		  
		  mystery(name,money,a);
		 System.out.println(name+","+money+","+a );
		  
		  money = money + 15;
		  a.name = "Bsm104";
		  
		  mystery(name,money,a);
		  System.out.println(name+","+money+","+a);
		  

		}
	   
		public static void mystery(String name, int money, Account a) {
			 a.money++;
	    	 name="Butunleme";
	    	 System.out.println(name+","+money+","+a);

		}

}
