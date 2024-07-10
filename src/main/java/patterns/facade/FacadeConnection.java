package patterns.facade;

public class FacadeConnection {
    private DataBase dataBase;
    private Server server;

    public FacadeConnection(DataBase dataBase, Server server) {
        this.dataBase = dataBase;
        this.server = server;
    }

    public void startDataBaseServer(String host, int port){
        dataBase.connectTo(TypeConnection.DATA_BASE, host, port);
    }

    public void startServer(String host, int port){
        server.connectTo(TypeConnection.SERVER, host, port);
    }
}
