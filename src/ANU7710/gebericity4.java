package ANU7710;

public class gebericity4 {
    public static void main(String[] args) {

        //泛型方法


        student stu[]=new student[5];
        printArray(stu);
        printArray2(stu);





    }

    public static <T> void printArray(T[] t){
    }

    public static <T> T printArray2(T t){
        return t;
    }



}
