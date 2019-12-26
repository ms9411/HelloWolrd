package classes;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int speed;
	private int r;
	public Car(String company, String model, String color) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getCompany() {
		return company;
	}
	public int getR() {
		return r;
	}
	Car(){}
	Car(String compnay) {
		this.company = company; 
	}
	void setCompany(String company) {
		this.company = company;
	}
	void setR(int r) {
		this.color =r;
	}
	double getArea() {
		if(this. r>0) {
		double result = 3.14 * r * r;
		}else {
			return 0;
		}
		return result;
	}
}
