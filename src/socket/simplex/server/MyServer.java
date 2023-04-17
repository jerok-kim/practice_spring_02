package socket.simplex.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyServer {

    public MyServer() throws Exception {
        // 1. 서버 대기중
        ServerSocket serverSocket = new ServerSocket(10000);  // 리스너 서버 생성
        System.out.println("Server is waiting...");
        Socket socket = serverSocket.accept();  // 클라이언트 연결 대기
        System.out.println("클라이언트가 연결되었습니다");

        // 2. 서버 메시지 읽음
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        String msg = reader.readLine();  // 버퍼에 \n까지 읽음
        System.out.println("받은 메시지 : " + msg);
    }

    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
