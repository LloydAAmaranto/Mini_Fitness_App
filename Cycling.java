
public class Cycling extends Aerobic{
	/**
	 * @return discription
	 */
	public String description() {
		return ("Cycling");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Glutes, Muscle.Cardio, Muscle.Legs};
	}
	/**
	 * @param intensity 
	 * @param weight
	 * @param duration
	 * @param duration time in minute 
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 4.0)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 8.5)/60);
		else
			return ((weight * duration * 14.0)/60);
	}
}
