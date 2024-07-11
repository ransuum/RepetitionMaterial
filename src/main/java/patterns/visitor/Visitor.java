package patterns.visitor;

public interface Visitor {
    void visit(Professor professor);
    void visit(Student student);
}
