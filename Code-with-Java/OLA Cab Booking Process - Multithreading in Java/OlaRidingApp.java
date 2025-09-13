package com.nit.assingnment_30_jan_2025;

class RideRequest extends Thread {

	@Override
	public void run() {
		System.out.println("User requested a ride...");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Serching for neardy drivers..");
	}
}

class DriverAssignment extends Thread {

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("Driver Found and assigned!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}


	}
}

class FareCalculation extends Thread { // C
	@Override
	public void run() {

		System.out.println("Calculating estimated fare...");

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("Estimated fare: 135.75 Rs.");
	}
}

class LiveTracking extends Thread { // d

	@Override
	public void run() {
		for (int i = 20; i <= 100; i++) {

			System.out.println("Updation ride location... " + i + "% completed");
			i += 19;

		}

		System.out.println("Ride Completed.");
	}
}

class PaymentProcessing extends Thread {

	@Override
	public void run() {
		System.out.println("Processing payment...");

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Payment successful!");
		
	}
}

class RatingSystem extends Thread {

	@Override
	public void run() {

		System.out.println("Requesting user rating...");

		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {

			e.printStackTrace();
		}

		System.out.println("User rated the ride: 5 Star");
	}
}

/**---------------Main Class---------------*/

public class OlaRidingApp {

	public static void main(String [] args) throws InterruptedException {

		RideRequest rideRequest = new RideRequest();
		DriverAssignment driverAssignment = new DriverAssignment();
		FareCalculation fareCalculation = new FareCalculation();
		LiveTracking liveTracking = new LiveTracking();
		PaymentProcessing paymentProcessing = new PaymentProcessing();
		RatingSystem ratingSystem = new RatingSystem();

		rideRequest.start();
		fareCalculation.start();
		rideRequest.join();
		driverAssignment.start();
		driverAssignment.join();
		liveTracking.start();
		liveTracking.join();
		paymentProcessing.start();
		paymentProcessing.join();
		ratingSystem.start();
		ratingSystem.join();


	}
}
