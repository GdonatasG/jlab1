import java.util.Random;

public class Company {
    private int numberOfDepartments;
    private int employeesPerDepartment;
    private Departments departments;

    public Company(int numberOfDepartments, int employeesPerDepartment) {
        this.numberOfDepartments = numberOfDepartments;
        this.employeesPerDepartment = employeesPerDepartment;
        departments = new Departments();
        final Random random = new Random();
        for (int i = 0; i < numberOfDepartments; i++) {
            Employees employees = new Employees();
            for (int j = 0; j < employeesPerDepartment; j++) {
                int k = random.nextInt(2);
                if (k == 0) {
                    employees.add(new Developer(j));
                } else {
                    employees.add(new ProjectManager(j));
                }
            }
            departments.add(new Department("#" + i + 1, employees));
        }
    }

    void addDepartment(Department d) {
        departments.add(d);
    }

    void printTotalSalariesOfDepartments() {
        for (Department department : departments) {
            System.out.println(department.getName() + ": " + department.totalEmployeesSalary());
        }
    }

    void printTotalLinesOfCodeWrittenOfDepartments() {
        for (Department department : departments) {
            System.out.println(department.getName() + ": " + department.totalEmployeesLinesOfCodeWritten());
        }
    }

    void sortDepartmentsByTotalSalary() {
        departments.sort(new TotalSalaryCriteria());
    }

    void sortDepartmentsByTotalLinesOfCodeWritten() {
        departments.sort(new TotalLinesOfCodeWrittenCriteria());
    }


    String showDepartments() {
        StringBuilder departmentsString = new StringBuilder();
        for (Department department : departments) {
            departmentsString.append(department).append("\n\n");
        }

        return departmentsString.toString();
    }
}
