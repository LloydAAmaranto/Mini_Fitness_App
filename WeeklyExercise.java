
public class WeeklyExercise {
	Fitness[] exerciseList;
	int days;
	double weeklyCalorieTarget;
	Profile profile;
	/**
	 * @param exerciseList
	 * @param days
	 * @param weeklyCalorieTarget
	 * @param profile
	 */
	public WeeklyExercise(Fitness [ ]exerciseList, int days, double weeklyCalorieTarget, Profile profile) {
		this.exerciseList = exerciseList;
		this.days = days;
		this.weeklyCalorieTarget = weeklyCalorieTarget;
		this.profile = profile;
	}
	/**
	 * 
	 * @param exerciseList
	 * @param profile
	 */
	public WeeklyExercise(Fitness[ ] exerciseList, Profile profile) {
		this.exerciseList = exerciseList;
		this.profile = profile;
		days = 7;
		weeklyCalorieTarget = 3500;
	}
	/**
	 * 
	 * @param ex
	 */
	public void addExercise(Fitness ex) {
		Fitness[] exerciseList = new Fitness[this.exerciseList.length + 1];
		for(int i = 0; i<this.exerciseList.length; i++) {
			exerciseList[i] = this.exerciseList[i];
		}
		exerciseList[exerciseList.length-1] = ex;
		this.exerciseList = exerciseList;
	}
	/**
	 * 
	 * @param ex
	 */
	public void removeExercise(Fitness ex) {
		int numRemEle = 0;
		for(int i = 0; i < this.exerciseList.length; i++) {
			if(this.exerciseList[i].equals(ex))
				numRemEle++;
		}
		int temp =0;
		Fitness[] exerciseList = new Fitness[this.exerciseList.length-numRemEle];
		for(int i=0; i < this.exerciseList.length;i++) {
			if(!this.exerciseList[i].equals(ex))
				exerciseList[i-temp] = this.exerciseList[i];
			else
				temp++;
		}
		this.exerciseList = exerciseList;
	}
	/**
	 * 
	 * @param list
	 */
	public void setExerciseList(Fitness [ ] list) {
		this.exerciseList = list;
	}
	/**
	 * 
	 * @param days
	 */
	public void setDays(int days) {
		this.days = days;
	}
	/**
	 * 
	 * @param target
	 */
	public void setWeeklyCalorieTarget(double target) {
		this.weeklyCalorieTarget = target;
	}
	/**
	 * 
	 * @param profile
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}
	/**
	 * 
	 * @return fitness array
	 */
	public Fitness [] getExerciseList( ) {
		return exerciseList;
	}
	/**
	 * 
	 * @return exercise list length
	 */
	public int getSize() {
		return exerciseList.length;
	}
	/**
	 * 
	 * @return days
	 */
	public int getDays() {
		return days;
	}
	/**
	 * 
	 * @return profile
	 */
	public Profile getProfile() {
		return profile;
	}
	/**
	 * 
	 * @return weekly calorie target
	 */
	public double getWeeklyCalorieTarget() {
		return weeklyCalorieTarget;
	}
	/**
	 * 
	 * @param intensity
	 * @return daily exercise array
	 */
	public DailyExercise [ ] getWeeklyExercises(Intensity intensity) {
		return new DailyExercise[0];
	}
	/**
	 * 
	 * @return daily exercise array
	 */
	public DailyExercise[] getWeeklyExercises() {
		return new DailyExercise[0];
		/*Profile p = new Profile(profile.age, profile.weight, profile.height, profile.gender);
		DailyExercise d = new DailyExercise(exerciseList, days, weeklyCalorieTarget, profile);
		int temp = 0;
		double cal = 0;
		for(int i = 0; i < exerciseList.length; i++) {
			if(cal < weeklyCalorieTarget) {
				temp++;
				cal+=exerciseList[i].calorieLoss(Intensity.LOW, p.weight, days);
			}
		}
		System.out.println(temp);
		DailyExercise[] dE = new DailyExercise[temp];
		int temp2 = 0;
		double calo = 0;
		for(int i = 0; i < exerciseList.length; i++) {
			if (calo < weeklyCalorieTarget) {
				//dE[temp2] =;
				temp2++;
			}
		}
		return dE;*/
	}
	/**
	 * 
	 * @param targetWeight
	 * @param withInDays
	 * @return targeted calorie loss
	 */
	public String targetedCalorieLoss(double targetWeight, int withInDays) {
		Profile p = new Profile(profile.age, profile.height, profile.weight, profile.gender);
		if(targetWeight > p.weight)
			return ("Only works to lose weight");
		String a = String.format("%.2f", (p.weight - targetWeight)*7000/withInDays);
		String b = String.format("%.2f", (p.dailyCalorieIntake()));
		String c = String.format("%.2f", (p.dailyCalorieIntake()-(p.weight - targetWeight)*7000/withInDays));
		String d = String.format("%.2f", (p.weight - targetWeight));
		return ("You need to lose " + a + " calories per day or decrease your intake from " + b + 
				" to " + c + " in order to lose " + d + " kg of weight");
	}
}
