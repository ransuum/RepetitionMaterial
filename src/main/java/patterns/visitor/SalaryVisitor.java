package patterns.visitor;

public class SalaryVisitor implements Visitor{
    private Double totalSalary = 0d;
    private String name;

    @Override
    public void visit(Professor professor) {
        totalSalary += professor.getSalary();
        name = professor.getName();
    }

    @Override
    public void visit(Student student) {}

    public Double getTotalSalary() {
        return totalSalary;
    }

    public void setSalary(Double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
