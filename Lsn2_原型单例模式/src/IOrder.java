/**
 * Created by selbylei on 17/3/23.
 * 订单接口
 * 为什么接口的方法需要定义这方法呢，刚好是order对象属性的get，set方法
 * 重名只是为了方便而已，可以使用不同的名字啊
 *
 */

public interface IOrder extends Prototype {

    int getCount();

    String getName();

    void updataOrder(String name,int number);

    void displayOrder(String name,int number);

}
