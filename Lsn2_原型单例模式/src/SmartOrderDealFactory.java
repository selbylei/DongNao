/**
 * Created by selbylei on 17/3/23.
 */
public class SmartOrderDealFactory {

    public void dealOrder(IOrder order) {

        int number = order.getCount();

        while (number > 0) {
            /**
             * 我们创建了一个接口，专门用来clone自身，我们让订单接口继承这个接口，这样我们再定义的订单
             * 都会需要实现这个接口，这个接口用来创建order对象本身，我们得到的这个对象就可以拿了做后面
             * 的逻辑处理，同时order对象是不会进行改变的
             */
            IOrder iOrder = (IOrder) order.clonePrototype(); //拷贝对象类型
            iOrder.updataOrder(iOrder.getName(), number > 1000 ? 1000 : number);
            order.displayOrder(iOrder.getName(), number > 1000 ? 1000 : number);
            number -= 1000;
        }
    }
}
