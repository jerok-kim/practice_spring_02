package socket.half_duplex.synchronous;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyClient1 {

    public MyClient1() throws Exception {
        // 1. 서버 연결
        Socket socket = new Socket("localhost", 10000);

        // 2. 클라이언트 요청함
        BufferedWriter request = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        request.write("html 페이지 주세요");
        request.write("\n");  // 버퍼의 끝을 알려주는 프로토콜
        request.flush();  // 버퍼에 담긴 메시지를 전송

        // 3. 클라이언트 응답 받음
        BufferedReader response = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        String msg = response.readLine();  // 버퍼에 \n까지 읽음
        System.out.println("서버에게서 응답이 왔습니다 : " + msg);
    }

    public static void main(String[] args) {
        try {
            new MyClient1();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
