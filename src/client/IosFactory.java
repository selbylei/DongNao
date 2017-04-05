package client;

/**
 * Created by selbylei on 17/3/23.
 */
public class IosFactory implements IFactory {
    @Override
    public IApi create() {
        return new IosApi();
    }
}
