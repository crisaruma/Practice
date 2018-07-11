package Lesson;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class WriteStream {
    public static void Main(){
        System.out.println("+++ Practice WriteStream\n");

        WriteStream writeObj = new WriteStream();

        writeObj.writeStream("data/writeStream.txt");

        System.out.println("\n--- Practice WriteStream");
    }

    /**
     * @brief ストリームを使用した、ファイル書き込みテスト
     * @param path
     */
    public void writeStream(String path){

        File hdlFile = new File(path);
        FileOutputStream outputStream = null;

        try {
            //  byte 型に Hexで、0x80 以上を指定するとエラーで怒られる。
            //  (byte)でキャストしてやると怒られない。
            //  整数値指定でも、-128 ～ 127 を超える値を指定すると、怒られる。
            byte intArray[]= {0x41,0x51,0x61,0x71,0x7F,(byte)(0x8F),-1,-128,((-129)&0xFF)};
            for( byte val : intArray ){
                System.out.println( "Array Val = " + val );
            }

            outputStream = new FileOutputStream( hdlFile);
            outputStream.write(intArray);
            outputStream.close();

        }catch ( Exception ex ){
            System.out.println( ex.getMessage() );
        }

    }
}
