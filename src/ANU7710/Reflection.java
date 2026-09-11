package ANU7710;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception {
        /*
        * clazz.getConstructor(...)
           clazz.getDeclaredField(...)
          clazz.getMethod(...)
           相当于：
          “Student，你有哪些 constructor？”
          “Student，你有没有一个叫 name 的 field？”
           “Student，你有没有一个叫 toString 的 method？”
        * */
//        Class<?> clazz = Class.forName("ANU7710.student");
//        Constructor<?> constructor = clazz.getConstructor(String.class, int.class, int.class);
//        Object studentInstance = constructor.newInstance("yan tong", 21, 8321729);
//        Field nameField = clazz.getDeclaredField("name");
//        nameField.setAccessible(true);//“即使这个 field 是 private，我也允许你通过 reflection 访问它。”
//        nameField.set(studentInstance, "julia");
//        Method tostring = clazz.getMethod("toString");
//        Object result = tostring.invoke(studentInstance);//在 studentInstance 这个对象上执行 toString()。
//        System.out.println(result);

        Class<?> clazz=Class.forName("ANU7710.student");
        java.lang.reflect.Constructor<?> constructor =clazz.getConstructor(String.class,int.class,int.class);
        Object o = constructor.newInstance("yantong",21,2005);
        Field name=clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(o,"Yan Tong");
        Method method=clazz.getMethod("toString");
        Object string=method.invoke(o);
        System.out.println(string);

    }
}
/*
Class<?> clazz=Class.forName();
clazz.getConstructor,getMethod,getDeclaredField
       Constructor    Method     Field
Object o=constructore.newinstance()
Object result= .invoke()

 */
