package patterns.visitor;

public class CreditHoursVisitor implements Visitor {
    private int totalHours = 0;
    private String name;
    @Override
    public void visit(Professor professor) {

    }

    @Override
    public void visit(Student student) {
        totalHours += student.getCreditHours();
        name = student.getName();
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
