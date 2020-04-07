package src;

/**
 * 推荐使用
 *
 * 饿汉模式
 * 类加载到内存后，就实例化一个单利，JVM保证线程安全
 * 缺点：无论用不用，都会被加载到内存中
 */
public class Singleton01 {

    /**
     * 1.构造方法私有化
     */
    private Singleton01 () {}

    /**
     * 2.初始化对象到内存中
     */
    private static final Singleton01 INSTANCE = new Singleton01();

    /**
     * 3.对外提供一个获取对象的方法
     */
    public static Singleton01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Singleton01 s1 = Singleton01.getInstance();
        Singleton01 s2 = Singleton01.getInstance();
        System.out.println(s1 == s2);
    }
}
