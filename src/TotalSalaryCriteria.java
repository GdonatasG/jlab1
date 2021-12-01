import java.util.Comparator;

public class TotalSalaryCriteria implements Comparator<Department> {
    @Override
    public int compare(Department o1, Department o2) {
        return Double.compare(o1.totalEmployeesSalary(), o2.totalEmployeesSalary());
    }
}
