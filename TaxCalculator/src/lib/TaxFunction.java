package lib;

public class TaxFunction {
	
	private final int persenTax = 0.05;
	private final int freeTaxSingle = 54000000;
	private final int freeTaxMarried = 54000000 + 4500000;


	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(persenTax * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (freeTaxMarried + (numberOfChildren * 4500000))));
		}else {
			tax = (int) Math.round(persenTax * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - freeTaxSingle));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}
