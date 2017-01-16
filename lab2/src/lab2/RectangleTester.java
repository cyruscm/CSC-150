/*Corbin Martin
 * Lab 2
 * 12-01-2017
 */
package lab2;

import CSLib.DrawingBox;
import CSLib.OutputBox;
import java.awt.Rectangle;

public class RectangleTester {

	
	/* Runs a series of experiments on CSLib's DrawingBox, OutputBox, and awt's Rectangle object.
	 * Produces a series of translations, position changes, and growths to a single rectangle. 
	 * Also creates 2 rectangles and checks for their intersection and creates a bounding
	 * box with validation.
	 */
	public static void main(String[] args) {
		//Declare initial variables
		DrawingBox myBoard;
		DrawingBox newBoard;
		OutputBox output;
		Rectangle myRect;
		Rectangle Rect1;
		Rectangle Rect2;

		//Construct the objects used for the first half of the experiment
		myBoard = new DrawingBox();
		newBoard = new DrawingBox();
		output = new OutputBox();
		myRect = new Rectangle(320, 230, 120, 180);
		
		//Display the first experiment DrawingBox
		myBoard.setVisible(true);
		//myRect.drawRect(320, 230, 120, 180);

		//Series of modifications to a rectangle with rendering after 
		//each action in the DrawingBox
		myBoard.drawRect(myRect);
		myRect.grow(20, 20);
		myBoard.drawRect(myRect);
		myRect.translate(280, -50);
		myBoard.drawRect(myRect);
		myRect.setLocation(75, 250);
		myBoard.drawRect(myRect);
		myRect.setLocation(75, 50);
		myRect.setSize(200, 150);
		myBoard.drawRect(myRect);

		//Display the objects needed for the second experiment
		newBoard.setVisible(true);
		output.setVisible(true);

		//Construct the objects used for the second half
		Rect1 = new Rectangle(50, 180, 120, 180);
		Rect2 = new Rectangle(100, 240, 150, 200);

		//Draw the first 2 rectangles
		newBoard.drawRect(Rect1);
		newBoard.drawRect(Rect2);

		//Checks for intersection of Rect1 and Rect2 and outputs 
		//the result to the OutputBox
		if (Rect1.intersects(Rect2))
			output.println("They do intersect");
		else 
			output.println("They do not intersect");

		// Create a new Rectangle object that is the bounding box of 
		// Rect1 and Rect2 then draw it
		Rectangle BoundingRect;
		BoundingRect = Rect1.union(Rect2);
		newBoard.drawRect(BoundingRect);

		//Validates that the bounding box contains both Rect1 and Rect2
		//then outputs the result to the OutputBox
		if (BoundingRect.contains(Rect1) && BoundingRect.contains(Rect2))
			output.println("The bounding box contains both Rect1 and Rect2");
		else 
			output.println("The bounding box does not contain both Rect1 and Rect2");
	}

}
