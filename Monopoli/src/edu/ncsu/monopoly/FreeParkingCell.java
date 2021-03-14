package edu.ncsu.monopoly;

public class FreeParkingCell extends Cell {

	private boolean available = true;

	public FreeParkingCell() {
		setName("Free Parking");
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
