public class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1; // This ID number is Static because it will change with each NEW
                                       // object created.


    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++; // Post increment number
        this.hireDate = hireDate;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
