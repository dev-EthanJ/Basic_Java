import java.io.*;

public class FileReadHangul {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;

        try {
            fin = new FileInputStream("FileWriterTest.txt");
            in = new InputStreamReader(fin);
            int ch;

            System.out.println("encoding charset is " + in.getEncoding());
            while((ch = in.read()) != -1) {
                System.out.print((char)ch);
            }
            in.close();
            fin.close();
        } catch (IOException e) {
            System.out.println("Input Output Error");
        }
    }
}