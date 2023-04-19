package socket.half_duplex.asynchronous.server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyServer {

    public MyServer() throws Exception{
        ServerSocket serverSocket = new ServerSocket(10000);
        
        while(true) {  // 데몬으로 변경됨
            // 1. 서버 대기중
            Socket socket = serverSocket.accept();
            System.out.println("클라이언트가 연결되었습니다");
            
            new Thread(()-> {
                try {
                    // 2. 서버 요청 받음
                    BufferedReader request = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
                    String msg = request.readLine();  // 버퍼에 \n까지 읽음
                    System.out.println(msg);
                    
                    // 3. 테스트를 위해 5초 대기
                    Thread.sleep(5000);
                    
                    // 4. 서버 응답
                    BufferedWriter response = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
                    response.write("<html><h1>Hello</h1></html>");
                    response.write("\n");
                    response.flush();
                    System.out.println("클라이언트에게 응답합니다 ------------ close");
                    socket.close();
                    request.close();
                    response.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
    
    public static void main(String[] args) {
        try {
            new MyServer();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
