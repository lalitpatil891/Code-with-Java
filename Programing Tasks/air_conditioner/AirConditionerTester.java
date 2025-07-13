package com.nit.air_conditioner;

public class AirConditionerTester {

	public static void main(String[] args) {
		
		
		AirConditioner ac1 = new AirConditioner("CoolMaster",true,22,"Cool");
		ac1.powerOn();
		ac1.displayStatus();
		
		System.out.println("------------------------------");
		
		AirConditioner ac2 = new AirConditioner();
		ac2.powerOn();
		ac2.setTemperature(38);
		ac2.changeMode("Heat");
		ac2.displayStatus();

	}

}


/*
The AC is now ON.
Temperature set to 22°C.
Mode changed to Cool.
AC Status:
Brand: CoolMaster
Power: ON
Temperature: 22°C
Mode: Cool
------------------------------
Invalid temperature! Please set a value between 16°C and 30°C.
The AC is now ON.
Temperature set to 24°C.
Mode changed to Heat.
AC Status:
Brand: Generic
Power: ON
Temperature: 24°C
Mode: Heat
*/