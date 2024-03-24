package storeProject;

public class Laptop extends Product {
	double screenSize;
	int RAM;
	int SSD;
	double processor;
	
	public boolean checkCharging(boolean charging) {
		if (charging == true) {System.out.println("it is charging");
		return true;} else {
			System.out.println("it is not charging");
		}
		return false;
	}
	
	public boolean checkLogin(boolean login) {
		if (login == true) {System.out.println("it is logged in");
		return true;}
		return false;
	}
	public Laptop (int id, String name, int price, double screenSize, int RAM, int SSD, double processor) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.screenSize = screenSize;
		this.RAM = RAM;
		this.SSD = SSD;
		this.processor = processor;
	};
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.price+" "+this.screenSize+" "+this.RAM+" "+this.SSD+" "+this.processor;
	}
	
	public boolean equals(Laptop product) {
		return product.id==this.id && product.RAM==this.RAM && product.SSD==this.SSD && product.processor==this.processor;
	}

	 public void setName(String name1) {
		    this.name = name1; 
		    }
	
	 public String getName() {
	    return name; 
	    }

	public double getScreenSize() {
		return screenSize;
		}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public int getSSD() {
		return SSD;
	}

	public void setSSD(int sSD) {
		SSD = sSD;
	}

	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

}

