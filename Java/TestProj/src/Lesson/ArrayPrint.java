package Lesson;

public class ArrayPrint {
    public static void Main(){
        System.out.println("+++ Practice Array Print\n");

        ArrayPrint thisObj = new ArrayPrint();

        thisObj.printInt();

        thisObj.printByte();

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

}
