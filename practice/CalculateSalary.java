public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary calc = new CalculateSalary();
        calc.calculateSalaries();
    }

    public long getSalaryIncrease(Employee employee) {
        int type = employee.getType();
        long salary = employee.getSalary();
        
        switch(type) {
            case 1:
            return salary / 100 * 5;
            case 2:
            return salary / 10 * 11;
            case 3:
            return salary / 10 * 12;
            case 4:
            return salary / 10 * 13;
            case 5:
            return salary / 1 * 2;
            default:
            return salary;
        }
    }

    public void calculateSalaries() {
        Employee[] employeesArr = new Employee[5];
        String[] names = { "LeeDaeRi", "KimManager", "WhangDesign", "ParkArchi", "LeeDevelop"};
        int[] types = { 1, 2, 3, 4, 5};
        long[] salaries = { 1000000000, 100000000, 70000000, 80000000, 60000000 };

        for(int i = 0; i < employeesArr.length; ++i) {
            employeesArr[i] = new Employee(names[i], types[i], salaries[i]);
        }


        CalculateSalary calc = new CalculateSalary();
        for(Employee person: employeesArr) {
            long newSalary = calc.getSalaryIncrease(person);
            System.out.println(person.getName() + " = " + newSalary);
        }
    }
}