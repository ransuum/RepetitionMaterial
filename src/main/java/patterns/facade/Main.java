package patterns.facade;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        FacadeConnection facade = new FacadeConnection(new DataBase(), new Server());
        facade.startDataBaseServer("localhost", 8081);
        Thread.sleep(2000);
        facade.startServer("localhost", 8080);
    }
}
