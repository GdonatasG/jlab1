import java.util.ArrayList;

public class Employees extends ArrayList<Employee> {
    double totalSalary() {
        double salary = 0;
        for (Employee employee : this) {
            salary += employee.calculateSalary();
        }
        return salary;
    }

    int totalLinesOfCodeWritten() {
        int lines = 0;
        for (Employee employee : this) {
            if (employee instanceof Developer) {
                lines += ((Developer) employee).getLinesOfCodeWritten();
            }
        }

        return lines;
    }

    int totalPresentationsPrepared() {
        int total = 0;
        for (Employee employee : this) {
            if (employee instanceof ProjectManager) {
                total += ((ProjectManager) employee).getPresentationsPrepared();
            }
        }

        return total;
    }


    String showAllEmployees() {
        StringBuilder employeesString = new StringBuilder();
        for (Employee employee : this) {
            employeesString.append("     ").append(employee).append("\n");
        }

        return employeesString.toString();
    }

    @Override
    public String toString() {
        return showAllEmployees();
    }
}
