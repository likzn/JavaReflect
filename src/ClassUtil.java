import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @auther: Li jx
 * @date: 2019/2/10 20:59
 * @description: 运行时利用反射知道类的信息
 */
public class ClassUtil {
    public static void getObjectMessage(Object object) {
        System.out.println("类名称" + object.getClass());

        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            System.out.print("方法名称\n" + method.getName() + "(");
            Type[] args = method.getGenericParameterTypes();
            for (Type arg : args) {
                System.out.print(arg.getTypeName()+",");
            }
            System.out.println();
            System.out.println("返回类型" + method.getReturnType());
        }
    }
}
