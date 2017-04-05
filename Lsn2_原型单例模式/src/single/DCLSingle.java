package single;

/**
 * Created by selbylei on 17/4/5.
 * DCL模式
 * 线程安全
 */
public class DCLSingle {

    private volatile static DCLSingle instance;

    private DCLSingle(){

    }

    public static DCLSingle getInstance(){
        if (instance==null){
            synchronized (DCLSingle.class){
                if (instance==null){
                    instance = new DCLSingle();
                }
            }
        }
        return instance;
    }
}
