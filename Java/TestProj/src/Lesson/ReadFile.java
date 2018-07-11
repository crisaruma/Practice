package Lesson;

import java.io.File;
import java.io.FileReader;

public class ReadFile {
    public static void Main() {
        System.out.println("+++ Practice : Read File Begin\n");

        ReadFile thisObj = new ReadFile();
        thisObj.Read( "data/ReadTest.txt" );

        System.out.println("\n--- Practice : Read File Finish");
    }

    /**
     * @brief ファイルの読み込みテスト
     * @param path ファイルパス
     */
    public void Read(String path){
        File hdlFile = new File(path);

        FileReader readObj = null;
        try {
            readObj = new FileReader(hdlFile);

            int dat;
            while( ( dat = readObj.read() ) != -1  ){
                System.out.print( (char)dat );
            }
            readObj.close();
        }
        catch( Exception ex ) {
            System.out.println( ex.getMessage() );
        }
    }
}
