import java.util.Comparator;

public class TotalLinesOfCodeWrittenCriteria implements Comparator<Department> {
    @Override
    public int compare(Department o1, Department o2) {
        return Integer.compare(o1.totalEmployeesLinesOfCodeWritten(), o2.totalEmployeesLinesOfCodeWritten());
    }
}
