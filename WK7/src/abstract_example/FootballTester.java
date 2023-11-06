package abstract_example;

import java.util.ArrayList;

public class FootballTester {
	
	public static void main(String[] args) {
		// Cannot initialize abstract class to itself
		//FootballSupporter f = new FootballSupporter();
		FootballSupporter c = new ChelseaSupporter();
		FootballSupporter u = new UnitedSupporter();
		FootballSupporter l = new LiverpoolSupporter();
		
		ArrayList<FootballSupporter> supporters = new ArrayList();
		
		supporters.add(c);
		supporters.add(u);
		supporters.add(l);
		
		System.out.println(c.getStadium() + "\n" + u.getStadium() + "\n" + l.getStadium());
	}
}
