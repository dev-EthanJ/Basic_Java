public class Employee {
    public Employee(String name, int type, long salary) {
        this.name = name;
        this.type = type;
        this.salary = salary;
    }

    private String name;
    private int type;
    private long salary;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setType(int type) { this.type = type; } 

    public int getType() { return type; }

    public void setSalary(long salary) { this.salary = salary; }

    public long getSalary() { return salary; }
}