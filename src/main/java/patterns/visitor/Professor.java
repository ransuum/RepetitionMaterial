package patterns.visitor;

public class Professor implements UniversityMember{
    private String name;
    private Double salary;

    public Professor(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
