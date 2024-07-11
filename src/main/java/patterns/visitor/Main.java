package patterns.visitor;

public class Main {
    public static void main(String[] args) {
        University university = new University();

        university.addUniversityMember(new Professor("John", 25000d));
        university.addUniversityMember(new Student("Dmitriy", 5));

        SalaryVisitor salaryVisitor = new SalaryVisitor();
        university.accept(salaryVisitor);
        System.out.println("salary: " + salaryVisitor.getTotalSalary() + " name: " + salaryVisitor.getName());

        CreditHoursVisitor creditHoursVisitor = new CreditHoursVisitor();
        university.accept(creditHoursVisitor);
        System.out.println("credit hours: " + creditHoursVisitor.getTotalHours() + " name: " + creditHoursVisitor.getName());
    }
}
