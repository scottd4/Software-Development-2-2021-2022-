import java.io.*;

public class AppendFile {

    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("appender.txt", true));

        pw.append("hello World");

        pw.close();

    }

}
