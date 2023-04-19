package socket.half_duplex.single_thread.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyClient {

    // GET 요청 (자원을 주세요)
    public MyClient() throws Exception {
        // 1. 서버 연결
        Socket socket = new Socket("localhost", 10000);

        // 2. 클라이언트가 요청함
        PrintWriter request = new PrintWriter(socket.getOutputStream(), true);
        request.println("html");

        // 3. 클라이언트가 응답을 받음 (반이중)
        BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        String msg = response.readLine();  // <html>코드 읽음
        System.out.println("서버에게서 응답이 왔습니다 : " + msg);
    }

    public static void main(String[] args) {
        try {
            new MyClient();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
