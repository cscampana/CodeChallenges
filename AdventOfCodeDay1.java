/**
 * This is a solution for the Advent of Code day 1 challenge. It uses nested
 * for loops to search through an integer array in order to find the two or
 * three elements that add to 2020 and return the multiplication between them.
 * 
 * @author @ccampana_
 *
 */
public class AdventOfCodeDay1 {
	/**
	 * This is the part 1, where we want to find two elements that add to
	 * 2020, and return their multiplication.
	 * 
	 * @param arr array containing the integer list.
	 * @return integer containg the multiplication of two arr elements.
	 */
	public int part1(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == 2020) {
					return arr[i] * arr[j];
				}
			}
		}

		return 0;
	}

	/**
	 * This is the part 2, where we want to find three elements that add to
	 * 2020, and return their multiplication.
	 * 
	 * @param arr array containing the integer list.
	 * @return integer containg the multiplication of three arr elements.
	 */
	public int part2(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr.length; k++) {
					if ((arr[i] + arr[j] + arr[k]) == 2020) {
						return arr[i] * arr[j] * arr[k];
					}
				}

			}
		}

		return 0;
	}
}
