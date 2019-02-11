/**
 * @auther: Li jx
 * @date: 2019/2/11 13:21
 * @description:
 */
public class Pear implements Fruit {
    private String shuliang ;
    private String daxiao;

    @Override
    public String toString() {
        return "Pear{" +
                "shuliang='" + shuliang + '\'' +
                ", daxiao='" + daxiao + '\'' +
                '}';
    }

    public String getShuliang() {
        return shuliang;
    }

    public void setShuliang(String shuliang) {
        this.shuliang = shuliang;
    }

    public String getDaxiao() {
        return daxiao;
    }

    public void setDaxiao(String daxiao) {
        this.daxiao = daxiao;
    }
}
