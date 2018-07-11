package Lesson;

public class Encode {
    public static void Main(){
        System.out.println("+++ Practice Encode Begin \n");

        Encode thisObj = new Encode();

        thisObj.encode( "data/encode-sjis.txt" ,"SJIS");

        thisObj.encode( "data/ecnode-utf8.txt" , "UTF-8");

        System.out.println("\n--- Practice Encode Begin");
    }


    public void encode(String path,String type ) {
        switch(type ) {
            case "SJIS":{
                System.out.println(">>> FileLoad SjisMode");
            }   break;

            case "UTF-8":{
                System.out.println(">>> FileLoad Utf-8Mode");
            }   break;
        }
    }

}
