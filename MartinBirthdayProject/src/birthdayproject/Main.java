/*I affirm that I have carried out the attached academic endeavors with full academic honesty,
 *  in accordance with the Union College Honor Code and the course syllabus.
 * Corbin Martin
 * CSC-150-01
 * 1/16/2017
 */

package birthdayproject;

public class Main
{
	public static void main(String[] args) {
		//run experiment from 5-100 people with increments of 5 and 
		// 10 iterations per sample size
		runExperiment(5, 100, 5, 10);	
	}

	//Logic loop for running the experiment.
	public static void runExperiment(int minPeople, int maxPeople, int peopleIncrement, int experiments) {
		int matches;
		BirthdayList birthdayList = new BirthdayList(minPeople);
		
		//increment from 5 to 100 by 5, allowing for different sample sizes
		for (int i = minPeople ; i <= maxPeople ; i = i + peopleIncrement) {
			
			matches = 0;
			//Run 10 experiments with the current list size and check for matches
			for (int x = 0; x < experiments ; x++) {
				if (birthdayList.matchInList())
					matches++;
				//generate a new list of birthdays after each experiment
				birthdayList.regenerateBirthdays();
			}
			
			System.out.println("The birthday experiment worked " + matches
					 + "/" + experiments + " times for " + i + " people.");
			
			//Set birthdayList to a new size and automatically generate a new list
			birthdayList.setSize(i);
		}
	}
}


