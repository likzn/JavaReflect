import javafx.scene.shape.VLineTo;

import java.lang.reflect.Method;

/**
 * @auther: Li jx
 * @date: 2019/2/11 12:40
 * @description:
 */
public class FactoryUtil {

    public static Object setValue(String value) throws Exception{
        String[] strings = value.split("\\|");
        String type = strings[0];
        Class clazz = Class.forName(type);
        Object object = clazz.newInstance();
        for (int i=1;i<strings.length;i++) {
            String[] s = strings[i].split("\\.");
            s[0] = s[0].substring(0, 1).toUpperCase().concat(s[0].substring(1).toLowerCase());
            Method method = clazz.getDeclaredMethod("set" + s[0], String.class);
            method.invoke(object, s[1]);
        }
        return object;



    }

}
