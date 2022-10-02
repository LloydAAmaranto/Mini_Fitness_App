
public class Swimming extends Aerobic {
	public SwimmingType type;
	/**
	 * constructor
	 */
	public Swimming () {
		type = SwimmingType.Freestyle;
	}
	/**
	 * 
	 * @param type
	 */
	public Swimming (SwimmingType type) {
		this.type = type;
	}
	/**
	 * 
	 * @param type
	 */
	public void setSwimmingType(SwimmingType type) {
		this.type = type;
	}
	/**
	 * 
	 * @return swimming type
	 */
	public SwimmingType getSwimmingType() {
		return type;
	}
	/**
	 * @return string description
	 */
	@Override 
	public String description() {
		return ("Swimming");
	}
	/**
	 * @return muscle array
	 */
	public Muscle[] muscleTargeted() {
		if(type.equals(SwimmingType.Butterflystroke)) 
			return new Muscle[] {Muscle.Abs, Muscle.Back, Muscle.Shoulders,
								 Muscle.Biceps, Muscle.Triceps};
		else if (type.equals(SwimmingType.Breaststroke))
			return new Muscle[] {Muscle.Glutes, Muscle.Cardio};
		else
			return new Muscle[] {Muscle.Arms, Muscle.Legs, Muscle.Cardio};
	}	
	/**
	 * @param intensity
	 * @param weight
	 * @param duration
	 * @return calorie loss
	 */
	public double calorieLoss(Intensity intensity, double weight, int duration) {
		if(intensity == Intensity.LOW) 
			return ((weight * duration * 6.0)/60);
		else if (intensity == Intensity.MEDIUM)
			return ((weight * duration * 8.3)/60);
		else
			return ((weight * duration * 10)/60);
	}
}
