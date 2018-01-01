import java.util.Arrays;

public class CheckComparator {

	public static void main(String[] args){
		Player p1 = new Player("akhil", 100);
		Player p2 = new Player("zaheer", 123);
		Player p3 = new Player("murali", 54);
		Player p4 = new Player("virat", 123);
		Player p5 = new Player("dhoni", 78);
		
		Player[] players = new Player[]{
			p1,p2,p3,p4,p5	
		};
		
		Checker check = new Checker();
		
		Arrays.sort(players, check.desc);
		
		for(Player p : players){
			System.out.println(p.getName()+" "+p.getScore());
		}
	}
}
