
public interface Fitness {
	/**
	 * 
	 * @return Muscle array
	 */
	public Muscle[] muscleTargeted();
	/**
	 * 
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public  double calorieLoss(Intensity intensity, double weight, int duration);
	/**
	 * 
	 * @return string of description
	 */
	public String description();
}
