package odev9;

public class MehmetEmreOk_23010310055_LinkedIntListMain {

	public static void main(String[] args) {

		LinkedIntList linkedlist = new LinkedIntList();
		
		System.out.println(linkedlist.size());
		
		linkedlist.add(3);
		linkedlist.add(5);
		System.out.println(linkedlist.size());
		
		// System.out.println(linkedlist.get(0));
		System.out.println(linkedlist.get(0));
		
		linkedlist.add(7);
		linkedlist.add(13);
		linkedlist.add(17);
		linkedlist.add(71);
		linkedlist.add(53);
		
		System.out.println(linkedlist);
		
		System.out.println("index: " + linkedlist.indexOf(13));
		
		linkedlist.add(0, 25);
		System.out.println(linkedlist);
		
		linkedlist.add(2, 0);
		System.out.println(linkedlist);
		
		linkedlist.remove(0);
		System.out.println(linkedlist);
		
		linkedlist.remove(3);
		System.out.println(linkedlist);
		
		linkedlist.removeRange(3, 5);
		System.out.println(linkedlist);
		
		linkedlist.reverse();
		System.out.println(linkedlist);
		
		
	}

}
