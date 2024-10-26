public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;



    public SalariedEmployee(String name, String birthDate, String hireDate, Double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;

    }

    public double collectPay(){

        double paycheck = annualSalary/ 26;
        double adjustedPay = (isRetired) ? (paycheck * 0.9) : paycheck;

        return adjustedPay;

    }

    public void isRetired() {
        terminate("10/25/24");
        isRetired = true;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
