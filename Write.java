import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
    private String file;
    private String text;

    public Write(){
        file = "";
        text = "";
    }

    public Write(String f){
        file = f;
        text = "";
    }

    public Write(String f, String t){
        file = f;
        text = t;
    }
    public void writeToFile(String file, String text){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String getfile(){
        return file;
    }
    public String gettext(){
        return text;
    }
    public String settext(String t){
        text = t;
        return text;
    }
    public String setfile(String f){
        file = f;
        return file;
    }
    public String toString(){
        return "File: " + file + "\nText: " + text;
    }
}
