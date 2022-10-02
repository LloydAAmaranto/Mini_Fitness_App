
public class PullUp extends Endurance {
	/**
	 * @return string description
	 */
	public String description() {
		return ("PullUp");
	}
	/**
	 * @return Muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Biceps, Muscle.Arms};
	}
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 4.8)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 6.0)/60);
		else
			return ((weight * duration * 7.5)/60);
	}
}
