package finalHazirlik2;

public class Location {

	int lat;
	int lng;
	
	public Location(int initialLat, int initialLng) {
		lat = initialLat;
		lng = initialLng;
	}
	
	public String toString() {
		return lat + " , " + lng;
	}
	
}
