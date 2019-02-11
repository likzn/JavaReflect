/**
 * @auther: Li jx
 * @date: 2019/2/11 12:35
 * @description:简单工厂，利用反射将字符串中的信息映射成对象信息
 */
public class FactoryDemo {

    public static void main(String[] args) {
        String string = "Pear|shuliang.wuge|daxiao.feichangda";
        String[] strings = string.split("\\|");
        try {
            Class clazz = Class.forName(strings[0]);
            Object object =  FactoryUtil.setValue(string);
            System.out.println(object.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();

        }


    }

}
