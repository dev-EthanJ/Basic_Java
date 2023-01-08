public class SalaryManager {
    
    public double getMonthlySalary(int yearlySalary) {
        double monthSalary = (double)yearlySalary / 12;

        double tax = calculateTax(monthSalary);
        double pension = calculateNationalPension(monthSalary);
        double insurance = calculateHealthInsurance(monthSalary);

        double deduction = tax + pension + insurance;

        monthSalary -= deduction;

        return monthSalary;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double insurance = monthSalary * 0.135;
        System.out.println("insurance: " + insurance);

        return insurance;
    }

    public double calculateNationalPension(double monthSalary) {
        double pension = monthSalary * 0.081;
        System.out.println("pension: " + pension);

        return pension;
    }

    public double calculateTax(double monthSalary) {
        double tax = monthSalary * 0.125;
        System.out.println("tax: " + tax);

        return tax;
    }

    public static void main(String[] args) {
        SalaryManager sm = new SalaryManager();

        int salary = 20000000;
        double monthlySalary = sm.getMonthlySalary(salary);

        System.out.println("monthlySalary: " + monthlySalary);
    }
}
