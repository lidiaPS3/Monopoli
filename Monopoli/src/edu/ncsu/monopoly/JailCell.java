package edu.ncsu.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	private boolean available = true;
	
	public JailCell() {
		setName("Jail");
	}
	
	public boolean playAction(String msg) {
		return true;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
