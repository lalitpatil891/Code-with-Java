package com.nit.air_conditioner;

public class AirConditioner {

	String brand;
	boolean isOn;
	int temperature;
	String mode;
	int temp;
	String power;

	AirConditioner() {
		brand = "Generic";
		isOn = false;
		temperature = 24;
		mode = "Cool";
	}

	public AirConditioner(String brand, boolean isOn, int temperature, String mode) {
		super();
		this.brand = brand;
		this.isOn = isOn;
		this.temperature = temperature;
		this.mode = mode;
	}

	void powerOn() {
		isOn = true;
		power = "ON";
	}

	void powerOff() {
		isOn = false;
		power = "OFF";
	}

	void setTemperature(int temp) {
		if (temp >= 16 && temp <= 30) {
			this.temperature = temp;
		} else {
			System.err.println("Invalid temperature! Please set a value between 16°C and 30°C.");
		}
	}

	void changeMode(String newMode) {
		switch (newMode) {
		case "Cool":
			this.mode = newMode;
			break;

		case "Heat":
			this.mode = newMode;
			break;

		case "Fan":
			this.mode = newMode;
			break;

		default:
			System.err.println("Invalid modes..!");
		}
	}
	
	
	public void displayStatus() {
		if(isOn == true) {
		System.out.println("The AC is now "+power+".");
		System.out.println("Temperature set to " +temperature+"\u00B0C.");
		System.out.println("Mode changed to " +mode+ ".");
		System.out.println("AC Status:");
		System.out.println("Brand: " +brand);
		System.out.println("Power: " +power);
		System.out.println("Temperature: "+temperature+"\u00B0C");
		System.out.println("Mode: "+mode);
		}
		else
		{
			System.out.println("The AC is now "+power+".");
		}
	}
}
