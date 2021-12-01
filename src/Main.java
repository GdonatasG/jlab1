public class Main {
    public static void main(String[] args) {
        Company company = new Company(3, 5);

        System.out.println("Departments before sorting");
        System.out.println(company.showDepartments());
        System.out.println("Departments total salaries before sorting: ");
        company.printTotalSalariesOfDepartments();
        System.out.println("Departments sorted by total salary");
        company.sortDepartmentsByTotalSalary();
        System.out.println(company.showDepartments());
        System.out.println("Departments total lines of code before sorting: ");
        company.printTotalLinesOfCodeWrittenOfDepartments();
        System.out.println("Departments sorted by total lines of code written");
        company.sortDepartmentsByTotalLinesOfCodeWritten();
        System.out.println(company.showDepartments());
    }
}
