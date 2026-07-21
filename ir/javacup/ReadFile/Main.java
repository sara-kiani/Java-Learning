package ir.javacup.ReadFile;
import java.io.FileReader;
public class Main {

    public static void main(String[] args) throws Exception {

        //FileReader reader = new FileReader("ReadFile/Text.txt");
        // Exception in thread "main" java.io.FileNotFoundException: ReadFile\Text.txt (The system cannot find the path specified)
        // at java.base/java.io.FileInputStream.open0(Native Method)
        // at java.base/java.io.FileInputStream.open(FileInputStream.java:185)
        // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:139)
        // at java.base/java.io.FileInputStream.<init>(FileInputStream.java:109)
        // at java.base/java.io.FileReader.<init>(FileReader.java:60)
        // at ir.javacup.ReadFile.Main.main(Main.java:8)
        FileReader reader = new FileReader("C:\\Users\\ASUS\\Desktop\\javalerning\\Src\\ir\\javacup\\ReadFile\\Text.txt");
        int ch;

        while ((ch = reader.read()) != -1) {

            System.out.print((char) ch);

        }

        reader.close();
    }
}