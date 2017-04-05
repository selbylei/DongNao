/**
 * Created by selbylei on 17/3/23.
 */
public class Factory {

    public static Api create(int type) {
        switch (type) {
            case 1:
                return new ImplA();

            case 2:
                return new ImplB();
            case 3:
                return new ImplC();
            case 4:
                return new ImplD();

            default:
                return new ImplA();
        }
    }

    //反射
    public  < T extends Api> T createProduct(Class<T> clz){

        Api api = null;
        try {
            api= (Api) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T)api;
    }


}
