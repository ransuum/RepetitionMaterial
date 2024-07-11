package patterns.chainOfResponsibility;

import com.sun.net.httpserver.Request;

public abstract class Handler {
    protected Handler next;


    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
