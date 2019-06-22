
public class friends {	

	public static void main(String[] args) {

		String[] friends = { "Harry", "Banana", "Cindy","Christina"};
		for(int i = 0; i < friends.length; i++) {
			System.out.println(friends[i]);	
		}

		for(int i = 0; i < friends.length;i++) {
			if(friends[i].length() > 10){
				System.out.println(friends[i]);
			}

		}
		double d = 5.2;
		System.out.printf("%8d", d);
	}

}
