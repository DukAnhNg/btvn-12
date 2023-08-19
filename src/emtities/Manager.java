package emtities;

public class Manager extends Staff {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public double caculateSalary() {
        return this.salary +this.salaryResponsibility;
    }

    @Override
    public double caculateTax() {
        if(caculateSalary() < 11000) return 0;
        return (caculateSalary()-11000) * 0.1;
    }

    private double salaryResponsibility;

    public Manager(String name, double salary, double salaryResponsibility) {
        super(name, salary);
        this.salaryResponsibility = salaryResponsibility;
    }

    public double getSalaryResponsibility() {
        return salaryResponsibility;
    }

    public void setSalaryResponsibility(double salaryResponsibility) {
        this.salaryResponsibility = salaryResponsibility;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "salaryResponsibility=" + salaryResponsibility +
                ", id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
