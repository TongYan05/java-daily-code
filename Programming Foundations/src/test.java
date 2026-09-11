import javax.print.attribute.standard.OutputBin;
import java.util.Arrays;
import java.util.SplittableRandom;

public class test {
    public static void main(String[] args) {
//        String a="Alberto";
//        System.out.println(a.length()+" "+a.toUpperCase()+" "+a.toLowerCase()+
//                " "+a.charAt(0)+" "+a.substring(0,3)+" "+
//                a.indexOf('A')+" "+a.startsWith("Al")+" "+a.endsWith("to")
//                +" "+a.isBlank()+" "+a.isEmpty()+" "+a.contains("A")+" "+
//                a.replace('A','a')+" "+String.valueOf(0));
//        System.out.println(a);
//        int[] b={1,2,3,4,5,3,2,1};
//        char[] chars=a.toCharArray();
//        System.out.println(chars);
//        String s = "apple,banana,orange";
//        String[] arr = s.split(",");
//        Arrays.sort(b);
//        for(int x:b) System.out.println(x);
//        System.out.println(Arrays.toString(b)+Arrays.toString(arr));


//        int i =9;
//        i+=10.2;
//        System.out.println(i);


//        System.out.println(1 + 2 + "3" + 4 + 5);
//        System.out.println("Result: " + 1 + 2 + 3);
//        System.out.println(1 + "2" + 3 + 4 + "5" + 6);

//        double c = 10 / 3.0;
//        System.out.println(c);
//        double c = 10 / 3;
//        System.out.println(c);

//        int c = (int)(10.0 / 3.0);System.out.println(c);
//        int c = (int)(-3.9);System.out.println(c);
//        short s = 10; s = s + 5;
//        short s = 10; s += 5;
//        short x = 32767; x += 1; System.out.println(x);
//        int x = 5; double y = 2.0; System.out.println(x + y + " is " + (x + y));

//        float a = 10; System.out.println(a);
//        double b = 10f; System.out.println(b);

//        float c = 10.0; System.out.println(c);
//        double d = 0.1f; System.out.println(d);
//        if(d==0.1) System.out.println("successful");
//        else System.out.println("fail");
//        float e = 3.14F; System.out.println(e);
//        double f = 3.14F; System.out.println(f);
//        float g = 3.14d; System.out.println(g);
//        float gg = (float) 3.14d; System.out.println(gg);
//        double h = 3.14d; System.out.println(h);
//        float i = 10L; System.out.println(i);
//        double j = 10L; System.out.println(j);
//        switch (2) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); break; default: System.out.print("D"); }
//        switch (5) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); break; default: System.out.print("D"); }
//        switch (1) { case 1: case 2: case 3: System.out.print("ABC"); break; case 4: System.out.print("D"); }
//        int x = 2; switch (x + 1) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); break; }
//        switch (1) { case 1: System.out.print(1 + "2"); case 2: System.out.print(3 + 4); break; }
//        switch (2) { case 1: System.out.print("A"); default: System.out.print("D"); case 2: System.out.print("B"); case 3: System.out.print("C"); }
//        switch (2) { case 1 -> System.out.print("A"); case 2 -> System.out.print("B"); case 3 -> System.out.print("C"); }
//        switch (5) { case 1, 2, 3 -> System.out.print("ABC"); case 4, 5, 6 -> System.out.print("DEF"); default -> System.out.print("OTHER"); }
//        int a = 1; double b = 2.0; switch ((int)(a + b)) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); break; }
//        switch (1) { case 1: System.out.print("A"); case 2: System.out.print("B"); case 3: System.out.print("C"); case 4: System.out.print("D"); case 5: System.out.print("E"); }
//        int i = 0; if (i++ > 0 || i++ > 1) { System.out.println("A"); } System.out.println(i);
//        int i = 0; if (i++ > 0 && i++ > 1) { System.out.println("A"); } System.out.println(i);
//        int i = 0; if (i++ > 0 | i++ > 1) { System.out.println("A"); } System.out.println(i);
//        int i = 0; if (i++ > 0 & i++ > 1) { System.out.println("A"); } System.out.println(i);
//        int a = 5; int b = 10; if (a > b && ++a > 0) { System.out.println("X"); } System.out.println(a);
//        int a = 5; int b = 10; if (a > b || ++a > 0) { System.out.println("X"); } System.out.println(a);
//        int x = 1; int y = 2; if (x > 0 && ++y > 0) { System.out.println("Y"); } System.out.println(y);
//        int x = 1; int y = 2; if (x < 0 && ++y > 0) { System.out.println("Y"); } System.out.println(y);
//        int m = 0; int n = 0; if (++m > 0 || ++n > 0) { System.out.println("Z"); } System.out.println(m + "," + n);
//        int m = 0; int n = 0; if (++m > 0 | ++n > 0) { System.out.println("Z"); } System.out.println(m + "," + n);
//        for arrays, char[] is the special one in System.out.println().

//        double u=1+9;
//        String j=1+'1'+"fewg"+'a'+5+7;
//        System.out.println(j);
//        System.out.println(('a'==97&&'A'==65)+" "+(int)'1');
//        int t=10;
//        t=+1;
//        System.out.println(t);
//        int o=2147483647;
//        o=o+1;
//        System.out.println(o);


//```java
//        double a = 0.6;
//        double b = 0.4;
//
//        if (a + b == 1.0)
//            System.out.println("A");
//        else
//            System.out.println("B");

//```
//
//```java
//        float a = 16777216f;
//        float b = 1f;
//
//        System.out.println(a + b == a);
//```
//
//```java
//        float x = 16_777_217f;
//        System.out.println(x);
//```
//
//```java
//        double x = 9007199254740992.0;
//        double y = 1.0;
//
//        System.out.println(x + y == x);
//```
//
//```java
//        double x = 0.1;
//        float y = 0.1f;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 2.0 / 10.0;
//        double y = 0.2;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 0.3 - 0.2;
//        double y = 0.1;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 1.0 - 0.9;
//        double y = 0.1;
//
//        System.out.println(x == y);
//```
//
//```java
//        float x = 0.1f + 0.2f;
//        float y = 0.3f;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 0.1f + 0.2f;
//        double y = 0.3;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 1e20;
//        double y = x + 1;
//
//        System.out.println(y == x);
//```
//
//```java
//        float x = 1e10f;
//        float y = x + 1000f;
//
//        System.out.println(y == x);
//```
//
//```java
//        double x = 2.0 / 3.0;
//        double y = 0.6666666666666666;
//
//        System.out.println(x == y);
//```
//
//```java
//```
//
//```java
//        float x = 0.5f;
//        double y = 0.5;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 1.2f;
//        double y = 1.2;
//
//        System.out.println(x == y);
//```
//
//```java
//        float x = 3.0f / 10.0f;
//        double y = 0.3;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = (double)(float)1.23456789;
//        double y = 1.23456789;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = 0.1 + 0.2 + 0.3;
//        double y = 0.3 + 0.3;
//
//        System.out.println(x == y);
//```
//
//```java
//        double x = (0.1 + 0.2) + 0.3;
//        double y = 0.1 + (0.2 + 0.3);
//
//        System.out.println(x == y);
//```

        int[] ints = {1, 2, 3};
        String[] strings = {"java", "python"};
        int[] ints1 = Arrays.copyOf(ints, ints.length);
        String[] strings1 = Arrays.copyOf(strings, strings.length);

        System.out.println(ints == ints1);
        System.out.println(strings == strings1);
        System.out.println(ints[0] == ints1[0]);
        System.out.println(strings[0] == strings1[0]);


//        int day = 3;
//        String result = switch (day) {
//            case 1, 2, 3, 4, 5 -> "Weekday";
//            case 6, 7 -> "Weekend";
//        };
//        System.out.println(result);


    }
}
