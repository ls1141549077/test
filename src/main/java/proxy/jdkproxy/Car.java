package proxy.jdkproxy;

/**
 * @author YSH
 * @ClassName Car
 * @Discription
 * @date 2019/5/8 0008
 */
public class Car implements Moveable {
    public void move() {
        System.out.println("正在跑路");
    }

    public void fast() {
        System.out.println("快");
    }
}
