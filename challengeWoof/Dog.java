package challengeWoof;

public class Dog {
	
	// Instance variable
	
	private String breed;
	private double weight;
	private double height;
	private double lifeExpectancy;
	private String color;
	private String countryOfOrigin; 
	
	// Constructors

	/**
	 * Constructor with args
	 * 
	 * @param breed
	 * @param weight
	 * @param height
	 * @param lifeExpectancy
	 * @param color
	 * @param countryOfOrigin
	 */
	
	public Dog(String breed, double weight, double height, double lifeExpectancy, String color,
			String countryOfOrigin) {
		super();
		this.breed = breed;
		this.weight = weight;
		this.height = height;
		this.lifeExpectancy = lifeExpectancy;
		this.color = color;
		this.countryOfOrigin = countryOfOrigin;
	}
	// Getters and Setters
	
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * @return the lifeExpectancy
	 */
	public double getLifeExpectancy() {
		return lifeExpectancy;
	}
	/**
	 * @param lifeExpectancy the lifeExpectancy to set
	 */
	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the countryOfOrigin
	 */
	public String getCountryOfOrigin() {
		return countryOfOrigin;
	}
	/**
	 * @param countryOfOrigin the countryOfOrigin to set
	 */
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	// Methods

	public void showAllDetails() {
		System.out.println("Breed             : " +this.breed);
		System.out.println("Weight            : " +this.weight);
		System.out.println("Height            : " +this.height);
		System.out.println("Color             : " +this.color);
		System.out.println("Life Expectancy   : " +this.lifeExpectancy);
		System.out.println("Country of Origin :" +this.countryOfOrigin);
		System.out.println();
	}
	
	
	
	
	

}
