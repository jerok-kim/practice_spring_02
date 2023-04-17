package buffer;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class StreamEx04 {

    public static void main(String[] args) {
        OutputStream out = System.out;  // 모니터
        OutputStreamWriter ow = new OutputStreamWriter(out);
        BufferedWriter bw = new BufferedWriter(ow);

        try {
            bw.write("Hello, Jerok!");
            bw.flush();
        } catch (Exception e) {

        }
    }

}
