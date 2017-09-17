package tsp.g4;


import java.io.FileWriter;
import java.io.IOException;

public class Output {

    public static void writeToFile(String path, String value) throws IOException {
        FileWriter fw = new FileWriter(path);
        fw.write(value);
        fw.flush();
        fw.close();
    }
}
