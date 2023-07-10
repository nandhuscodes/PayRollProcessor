import java.util.Scanner;
abstract class Employee{
    String name;
    abstract double calculatePay();
}
class SalariedEmployee extends Employee{
    double salary;
    @Override
    double calculatePay() {
        return salary;
    }
}
class HourlyEmployee extends Employee{
    double hourlyRate, hoursWorked;
    @Override
    double calculatePay() {
        return hourlyRate*hoursWorked;
    }
}
public class PayRollProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        System.out.print("Enter Employee name: ");
        salariedEmployee.name = scanner.nextLine();
        hourlyEmployee.name = salariedEmployee.name;
        System.out.print("Enter salary: ");
        salariedEmployee.salary  = scanner.nextDouble();
        System.out.print("Enter Hourly rate: ");
        hourlyEmployee.hourlyRate = scanner.nextDouble();
        System.out.print("Enter Hours worked: ");
        hourlyEmployee.hoursWorked = scanner.nextDouble();
        System.out.println("Monthly salary: "+salariedEmployee.calculatePay());
        System.out.println("Hourly salary: "+hourlyEmployee.calculatePay());
    }
}
