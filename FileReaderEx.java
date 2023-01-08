import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {
        FileReader fileIn = null;

        try {
            fileIn = new FileReader("C:/windows/system.ini");
            int c;
            while((c = fileIn.read()) != -1) {
                System.out.print((char) c);
            }
            fileIn.close();
        } catch (IOException e) {
            System.out.println("IO error");
        }
    }
}