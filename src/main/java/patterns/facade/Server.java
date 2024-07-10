package patterns.facade;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Connection {

    @Override
    public void connectTo(TypeConnection typeConnection, String host, int port) {
        if (typeConnection.equals(TypeConnection.SERVER)) {
            Thread thread = new Thread(() -> {
                try {
                    int backlog = 50;
                    ServerSocket serverSocket = new ServerSocket(backlog, port);

                    System.out.println("Server started at " + host + ":" + port);
                    System.out.println("Connection type: " + typeConnection);
                    Thread.sleep(4000);
                    System.out.println("Server stopped");
                    System.exit(0);
                    while (true) {
                        Socket socket = serverSocket.accept();
                        System.out.println("Client connected: " + socket.getInetAddress());
                    }
                } catch (IOException | InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            thread.start();
        } else throw new RuntimeException("Connection type not supported");
    }
}
