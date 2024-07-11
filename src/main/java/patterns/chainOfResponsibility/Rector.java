package patterns.chainOfResponsibility;

public class Rector extends Handler{
    @Override
    public void handleRequest(String request) {
        if (request.equals("test correct answers")) System.out.println("Rector have access to " + request + "\n");
        else next.handleRequest(request);
    }
}
