
public class TaiChi extends Flexibility{
	/**
	 * @return string description
	 */
	public String description() {
		return ("TaiChi");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Arms, Muscle.Legs};
	}
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 1.5)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 3.0)/60);
		else
			return ((weight * duration * 5.0)/60);
	}
}
