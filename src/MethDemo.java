import java.lang.reflect.Method;

/**
 * @auther: Li jx
 * @date: 2019/2/10 22:06
 * @description:
 */
public class MethDemo {


    public void print(int a, int b) {
        System.out.println(a + b);

    }

    public void print(String a, String b) {
        System.out.println("heLLo" + a + b);
    }

    public static void main(String[] args) {
        MethDemo methDemo = new MethDemo();
        methDemo.print(2, 3);
        try {
            Method method = methDemo.getClass().getMethod("print", int.class, int.class);
            method.invoke(methDemo, 1, 2);
            Method method1 = methDemo.getClass().getMethod("print", String.class, String.class);
            method1.invoke(methDemo, "22","223");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
