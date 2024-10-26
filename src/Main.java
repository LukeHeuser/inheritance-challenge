public class Main {
    public static void main(String[] args) {

        Employee luke = new Employee("Luke", "02/17/1999", "10/17/22");

        System.out.println(luke);
        System.out.println("Age = " + luke.getAge());
        System.out.println("Pay = $" + luke.collectPay());

        HourlyEmployee john = new HourlyEmployee("John", "01/16/1985", "07/23/2005", 19.50);
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("Pay = $" + john.collectPay());
        System.out.println("Double Pay = $" + john.getDoublePay());

        SalariedEmployee hannah = new SalariedEmployee("Hannah", "11/24/2004", "06/15/2023",
                78_500d);

        System.out.println(hannah);
        System.out.println("Age = " + hannah.getAge());
        System.out.println("Pay = $" + hannah.collectPay());
        hannah.isRetired();
        System.out.println("Pay after retirement is  = $" + hannah.collectPay());


    }
}
