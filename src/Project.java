public class Project {
    private String projectName;
    private Employee employee;

    public Project(String projectName, Employee employee) {
        this.projectName = projectName;
        this.employee = employee;
    }

    public void showProjectDetails() {
        System.out.println("Project: " + projectName + " assigned to " + employee.getName());
    }
}


