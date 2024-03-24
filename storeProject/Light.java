package storeProject;


public class Light extends Product {
	int watts;
	int lumens;
	
	public void noOfAmps(int amps) {
	};
	
	public void checkPowerUTil(String power) {
	};
	
	
	public Light (int id, String name, int price, int watts, int lumens ) {
		this.watts= watts;
		this.lumens=lumens;
		this.id = id;
		this.name = name;
		this.price = price;
	};
	
	
	@Override
	public String toString() {
		return this.id + " " + this.name;
	}
	
	public boolean equals(Light product) {
		return product.id==this.id && product.watts==this.watts && product.lumens==this.lumens;
	}

	public int getWatts() {
		return watts;
	}

	public void setWatts(int watts) {
		this.watts = watts;
	}

	public int getLumens() {
		return lumens;
	}

	public void setLumens(int lumens) {
		this.lumens = lumens;
	}

	
	
}
