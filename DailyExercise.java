
public class DailyExercise {
	
	Fitness[] exerciseList;
	int duration;
	double calorieTarget;
	Profile profile;
	/**
	 * 
	 * @param exerciseList
	 * @param duration
	 * @param calorieTarget
	 * @param profile
	 */
	public DailyExercise(Fitness [] exerciseList, int duration, double calorieTarget, Profile profile) {
		this.exerciseList = exerciseList;
		this.duration = duration;
		this.calorieTarget = calorieTarget;
		this.profile = profile;
	}
	/**
	 * 
	 * @param exerciseList
	 * @param profile
	 */
	public DailyExercise(Fitness[] exerciseList, Profile profile) {
		this.exerciseList = exerciseList;
		this.profile = profile;
		duration = 60;
		calorieTarget = 500;
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
	public void setExerciseList(Fitness[] list) {
		this.exerciseList = list;
	}
	/**
	 * 
	 * @param duration
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	/**
	 * 
	 * @param target
	 */
	public void setCalorieTarget(double target) {
		calorieTarget = target;
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
	public Fitness[ ] getExerciseList( ) {
		return exerciseList;
	}
	/**
	 * 
	 * @return duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * 
	 * @return calorie target
	 */
	public double getCalorieTarget() {
		return calorieTarget;
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
	 * @param targetMuscle
	 * @return fitness array
	 */
	public Fitness[] getExercises(Muscle[] targetMuscle) {
		int temp =0;
		boolean sw=true;
		int checker = 0;

		for(int i = 0; i < exerciseList.length; i++) {
			for(int j = 0; j < exerciseList[i].muscleTargeted().length; j++) {
				for(int k=0; k<targetMuscle.length; k++) {
					if(exerciseList[i].muscleTargeted()[j] == (targetMuscle[k]))
						checker++;
				}
			}
			if (checker != targetMuscle.length){
				sw=false;
				checker=0;
			}
			else 
				checker=0;
	
			if(sw == true)
				temp++;
			else
				sw=true;
		}
		if(temp==0)
			return null;
		
		Fitness[] exercises = new Fitness[temp];
		int temp2 =0;
		boolean sww =true;
		int checker2 = 0;
		for(int i = 0; i < exerciseList.length; i++) {
			for(int j = 0; j < exerciseList[i].muscleTargeted().length; j++) {
				for(int k = 0; k < targetMuscle.length; k++) {
					if(exerciseList[i].muscleTargeted()[j] == (targetMuscle[k])) 
						checker2++;
				}
			}
			if(checker2 != targetMuscle.length) {
				sww=false;
				checker2=0;
			}
			else 
				checker2=0;
			if(sww == true) {
				exercises[temp2] = exerciseList[i];
				temp2++;
			}
			else
				sww=true;
		}
		return exercises;
	}
}