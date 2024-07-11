package patterns.chainOfResponsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(String request) {
        if (request.equals("High secret mess")){
            System.out.println("Director have access to High secret mess\n");
        } else {
            if (next != null) {
                next.handleRequest(request);
            } else {
                System.out.println("Request cannot be handled.");
            }
        }
    }
}
