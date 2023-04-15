package buffer;

import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {

    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        
        try {
            // char[] inData = new char[1];
            // char[] inData = new char[2];
            char[] inData = new char[3];
            reader.read(inData);
            System.out.println(inData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
