package patterns.facade;

public interface Connection {
    void connectTo(TypeConnection typeConnection, String host, int port);
}
