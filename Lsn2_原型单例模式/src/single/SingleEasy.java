package single;

/**
 * Created by selbylei on 17/4/5.
 * 恶汉模式,线程安全。
 * 无法做到随用随调
 */
public class SingleEasy {

    private static SingleEasy singleEasy = new SingleEasy();

}
