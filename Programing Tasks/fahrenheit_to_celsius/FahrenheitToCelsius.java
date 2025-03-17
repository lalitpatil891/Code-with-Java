/**Program 05 :
-------------
Write a program in java to Fahrenheit to Celsius Program
Formula is :-  celsius=((fahrenheit-32)*5)/9;*/

package com.nit.fahrenheit_to_celsius;

import java.util.Scanner;
import java.text.DecimalFormat;

class FahrenheitToCelsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean validInput = false;

		while (!validInput) {
			System.out.print("Enter Temperature in Fahrenheit: ");
			Double fahrenheit = sc.nextDouble();

			if (fahrenheit >= 32 && fahrenheit <= 212) {

				Double celsius = ((fahrenheit - 32) * 5) / 9;

				DecimalFormat df = new DecimalFormat("00.00");
				System.out.println("Temperature in Celsius: " + df.format(celsius));
				validInput = true;
			} else {
				System.out.println("Invalid Input please Enter 32 to 212..!");
				validInput = false;
			}

		}
		sc.close();
	}
}

/**
 * Fahrenheit and Celsius are two commonly used temperature scales:
 * 
 * Fahrenheit:
 * 
 * Denoted by °F. Used primarily in the United States and a few other countries.
 * The freezing point of water is 32°F, and the boiling point is 212°F under
 * standard atmospheric conditions. Celsius:
 * 
 * Denoted by °C. Part of the metric system and used worldwide (except a few
 * countries). The freezing point of water is 0°C, and the boiling point is
 * 100°C under standard atmospheric conditions. The two scales differ in their
 * starting points and the size of their units, but they can be converted using
 * the following formulas:
 * 
 * Celsius to Fahrenheit: Fahrenheit=(Celsius×9/5)+32
 * 
 * Fahrenheit to Celsius: Celsius=(Fahrenheit−32)×5/9
 * 
 * 
 * Standard Range of Fahrenheit Scale: Freezing Point of Water: 32∘F The
 * temperature at which water turns to ice under standard atmospheric pressure.
 * Boiling Point of Water: 212∘F The temperature at which water boils under
 * standard atmospheric pressure.
 */