import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Asep", 5000, 500);
        Employee e2 = new Employee("Junpei", 6000, 600);

        Project p1 = new Project("AI Love Language", e1);
        Project p2 = new Project("Web App for Sigma", e2);

        List<Employee> empList = List.of(e1, e2);
        List<Project> projList = List.of(p1, p2);

        Company company = new Company(empList, projList);

        p1.showProjectDetails();
        p2.showProjectDetails();
        company.showCompanyDetails();
    }
}