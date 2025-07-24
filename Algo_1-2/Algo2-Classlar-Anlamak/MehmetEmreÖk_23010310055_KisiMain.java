package ödev4;

import java.util.ArrayList;

public class MehmetEmreÖk_23010310055_KisiMain {

	public static void main(String[] args) {

		MehmetEmreÖk_23010310055_Kisi k1 = new MehmetEmreÖk_23010310055_Kisi("Ali", 20);
		System.out.println(k1.getIsim());
		//int sayi=5;
		//ArrayList<Integer> list = new ArrayList<Integer> ();
		ArrayList<MehmetEmreÖk_23010310055_Kisi> kisiler = new ArrayList<MehmetEmreÖk_23010310055_Kisi>();
		kisiler.add(k1);
		
		System.out.println(kisiler.get(0).getYas());
		kisiler.add(new MehmetEmreÖk_23010310055_Kisi("Veli",30));
		kisiler.add(new MehmetEmreÖk_23010310055_Kisi("Ahmet",40));
		
		for(int index =0; index < kisiler.size();index++) {
			String isim = kisiler.get(index).getIsim();
			int yas = kisiler.get(index).getYas();
			System.out.println("isim:" + isim +", yas:"+ yas);
		}
		for(MehmetEmreÖk_23010310055_Kisi kisi : kisiler) {
			System.out.println("İsim:"+ kisi.getIsim() + ", yaş:"+ kisi.getYas());

		
	}

}
}
