package buffer;

import java.io.IOException;
import java.io.InputStream;

public class StreamEx01 {

    public static void main(String[] args) {
        InputStream in = System.in;
        
        try {
            int inData = in.read();
            System.out.println(inData);
            System.out.println((char)inData);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
