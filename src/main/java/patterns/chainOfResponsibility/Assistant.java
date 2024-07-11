package patterns.chainOfResponsibility;

public class Assistant extends Handler{

    @Override
    public void handleRequest(String request) {
        if (request.equals("default req")){
            System.out.println("Assistant have permission\n");
        } else {
            next.handleRequest(request);
        }
    }
}
