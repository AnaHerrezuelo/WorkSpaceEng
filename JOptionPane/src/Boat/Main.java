package boat;

public class Main {

	public static void main(String[] args) {
//		Boat [] boat = new Boat[4];
////		boat[0]= new Boat(1,2,3);
//		boat[0]= new Boat(1,2,3, new Rental ("aa", "aa", 7));
//		boat[1]= new Sailboats(1,2,3,4);
//		boat[2]= new SportsBoats(1,2,3,5);
//		boat[3]= new Yachts(1,2,3,5, 8);
//		
//		for (int i = 0; i < boat.length; i++) {
//			System.out.println(boat[i]);
//		}
		
		
//		Rental ren = new Rental ("aaa", "aaa", 2);
//		ren.askData();
//		System.out.println(ren.toString());
		
		
		
		
		Rental [] rent = new Rental[5];
		rent[0]= new Rental();
		rent[1]= new Rental("aaa", "aa", 2, new Boat(1,2,3));
		rent[2]= new Rental("aaa", "aa", 3, new Sailboats(1,2,3, 4));
		rent[3]= new Rental("aaa", "aa", 5, new SportsBoats(1,2,3, 4));
		rent[4]= new Rental("aaa", "aa", 7, new Yachts(1,2,3, 4,5));
		
		for (int i = 0; i < rent.length; i++) {
			System.out.println(rent[i]);
		}
		
	
	}// end public static void main(String[] args) 
}//end public class Main
