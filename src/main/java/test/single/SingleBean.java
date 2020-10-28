package test.single;

public class SingleBean {

    // 1. 私有静态变量 ， volatile 修饰防止指令重排
    private static volatile   SingleBean singleBean= null;
    // 2. 私有构造方法
    private SingleBean(){

    }
    // 3. 双重检查锁 ： （1）第一个判断为正常判断是否为NULL，否则无需初始化
    // (2) 第二个判断是否为NULL，是防止被另一个线程提前占用

    public static SingleBean getInstance(){
        if(singleBean == null ){
            synchronized (SingleBean.class){
                if(singleBean == null ){
                    singleBean = new SingleBean();
                }
            }
        }
        return singleBean ;
    }


}
