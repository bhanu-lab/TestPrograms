import java.util.Comparator;

public class Checker {

	public Comparator<Player> desc = new Comparator<Player>(){

		@Override
		public int compare(Player p1, Player p2) {
			if(p1.getScore() - p2.getScore() == 0){
				return p2.getName().compareTo(p1.getName());
			}
			return p2.getScore() - p1.getScore();
		}
		
	};
}
