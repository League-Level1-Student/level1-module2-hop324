package sea_creature;

public class sea_creature_Runner {
public static void main(String [] args) {
	SeaCreature a = new SeaCreature("Spongebob");
	SeaCreature b = new SeaCreature("Patrick");
	SeaCreature c = new SeaCreature("Squidward");
	a.getName();
	b.getName();
	c.getName();
	a.eat();
	b.eat();
	c.eat();
	a.laugh();
	b.laugh();
	c.laugh();
	}
}
