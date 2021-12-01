public class Department {
    private String name;
    private Employees employees;

    public Department(String name, Employees employees) {
        this.name = name;
        this.employees = employees;
    }

    void addEmployee(Employee e) {
        employees.add(e);
    }

    public String getName() {
        return name;
    }

    double totalEmployeesSalary() {
        return employees.totalSalary();
    }

    int totalEmployeesLinesOfCodeWritten() {
        return employees.totalLinesOfCodeWritten();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employees=\n\n" + employees +
                ", totalEmployeesSalary= " + totalEmployeesSalary() + "\n" +
                ", totalEmployeesLinesOfCodeWritten= " + totalEmployeesLinesOfCodeWritten() + "\n" +
                '}';
    }
}
