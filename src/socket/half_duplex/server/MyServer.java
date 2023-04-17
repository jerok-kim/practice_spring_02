package socket.half_duplex.server;

import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public MyServer() throws Exception {
        // 1. 서버 대기중
        ServerSocket serverSocket = new ServerSocket(10000);
        Socket socket = serverSocket.accept();
    }

    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
