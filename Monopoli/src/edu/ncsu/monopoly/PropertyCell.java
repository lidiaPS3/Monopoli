package edu.ncsu.monopoly;

public class PropertyCell extends Cell {
	private String colorGroup;
	private int housePrice;
	private int numHouses;
	private int rent;
	private int sellPrice;
	private boolean available = true;

	public String getColorGroup() {
		return colorGroup;
	}

	public int getHousePrice() {
		return housePrice;
	}

	public int getNumHouses() {
		return numHouses;
	}
    
    public int getPrice() {
		return sellPrice;
	}

	public int getRent() {
		int rentToCharge = calcMonopoliesRent();
		if(numHouses > 0) {
			rentToCharge = rent * (numHouses + 1);
		}
		return rentToCharge;
	}

	private int calcMonopoliesRent() {
		int rentToCharge = rent;
		String [] monopolies = propietario.getMonopolies();
		for(int i = 0; i < monopolies.length; i++) {
			if(monopolies[i].equals(colorGroup)) {
				rentToCharge = rent * 2;
			}
		}
		return rentToCharge;
	}

	public boolean playAction(String msg) {
		Player currentPlayer = null;
		if(!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
			if(propietario != currentPlayer) {
				currentPlayer.payRentTo(propietario, getRent());
			}
		}
		return true;
	}

	public void setColorGroup(String colorGroup) {
		this.colorGroup = colorGroup;
	}

	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}

	public void setNumHouses(int numHouses) {
		this.numHouses = numHouses;
	}

	public void setPrice(int sellPrice) {
		this.sellPrice = sellPrice;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
