public class Singleton {
    public static void main(String[] args) {
        // 获取 EagerSingleton 实例
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("EagerSingleton1: " + eagerSingleton1.hashCode());
        System.out.println("EagerSingleton2: " + eagerSingleton2.hashCode());

        // 获取 LazySingleton 实例
        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println("LazySingleton1: " + lazySingleton1.hashCode());
        System.out.println("LazySingleton2: " + lazySingleton2.hashCode());
    }
}

// 饿汉式单例模式
class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();         //类加载时就创造

    private EagerSingleton() {}  //构造器私有化

    public static EagerSingleton getInstance() {//向外暴露静态的公共方法
        return instance;
    }
}

// 懒汉式单例模式
class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {}////构造器私有化

    public static  LazySingleton getInstance() {////向外暴露静态的公共方法,只有使用时 才会返回instance，再次使用返回上一次的值
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
