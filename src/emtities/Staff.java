package emtities;

public abstract class Staff {
    protected int id;
    private static int autoId;
    protected double salary;
    protected String name;

    public Staff(String name, double salary) {
        this.id = ++autoId;
        this.salary = salary;
        this.name =name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double caculateSalary();
    public abstract double caculateTax() ;

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
