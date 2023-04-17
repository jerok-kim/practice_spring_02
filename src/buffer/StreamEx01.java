package buffer;

import java.io.IOException;
import java.io.InputStream;

/**
 * Socket - 소켓으로 데이터가 흘러가야 하는 길 (Byte Stream)
 */
public class StreamEx01 {

    public static void main(String[] args) {
        InputStream in = System.in;  // 키보드
        
        try {
            int inData = in.read();  // A = 65 (아스키코드)
            System.out.println(inData);
            System.out.println((char)inData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
