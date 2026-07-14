package Object_Oriented;

import jdk.dynalink.beans.StaticClass;

import javax.lang.model.element.Name;
import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        FirstType one = new FirstType();
        one.name = "Julie";
        one.age = 18;
        one.isMale = false;
        FirstType.schoolName = "UNSW";
        one.show();

        FirstType ONE = new FirstType("James", 19, false);
        ONE.show();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        SecondType two = new SecondType();
        SecondType three =new SecondType("Peter", 20190002, 90.5, 1);
        three.printInformation();
        // 修改：分数减10，排名加6
        three.setGrade(three.getGrade()-10);
        three.setRank(three.getRank()+6);
        three.printInformation();

        SecondType four = new SecondType();
        four.setName("David");
        four.setStudentID(20190003);
        four.setGrade(85.5);
        four.setRank(4);
        four.printInformation();
        //修改：分数减10，排名加6
        four.setGrade(four.getGrade()-10);
        four.setRank(four.getRank()+6);
        four.printInformation();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        ThirdType.showing(arr);
        ThirdType.maxarray(arr);

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.print("请输入数组长度：");
        int i = input.nextInt();
        int array[]=new int[i];
        for(int j=0;j<i;j++){
            array[j]=random.nextInt(10000);
        }
        ThirdType.showing(array);
        ThirdType.maxarray(array);


    }
}
