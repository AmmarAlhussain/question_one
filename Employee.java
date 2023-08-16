public abstract class Employee {

	private String name;
	private String position;
	private double basicSalary;
	private int experience;
	private EducationLevel educationalLevel;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public EducationLevel getEducationalLevel() {
		return educationalLevel;
	}

	public void setEducationalLevel(EducationLevel educationalLevel) {
		this.educationalLevel = educationalLevel;
	}

	public double salary() {
		double s = this.getBasicSalary() + this.getBasicSalary() * 0.05 * this.getExperience();
		if (this.educationalLevel == EducationLevel.Bachelor)
			s += 500;
		else if (this.educationalLevel == EducationLevel.diploma)
			s += 250;
		return s;
	}
	
	abstract public double bonus();

}
