package ödev4;

import java.util.ArrayList;

public class MehmetEmreÖk_23010310055_StarAdd {

	public static void main(String[] args) {

		ArrayList<String> kelimeler = new ArrayList<String>();
		kelimeler.add("kalem");
		kelimeler.add("bilgisayar");
		kelimeler.add("kitap");
		
		kelimeler.set(0, kelimeler.get(0).toUpperCase());
		System.out.println(kelimeler.toString());
		
		for(int index = 0; index < kelimeler.size(); index+=2) {
			kelimeler.set(index, "*");
			System.out.println(kelimeler.toString());
		}
		System.out.println(kelimeler.toString());
		
		for(int index =0; index<kelimeler.size();index++) {
			kelimeler.remove(index);
		}
		System.out.println(kelimeler.toString());

		
	}

}
