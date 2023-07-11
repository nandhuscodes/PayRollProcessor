class Employee{
    public double calculatePay(String name, double salary){
        return salary;
    }
    public double calculatePay(String name, double workingHours, double hourlyRate){
        return workingHours*hourlyRate;
    }
}
class PayRollProcessor{
    public static void main(String[] args) {
        Employee lisa = new Employee();
        System.out.println(lisa.calculatePay("Lisa", 8880.0));
        System.out.println(lisa.calculatePay("Lisa", 45.5, 500.0));
    }
}