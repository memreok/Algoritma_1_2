
public class MehmetEmreÖk_23010310055_Hafta2_Ornek3 {

	public static void main(String[] args) {

		Ogrenci[] kisiler = new Ogrenci[2];
		kisiler [0] = new Ogrenci();
		kisiler [0].ogrenciNo = 10;
		kisiler [0].ogrenciAdi = "Furkan";
		kisiler [0].ogrenciSoyad = "Ayaz";
		System.out.println(kisiler[0].ogrenciNo + " , " + kisiler[0].ogrenciAdi + " , " + kisiler[0].ogrenciSoyad);
		
		kisiler [1] = new Ogrenci();
		kisiler [1].ogrenciNo = 11;
		kisiler [1].ogrenciAdi = "Ali";
		kisiler [1].ogrenciSoyad = "Veli";
		
		System.out.println(kisiler[1].toString());
		
	}

}
