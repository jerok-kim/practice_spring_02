package socket.simplex.client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class MyClient {

    public MyClient() throws IOException {
        // 1. 서버 연결
        Socket socket = new Socket("localhost", 10000);

        // 2. 메시지 전송
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8));
        writer.write("Hello, World!");
        writer.write("\n");  // 버퍼에 끝을 알려주는 프로토콜
        writer.flush();  // 버퍼에 담긴 메시지를 전송
    }

    public static void main(String[] args) {
        try {
            new MyClient();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
