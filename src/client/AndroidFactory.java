package client;

/**
 * Created by selbylei on 17/3/23.
 */

/**
 * 专门创建android产品
 */
public class AndroidFactory implements IFactory {

    @Override
    public IApi create() {
        return new AndroidApi();
    }
}
