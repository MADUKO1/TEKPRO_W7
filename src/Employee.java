public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary, double bonus) {
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        return salary;
    }

    public double calculateBonus() {
        return bonus;
    }

    public double calculateTotalIncome() {
        return salary + bonus;
    }

    public String getName() {
        return name;
    }
}
