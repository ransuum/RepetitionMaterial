package patterns.visitor;

public class Student implements UniversityMember{
    private String name;
    private int creditHours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public Student(String name, int creditHours) {
        this.name = name;
        this.creditHours = creditHours;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
