package Lesson;

import java.io.File;
import java.io.FileWriter;
import java.util.Objects;

public class WriteFile {
    public static void Main(){
        System.out.println("+++ Practice WriteFile Begin\n");

        String path = "data/WriteTest.txt";
        WriteFile thisObj = new WriteFile();
        thisObj.writeFile(path);

        ReadFile readTest = new ReadFile();
        readTest.readFile(path);

        System.out.println("\n--- Practice WriteFile Finish");
    }

    public void writeFile(String path){
        File hdlFile = new File(path);

        FileWriter writeObj = null;

        try{
            writeObj = new FileWriter(hdlFile);

            writeObj.write("WriteFile Test 1 \r\n");
            writeObj.write("WriteFile Test 2 \r\n");
            writeObj.write("WriteFile Test 3 \r\n");

            writeObj.close();
        }
        catch(Exception ex){
            System.out.println( ex.getMessage() );
        }

    }
}
