package Lesson;

public class ArrayPrint {
    public static void Main(){
        System.out.println("+++ Practice Array Print\n");

        int iArray[] = {0,1,2,3,4,5};
        String result = "";
        for( int i : iArray ){
            result += "LessonPrint : " + i;
            result += "\n";
        }
        System.out.println( result );

        System.out.println("\n--- Practice Array Print");
    }

}
