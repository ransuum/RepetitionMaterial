package patterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Handler assist = new Assistant();
        Handler rector = new Rector();
        Handler dir = new Director();

        assist.setNext(rector);
        rector.setNext(dir);

        assist.handleRequest("default req");
        assist.handleRequest("test correct answers");
        assist.handleRequest("High secret mess");
        assist.handleRequest("?");
    }
}
