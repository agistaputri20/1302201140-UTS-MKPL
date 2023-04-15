package lib;

import java.util.Date;

public class Person {
    private String employeeId;
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    private Date dateJoined;
    private int monthWorkingInYear;

    private boolean isForeigner;
    private boolean gender; //true = Laki-laki, false = Perempuan

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Date dateJoined) {
        this.dateJoined = dateJoined;
    }

    public int getMonthWorkingInYear() {
        return monthWorkingInYear;
    }

    public void setMonthWorkingInYear(int monthWorkingInYear) {
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public boolean isForeigner() {
        return isForeigner;
    }

    public void setForeigner(boolean foreigner) {
        isForeigner = foreigner;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
}