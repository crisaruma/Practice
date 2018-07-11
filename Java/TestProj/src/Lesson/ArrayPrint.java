package Lesson;

import java.util.ArrayList;

public class ArrayPrint {
    public static void Main(){
        System.out.println("+++ Practice Array Print\n");

        ArrayPrint thisObj = new ArrayPrint();

        thisObj.printInt();     //  int配列
        thisObj.printByte();    //  byte配列

        //  ArrayList
        thisObj.printArrayListTypeString();     //  TypeString
        thisObj.printArrayListTypeInteger();    //  TypeInteger

        System.out.println("\n--- Practice Array Print");
    }

    /**
     * @brief int型配列を宣言、初期化しコンソールに出力する
     */
    public void printInt(){
        int Array[] = {0,1,2,3,4,5};
        String result = "printInt  : ";
        for( int val : Array ){
            result += val;
            result += ",";
        }
        System.out.println( result );
    }

    /**
     * @brief byte型配列を宣言、初期化しコンソールに出力する
     */
    public void printByte(){
        byte Array[]={ 0 , 1 , 2 , 0x41 , 0x7F , (byte)(0x80) , -128 , (byte)(-129) };
        String result = "printByte : ";
        for( byte val : Array ){
            result += val;
            result += ",";
        }
        System.out.println( result );
    }


    /**
     * @brief ArrayList でString 配列を表示してみる
     */
    public void printArrayListTypeString(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("あいうえお");
        list.add("かきくけこ");
        list.add("さしすせそ");
        list.add("たちつてと");
        list.add("なにぬねの");
        list.add("はひふへほ");
        list.add("まみむめも");
        list.add("やゐゆゑよ");
        list.add("わ　を　ん");

        //  ToStringで、とりあえず中身を確認
        System.out.println( "printArrayListTypeString : " + list.toString() );

        //  forで、1要素ずつ表示
        for( String val : list )
        {
            System.out.println( val );
        }
    }

    /**
     * @brief ArrayList でInt 配列を表示してみる
     * ArrayList<E> の Eには、クラスしか指定できないので、int などの基本型は使えないので、
     * 基本型のラッパークラスを使う(Byte/Integer/Double等)
     */
    public void printArrayListTypeInteger(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        list.add(10000);
        list.add(100000);
        list.add(1000000);

        System.out.println( "printArrayListTypeInteger : " + list.toString() );

        for( Integer val : list ){
            System.out.println( val );
        }
    }

}
