package single;

/**
 * Created by selbylei on 17/4/5.
 * 内部类模式
 *
 */
public class InnerClassSingle {

    private InnerClassSingle() {

    }

    private static class SingleHodler {
        private static final InnerClassSingle instance = new InnerClassSingle();
    }

    public static InnerClassSingle getInstance() {
        return SingleHodler.instance;
    }
}
