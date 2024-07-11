package patterns.state;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();

        human.exercise();
        human.takeMedicine();
        human.sleep();

        human.setH(new BadHealthyState());
        human.exercise();
        human.takeMedicine();
        human.sleep();

        human.exercise();
        human.takeMedicine();
        human.sleep();
    }
}
