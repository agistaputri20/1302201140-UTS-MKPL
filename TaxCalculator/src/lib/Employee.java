package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

public class Employee extends Person{

	private int monthWorkingInYear;
	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

	private String spouseName;
	private String spouseIdNumber;

	private List<String> childNames;
	private List<String> childIdNumbers;
	
	public Employee(Person person) {
		this.employeeId = person.getEmployeeId;
		this.firstName = person.getFirstName;
		this.lastName = person.getLastName;
		this.idNumber = person.getIdNumber;
		this.address = person.getAddress;
		this.dateJoined = person.getDateJoined;
		this.isForeigner = person.isForeigner;
		this.gender = person.isGender;
		
		childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
	}

	private final int grade1 = 3000000;
	private final int grade2 = 5000000;
	private final int grade3 = 7000000;

	public void setMonthlySalary(int grade) {

		if (grade == 1) {
			monthlySalary = grade1;
			if (isForeigner) {
				monthlySalary = (grade1 * 0.5) + grade1;
			}
		}else if (grade == 2) {
			monthlySalary = grade2;
			if (isForeigner) {
				monthlySalary = (grade2 * 0.5) + grade2;
			}
		}else if (grade == 3) {
			monthlySalary = grade3;
			if (isForeigner) {
				monthlySalary = (grade3 * 0.5) + grade3;
			}
		}
	}
	
	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
	}
	
	public void setSpouse(String spouseName, String spouseIdNumber) {
		this.spouseName = spouseName;
		this.spouseIdNumber = idNumber;
	}
	
	public void addChild(String childName, String childIdNumber) {
		childNames.add(childName);
		childIdNumbers.add(childIdNumber);
	}
	
	public int getAnnualIncomeTax() {
		
		//Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
		LocalDate date = LocalDate.now();
		
		if (date.getYear() == dateJoined.year) {
			monthWorkingInYear = date.getMonthValue() - dateJoined.month;
		}else {
			monthWorkingInYear = 12;
		}
		
		return TaxFunction.calculateTax(monthlySalary, otherMonthlyIncome, monthWorkingInYear, annualDeductible, spouseIdNumber.equals(""), childIdNumbers.size());
	}
}
