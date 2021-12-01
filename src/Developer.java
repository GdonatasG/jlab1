import java.util.Random;

public class Developer extends Employee {
    private int id;
    private double baseSalary;
    private int projects;
    private int linesOfCodeWritten;

    private int salaryBonus = new Random().nextInt(150);

    public Developer(int id) {
        this.id = id;
        this.baseSalary = 1000 + new Random().nextInt(1000);
        this.projects = new Random().nextInt(5);
        this.linesOfCodeWritten = new Random().nextInt(1000000);
    }

    public int getId() {
        return id;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getProjects() {
        return projects;
    }

    public void setProjects(int projects) {
        this.projects = projects;
    }

    public int getLinesOfCodeWritten() {
        return linesOfCodeWritten;
    }

    public void setLinesOfCodeWritten(int linesOfCodeWritten) {
        this.linesOfCodeWritten = linesOfCodeWritten;
    }

    @Override
    double calculateSalary() {
        return baseSalary + projects + salaryBonus;
    }

    double averageLinesOfCodePerProject() {
        return (double) linesOfCodeWritten / projects;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", baseSalary=" + baseSalary +
                ", projects=" + projects +
                ", totalSalary=" + calculateSalary() +
                ", linesOfCodeWritten=" + linesOfCodeWritten +
                "} " + super.toString();
    }
}

