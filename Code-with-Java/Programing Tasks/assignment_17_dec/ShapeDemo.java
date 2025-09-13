/** Assignment (17-DEC) ||  Question-2 */

package com.nit.assignment_17_dec;

public class ShapeDemo {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++)
		{
		Shape sh = Shape.randShape();
		sh.draw();
		sh.erase();
		}
		
	}
}

/*OUTPUT
Tringle Draw
Triangle Erase
Tringle Draw
Triangle Erase
Tringle Draw
Triangle Erase
Square Draw
Square Erase
Shape Draw
Shape Erase
*/