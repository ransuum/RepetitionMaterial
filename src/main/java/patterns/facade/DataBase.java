package patterns.facade;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class DataBase implements Connection{

    @Override
    public void connectTo(TypeConnection typeConnection, String host, int port) {
        if (typeConnection.equals(TypeConnection.DATA_BASE)) {
            Thread thread = new Thread(() -> {
                try (ServerSocket serverSocket = new ServerSocket(port, 50, InetAddress.getByName(host))) {
                    System.out.println("Server started at " + serverSocket.getInetAddress() + ":" + port);
                    System.out.println("Connection type: " + typeConnection);
                    Thread.sleep(4000);
                    System.out.println("Server stopped");
                    System.exit(0);
                    while (!Thread.currentThread().isInterrupted()) {
                        try (Socket socket = serverSocket.accept()) {
                            System.out.println("Client connected: " + socket.getInetAddress());
                        } catch (IOException e) {
                            System.err.println("Error handling client connection: " + e.getMessage());
                        }
                    }
                } catch (IOException | InterruptedException e) {
                    System.err.println("Server error: " + e.getMessage());
                }
            });
            thread.start();
        } else {
            throw new UnsupportedOperationException("Connection type not supported: " + typeConnection);
        }
    }
}
