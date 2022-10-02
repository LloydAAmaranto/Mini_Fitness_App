
public class Profile {
	int age;
	double height;
	double weight;
	Gender gender;
	/**
	 * constructor
	 * @param age
	 * @param height
	 * @param weight
	 * @param gender
	 */
	public Profile(int age, double height, double weight, Gender gender) {
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}
	/**
	 * 
	 * @param height
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	/**
	 * 
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * 
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * 
	 * @param gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * 
	 * @return
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * 
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * 
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * 
	 * @return gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @return string of age, weight, height, and gender
	 */
	@Override public String toString() {
		String a = String.format("%.1f", (Math.round(height*10.0)/100.0)*10);
		return ("Age " + age + ", Weight " + weight + "kg, Height " + a + "m, Gender " + gender);
	}
	/**
	 * 
	 * @return BMI 
	 */
	public double calcBMI() {
		return (weight/(height*height));
	}
	/**
	 * 
	 * @return daily calorie intake
	 */
	public double dailyCalorieIntake() {
		if(gender == Gender.MALE) 
			return (66.47 + (13.75 * weight) + (5.003 * (height*100.0)) - (6.755 * age));
		else
			return (655.1 + ( 9.563 * weight) + ( 1.85 * (height*100.0)) - ( 4.676 * age ));
	}
}
