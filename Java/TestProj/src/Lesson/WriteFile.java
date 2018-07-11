package Lesson;

import java.io.File;
import java.io.FileWriter;
import java.util.Objects;

public class WriteFile {
    public static void Main(){
        System.out.println("+++ Practice WriteFile Begin\n");

        WriteFile thisObj = new WriteFile();
        thisObj.WriteFile("data/WriteTest.txt");

        System.out.println("\n--- Practice WriteFile Finish");
    }

    public void WriteFile(String path){
        File hdlFile = new File(path);

        FileWriter writeObj = null;

        try{
            writeObj = new FileWriter(hdlFile);

            writeObj.write("WriteFile Test 1 \r\n");
            writeObj.write("WriteFile Test 2 \r\n");
            writeObj.write("WriteFile Test 3 \r\n");

            writeObj.close();

            ReadFile readTest = new ReadFile();

            readTest.Read(path);
        }
        catch(Exception ex){
            System.out.println( ex.getMessage() );
        }

    }
}
