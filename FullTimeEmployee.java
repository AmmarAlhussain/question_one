
public class FullTimeEmployee extends Employee {

	@Override
	public double bonus() {
		return super.getBasicSalary() * 0.03;
	}

}
