
public class WeightLifting extends Anaerobic{
	/**
	 * @return string description
	 */
	public String description() {
		return ("WeightLifting");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Shoulders, Muscle.Legs, Muscle.Arms, Muscle.Triceps};
	}
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 3.5)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 5.0)/60);
		else
			return ((weight * duration * 6.0)/60);
	}
}
