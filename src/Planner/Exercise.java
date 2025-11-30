package Planner;

public class Exercise {
	private final String name;
	private final MuscleSubgroup subgroup;
	private final IntensityLevel intensity;

	public Exercise(String name, MuscleSubgroup subgroup, IntensityLevel intensity) {
	    this.name = name;
	    this.subgroup = subgroup;
	    this.intensity = intensity;
	}
	
	public MuscleSubgroup getSubgroup() {
		return subgroup;
	}
	
	public IntensityLevel getISL() {
		return intensity;
	}
	
	public MuscleGroup getMuscleroup() {
        return subgroup.getMuscleGroup();
    }
	
}
