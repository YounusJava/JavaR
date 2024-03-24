package storeProject;

public class Table extends Product {

	double height;
	double width;
	double length;
	
	public void area(double a, double b) {
		double TArea= a*b;
	};
	
	public void volume(double a, double b, double c) {
		double TVolume= a*b*c;
	};
	
	public Table (int id, String name, int price,double h, double w, double l  ) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.height = h;
		this.width = w;
		this.length = l;
		
	};
	
	
	@Override
	public String toString() {
		return this.id+" "+this.name+" "+this.price+" "+this.height+" "+this.width+" "+this.length;
	}
	
	public boolean equals(Table product) {
		return product.id==this.id && product.length==this.length && product.height==this.height && product.width==this.width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	
}

