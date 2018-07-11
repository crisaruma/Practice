package Lesson;

public class ArrayPrint {
    public static void Main(){
        ArrayPrint obj = new ArrayPrint();
        System.out.println( obj.toString() );
    }

    @Override
    public String toString() {
        int iArray[] = {0,1,2,3,4,5};
        String result = "";
        for( int i : iArray ){
            result += "LessonPrint : " + i;
            result += "\n";
        }
        return result;
    }
}
