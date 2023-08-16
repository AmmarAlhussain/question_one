
public class PartTimeEmployee extends Employee {

	@Override
	public double bonus() {
		return super.getBasicSalary() * 0.015;
	}

}
