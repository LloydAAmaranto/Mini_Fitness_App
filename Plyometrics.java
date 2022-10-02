
public class Plyometrics extends Anaerobic {
	/**
	 * @return string description
	 */
	public String description() {
		return ("Plyometrics");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		return new Muscle[] {Muscle.Abs, Muscle.Legs, Muscle.Glutes};
	}
	/**
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 2.5)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 4.8)/60);
		else
			return ((weight * duration * 7.4)/60);
	}
}
