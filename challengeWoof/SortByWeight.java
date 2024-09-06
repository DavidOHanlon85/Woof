/**
 * 
 */
package challengeWoof;

import java.util.Comparator;

/**
 * @author - Daithi O hAnluain - 15621049
 */
public class SortByWeight implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {

		if (o1.getWeight() < o2.getWeight()) {
			return 1;
		} else if (o1.getWeight() > o2.getWeight()) {
			return -1;
		} else {
			return 0;
		}
	}

}
