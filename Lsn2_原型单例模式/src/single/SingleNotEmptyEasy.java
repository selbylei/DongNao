package single;

/**
 * Created by selbylei on 17/4/5.
 * 懒汉模式，线程安全。
 * 缺点:性能差，每次都需要使用synchronized同步
 *
 */
public class SingleNotEmptyEasy {

    private  static SingleNotEmptyEasy instance;

    public static synchronized SingleNotEmptyEasy getInstance(){
        if (instance==null){
            instance = new SingleNotEmptyEasy();
        }
        return instance;
    }
}
