package algo2;

public class Hafta2 {
	
	// public --> her yerden erişilebilsin diye
		// private
		// proteced
	// metotlar küçük harfle başlar || class lar büyük harfle başlar
	
	// static --> direkt erişilebilir
	
	public static void main(String[] args) {
		System.out.println("----------Örnek 1 ----------------");
		Hafta_2_Point p1 = new Hafta_2_Point();
		Hafta_2_Point p2 = new Hafta_2_Point();
		p1.x = 3;
		p1.y = 4;
		p2.x = 10;
		p2.y = p1.x;
		System.out.println("p1: "+ p1.x + " , " + p1.y);
		System.out.println("p2: "+ p2.x + " , " + p2.y);
		double uzaklık = Math.sqrt(p1.x * p1.x + p1.y * p1.y) ;
		System.out.println("Orjine uzaklık: " + uzaklık);
		
		//p1.x = p1.x + 4;
		//p1.y += 2;
		System.out.println("p1: "+ p1.x + " , " + p1.y);
		double distance = p1.disatanceFromOrigin(p1.x, p1.y);
		System.out.println("Distance: " + distance);
		System.out.println("------------Örnek 2 ---------------");
		Hafta_2_Point p3 = new Hafta_2_Point();
		p3.x = 5;
		p3.y = 12;
		System.out.println("p3: " + p3.x + " , " + p3.y );
		double distancep3 = p3.disatanceFromOrigin(p3.x, p3.y);
		System.out.println("Distance p3: " + distancep3);
		p3.translate(3, 3);
		distancep3 = p3.disatanceFromOrigin(p3.x, p3.y);
		System.out.println("Ötelenmiş hali: " + p3.x + " , " + p3.y );
		System.out.println("Distance p3*: " + distancep3);
		System.out.println("----------------Örnek öğrenci 3-----------------");
		
		Hafta_2_Point[] kisiler = new Hafta_2_Point[2];
		kisiler [0] = new Hafta_2_Point();
		kisiler [0].ogrenciNo = 1;
		
		
		
	}
	
}
