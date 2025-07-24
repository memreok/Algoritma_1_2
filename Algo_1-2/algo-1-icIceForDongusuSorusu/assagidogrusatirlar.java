import java.util.Scanner;

public class assagidogrusatirlar {
	public static void main(String[] args) {
		// girilen sayı kadar satır sütun yaz
		/*
		 * 1
		 * 1 2
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaça kadar girileceğini belirtiniz: ");
		int sutun = scanner.nextInt();
		for (int satir = 1; satir <= sutun; satir++) {
			for (int i = 1; i <= satir; i++) {
				System.out.print(i+" ");
			}
			System.out.println();
			
		}
		
		
		
		
	}
}
