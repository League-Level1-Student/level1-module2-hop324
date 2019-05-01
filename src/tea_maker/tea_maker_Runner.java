package tea_maker;

public class tea_maker_Runner {
	public static void main(String [] args) {
TeaBag a = new TeaBag("Chamomile");
Kettle Yeet = new Kettle();
Cup Yummy = new Cup();
a.getFlavor();
Yeet.boil();
Yummy.makeTea(a, Yeet.getWater());
	}
}
