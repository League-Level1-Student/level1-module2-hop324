package smurf;

public class smurf_Runner {
public static void main(String [] args) {
	Smurf a = new Smurf("Handy Smurf");
	Smurf b = new Smurf("Papa Smurf");
	Smurf c = new Smurf("Smurfette");
	a.getName();
	a.getHatColor();
	a.eat();
	a.getGirlOrBoy();
	a.toString();
	b.getName();
	b.getHatColor();
	b.eat();
	b.getGirlOrBoy();
	b.toString();
	c.getName();
	c.getHatColor();
	c.eat();
	c.getGirlOrBoy();
	c.toString();
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
