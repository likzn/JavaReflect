/**
 * @auther: Li jx
 * @date: 2019/2/11 12:36
 * @description:
 */
public class Apple implements Fruit{
    private String color;
    private String size;

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public static void main(String[] args) throws Exception{
        String s = Class.forName("Apple").getName();
        System.out.println(s);

    }
}
