package buffer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx03 {

    public static void main(String[] args) {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        try {
            String inData = br.readLine();
            System.out.println(inData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
