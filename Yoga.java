
public class Yoga extends Flexibility {
	/**
	 * @return string description
	 */
	public String description() {
		return ("Yoga");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Triceps, Muscle.Biceps};
	}
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 2.0)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 3.0)/60);
		else
			return ((weight * duration * 4.0)/60);
	}
}
