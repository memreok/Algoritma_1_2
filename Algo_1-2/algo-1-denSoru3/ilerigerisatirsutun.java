package ilerigerisatirsutun;

import java.util.Scanner;

public class ilerigerisatirsutun {
	public static void main (String[] args) {
		// hem geri hem ileri şeklinde
				/*
				 * 1 2 3 4 5 
				 * 1 2 3 4 
				 * 1 2 3 
				 * 1 2
				 * 1
				 * 0
				 * 1 
				 * 1 2 
				 * 1 2 3 
				 * 1 2 3 4
				 * 1 2 3 4 5 
				 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaça kadar girileceğini belirtiniz: ");
		int sutun = scanner.nextInt();
	


		// aşşağıya doğru azalan kısım
		int sutun1 = sutun;
		while(sutun1>=0) {
			for (int i = 1; i <= sutun1; i++) {
				System.out.print(i+" ");
			}
			sutun1--;
			if (sutun1 !=0) {
				System.out.println();
			}
			
			 
		}
		
		// sıfırı yazdırma
		System.out.println("0");
		// aşşağıya doğru artan kısım
		for (int satir = 1; satir <= sutun; satir++) {
			for (int i = 1; i <= satir; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	
	}
}
