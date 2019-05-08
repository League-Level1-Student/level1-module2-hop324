package minion;

public class Minion {
	private String name;
	private int eyes;
	private String master;
	private String color;
Minion(String name, int eyes, String color, String master){
	this.name = name;
	this.color = color;
	this.eyes = eyes;
	this.master = master;
}

String getName() {
	return name;
}
int getEyes() {
	return eyes;
}
String getColor() {
	return color;
}
String getMaster() {
	return master;
}
String setMaster(String master) {
	this.master = master;
	return master;
}
}
