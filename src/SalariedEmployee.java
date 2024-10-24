public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;



    public SalariedEmployee(String name, String birthDate, String hireDate, Double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;

    }

    public double collectPay(){
        return annualSalary/ 26;
    }

    public String isRetired() {
        if (isRetired){
            return "retired";
        } else {
            return "not retired";
        }

    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
