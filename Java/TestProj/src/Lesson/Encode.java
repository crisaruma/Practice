package Lesson;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Encode {
    public static void Main(){
        System.out.println("+++ Practice Encode Begin \n");

        Encode thisObj = new Encode();

        //  SJISのテキストデータの中身を読み込む
        thisObj.encode( "data/encode-sjis.txt" ,"SJIS");
        thisObj.encode( "data/encode-sjis.txt" ,"UTF-8");

        //  UTF8のテキストデータの中身を読み込む
        thisObj.encode( "data/ecnode-utf8.txt" , "SJIS");
        thisObj.encode( "data/ecnode-utf8.txt" , "UTF-8");

        System.out.println("\n--- Practice Encode Begin");
    }


    public void encode(String path,String type ) {
        File hdlFile = new File(path);

        char[] readBuffer = new char[4096];

        FileInputStream ifStream = null;
        try {
            ifStream = new FileInputStream(hdlFile);
            InputStreamReader isReader = new InputStreamReader(ifStream , type);
            isReader.read(readBuffer);
            isReader.close();
            ifStream.close();

            String output = String.valueOf(readBuffer);

            switch(type ) {
                case "SJIS":{
                    System.out.println(">>> FileLoad SjisMode");
                }   break;

                case "UTF-8":{
                    System.out.println(">>> FileLoad Utf-8Mode");
                }   break;
            }
            System.out.println( output );

        }
        catch( Exception ex ){
            System.out.println( ex.getMessage() );
        }
    }

}
