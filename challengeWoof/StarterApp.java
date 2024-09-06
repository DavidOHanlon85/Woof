package challengeWoof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StarterApp {

	public static void main(String[] args) {

		List<Dog> dogs = new ArrayList<Dog>();

		String line;

		File file = new File("DogData-1.csv");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			// Read header line
			line = br.readLine();

			// Read first line
			line = br.readLine();

			while (line != null) {

				String[] splitDetails = line.split(",");

				String breed = splitDetails[0];
				double weight = Double.parseDouble(splitDetails[1]);
				double height = Double.parseDouble(splitDetails[2]);
				double lifeExpectancy = Double.parseDouble(splitDetails[3]);
				String color = splitDetails[4];
				String countryOfOrigin = splitDetails[5].trim();

				dogs.add(new Dog(breed, weight, height, lifeExpectancy, color, countryOfOrigin));

				line = br.readLine();

			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		int input;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Please select an option:");
			System.out.println("1. Show all");
			System.out.println("2. Order and show by height (smallest first)");
			System.out.println("3. Order and show by weight (heaviest first)");
			System.out.println("4. Group and show by country (frequency of breeds from each country)");
			System.out.println("5. Exit");
			
			input = sc.nextInt();

			switch (input) {
			case 1:
				System.out.println("All dogs\n");
				displayAllDogsToConsole(dogs);
				break;
			case 2:
				System.out.println("All dogs - Sorted by Height\n");
				Collections.sort(dogs, new SortByHeight());
				displayAllDogsToConsole(dogs);
				break;
			case 3:
				System.out.println("All dogs - Sorted by Weight\n");
				Collections.sort(dogs, new SortByWeight());
				displayAllDogsToConsole(dogs);
				break;
			case 4:
				System.out.println("All dogs - Frequency of Breeds From Each Country\n");
				Map<String, Integer> countryStatistics = mapCountriesToFrequency(dogs);
				printCountriesAndFrequencyToConsole(countryStatistics);
				break;
			case 5:
				System.out.println("Goodbye - Have a nice day!");
				break;
			default:
				System.out.println("Invalid input - try again");
				break;

			}

		} while (input != 5);

	}

	/**
	 * @param countryStatistics
	 */
	public static void printCountriesAndFrequencyToConsole(Map<String, Integer> countryStatistics) {
		for (String country : countryStatistics.keySet()) {
			System.out.println(country + " " + countryStatistics.get(country));

		}
	}

	/**
	 * This method maps country of origin to frequency of those countries in the
	 * list of dogs
	 * 
	 * @param dogs
	 * @return
	 */
	public static Map<String, Integer> mapCountriesToFrequency(List<Dog> dogs) {
		Map<String, Integer> countryStatistics = new TreeMap<String, Integer>();

		for (Dog d : dogs) {
			if (countryStatistics.containsKey(d.getCountryOfOrigin())) {
				int freq = countryStatistics.get(d.getCountryOfOrigin());
				countryStatistics.put(d.getCountryOfOrigin(), ++freq);
			} else {
				countryStatistics.put(d.getCountryOfOrigin(), 1);
			}
		}
		return countryStatistics;
	}

	/**
	 * This method displays all Dogs to Console
	 * 
	 * @param dogs
	 */
	public static void displayAllDogsToConsole(List<Dog> dogs) {
		for (Dog d : dogs) {
			d.showAllDetails();
		}
	}

}
