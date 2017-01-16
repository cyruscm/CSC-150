package org.test;

public class TestMain
{
/**
 * Lab 1 Solution - Analyzer for department store purchases 
 * @author Matthew Anderson
 */
public class Analyzer {

    /** 
     * Declares, initializes, and prints local variables containing
     * information about a department store: (i) the number of
     * employees, (ii) the amount of cash on hand, (iii) the customer
     * satisfication rate (A, B, C, D, or F), and (iv) whether the
     * store manager is current in.
     */
    public void storeInformation() {

	int numEmployees = 14;
	double cashOnHand = 3400.59;
	char customerRating = 'B';
	boolean managerIn = false;

	System.out.println("We have " + numEmployees + " employees.");
	System.out.println("We have $" + cashOnHand + " cash on hand.");
	System.out.println("Our customer satisfication rating is " 
			   + customerRating + " on a scale of A to F.");

	if (managerIn)
	    System.out.println("The manager is in.");
	else
	    System.out.println("The manager is out.");

    }

    /**
     * Considers the first three numbers in purchases.  If all are
     * above max, this method prints that a great morning was had and
     * displays the values of those purchases.  If any of the these
     * purchases were at or below min it prints that it was a bad
     * morning.
     *
     * @param purchase is a chronological collection of purchases,
     * must have length >= 3.
     * @param min      purchases <= to this amount are bad.
     * @param max      purchases > this amount are good.
     */
    public void purchaseAnalyzer(double[] purchase, double min, double max) {
	
	if (purchase[0] > max && purchase[1] > max && purchase[2] > max)
	    System.out.println("Great morning with purchases"
			       + " $" + purchase[0] 
			       + ", $" + purchase[1] 
			       + ", and $" + purchase[2] + "!");
	
	if (purchase[0] <= min || purchase[1] <= min || purchase[2] <= min)
	    System.out.println("Bad morning.");

    }

    /**
     * Determines and prints the first "good" purchase (i.e., above
     * max), if it exists.  Determines and prints the number of good
     * purchases before the first "bad" purchase (i.e., at or below min).
     *
     * @param purchase is a chronological collection of purchases       
     * @param min      purchases <= to this amount are bad.
     * @param max      purchases > this amount are good.
     */
    public void inDepthAnalyzer(double[] purchase, double min, double max) {

	boolean foundGood = false;
	boolean foundBad = false;
	int goodIndex = -1;
	int numGoodBeforeBad = 0;
	int i = 0;

	// Loop over the purchases checking keeping track of good and
	// bad ones, and the number of good before the first bad one.
	while(i < purchase.length){
	    // Note: A for loop might be a better choice here.

	    // Check for bad purchase
	    if (purchase[i] <= min) {
		foundBad = true;
	    }

	    // Check for good purchase
	    if (purchase[i] > max) {
		if (!foundGood){
		    foundGood = true;
		    goodIndex = i;
		}

		if (!foundBad)
		    numGoodBeforeBad++;
	    }
	    
	    i++;
	}

	// Print out the value and index of first good purchase if it exists.
	if (foundGood) 
	    System.out.println("The first good purchase of the day was $" 
			       + purchase[goodIndex] + " at index " + goodIndex + ".");
	else 
	    System.out.println("There were no good purchases today.");
	
	// Print out the number of good purchases before the first bad one.
	if (foundBad) 
	    System.out.println("There were " + numGoodBeforeBad 
			       + " good purchases before the first bad one.");
	else
	    System.out.println("There were " + numGoodBeforeBad 
			       + " good purchases and no bad ones.");

    }

    /**
     * A really dumb way of printing the entire array.
     *
     * @param purchase is a chronological collection of purchases
     */
    public void printer(double[] purchase) {
        System.out.println();
        System.out.println("purchase[0]: " + purchase[0]);
        System.out.println("purchase[1]: " + purchase[1]);
        System.out.println("purchase[2]: " + purchase[2]);
        System.out.println("purchase[3]: " + purchase[3]);
        System.out.println("purchase[4]: " + purchase[4]);
        System.out.println("purchase[5]: " + purchase[5]);
        System.out.println("purchase[6]: " + purchase[6]);
        System.out.println("purchase[7]: " + purchase[7]);
        System.out.println("purchase[8]: " + purchase[8]);
        System.out.println("purchase[9]: " + purchase[9]);
    }

}
}
