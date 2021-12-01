import java.util.Random;

public class ProjectManager extends Employee {
    private int id;
    private double baseSalary;
    private int projects;
    private int presentationsPrepared;

    private int salaryBonus = new Random().nextInt(150);

    public ProjectManager(int id) {
        this.id = id;
        this.baseSalary = 1200 + new Random().nextInt(1000);
        this.projects = new Random().nextInt(5);
        this.presentationsPrepared = new Random().nextInt(10);
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

    public int getPresentationsPrepared() {
        return presentationsPrepared;
    }

    public void setPresentationsPrepared(int presentationsPrepared) {
        this.presentationsPrepared = presentationsPrepared;
    }

    double averagePresentationsPerProject() {
        return (double) presentationsPrepared / projects;
    }

    @Override
    double calculateSalary() {
        return baseSalary + ((double) presentationsPrepared * projects) + salaryBonus;
    }

    @Override
    public String toString() {
        return "ProjectManager{" +
                "projects=" + projects +
                ", presentationsPrepared=" + presentationsPrepared +
                ", totalSalary=" + calculateSalary() +
                ", averagePresentationsPerProject=" + averagePresentationsPerProject() +
                "} " + super.toString();
    }
}
