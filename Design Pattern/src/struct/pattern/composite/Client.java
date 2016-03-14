package struct.pattern.composite;

public class Client {

	public static void main(String[] args) {
		
		Store store1 = new Store(10000, "DLF City");
		Store store2 = new Store(20000, "Ambience Mall");
		Store store3 = new Store(25000, "DT City");
		
		City gurgaon = new City("Gurgaon");
		
		gurgaon.addLeaf(store1);
		gurgaon.addLeaf(store2);
		gurgaon.addLeaf(store3);
		
		System.out.println("Collection of Gurgaon: " + gurgaon.getProfit());
		
		Store s4 = new Store(50000, "Elante");
		Store s5 = new Store(40000, "17 Market");
		
		City chd = new City("Chandigarh");
		
		chd.addLeaf(s4);
		chd.addLeaf(s5);
		
		System.out.println("Collection of Chnadigarh: " + chd.getProfit());
		
		State india = new State("India");
		india.addLeaf(gurgaon);
		india.addLeaf(chd);
		
		System.out.println("Total Collection: "+ india.getProfit());

	}

}
