
public class Squat extends Endurance {
	/**
	 * @return string description
	 */
	public String description() {
		return ("Squat");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Glutes, Muscle.Abs, Muscle.Back};
	}
	
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 2.5)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 5.0)/60);
		else
			return ((weight * duration * 7.0)/60);
	}
}
