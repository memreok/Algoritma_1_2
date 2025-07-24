package algo2;

public class Hafta_2_Point {

	int x;
	int y;

	public double disatanceFromOrigin(int x, int y) {
		return Math.sqrt(x * x + y * y);
	}
	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}
	// Öğrenic örnekk
	
	int ogrenciNo;
	String ogrenciAdi;
	String ogrenciSoyad;
	
	public String toString() {
		return ogrenciNo + " " + ogrenciAdi + " " + ogrenciSoyad;
	}
	
}
