import java.util.List;

public class Company {
    private List<Employee> employees;
    private List<Project> projects;

    public Company(List<Employee> employees, List<Project> projects) {
        this.employees = employees;
        this.projects = projects;
    }

    public void showCompanyDetails() {
        System.out.println("Company has " + employees.size() + " employees and " + projects.size() + " projects.");
    }
}
