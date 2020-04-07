package src.main.singleton;
/**
 * 饿汉模式 二 跟01一样，只是写法上有区别
 *
 * 类加载到内存后，就实例化一个单利，JVM保证线程安全
 * 缺点：无论用不用，都会被加载到内存中
 */
public class Singleton02 {

    /**
     * 将实例放入静态常量池
     */
    private static  final Singleton02 INSTANCE;

    /**
     * 1.构造方法私有化
     */
    private Singleton02() {}

    /**
     * 2.初始化实例
     */
    static  {
        INSTANCE = new Singleton02();
    }

    /**
     * 3.对方暴露出获取实例的方法
     */
    public static Singleton02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton02 s1 = Singleton02.getInstance();
        Singleton02 s2 = Singleton02.getInstance();
        System.out.println(s1 == s2);
    }
}
