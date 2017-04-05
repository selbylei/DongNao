/**
 * Created by selbylei on 17/3/23.
 * 处理订单
 * 代码中，设置了对personOrder订单的处理；
 * 如果此时，来了另外的订单，这个factor就显得笨拙了，需要修改处理逻辑来完成
 *
 */
public class OrderDealFactory {

    public void dealOrder(IOrder order){
        int number = order.getCount();
        while (number>0){
            System.out.println("原始订单:"+order.hashCode());


            /**
             *  这边的代码就比较关键了，如果我们没有使用原型模式，我们只能对每种订单一一做处理了
             *  我们没办法使用在这边处理一个类型的order把所有的order都处理了，因为我们的order
             *  共性是实现了iOder接口，但是接口我们无法实例化一个操作的类，我们只能new一个新的
             *  具体的order实例一一处理，看看smartOderDealFactory是如何解决处理的哦
             *
             */
            PersonOrder personOrder = (PersonOrder) order;
            PersonOrder newOrder = new PersonOrder();
            newOrder.setOrderName(personOrder.getOrderName());
            newOrder.setOrderNumber(number>1000?1000:personOrder.getOrderNumber());

            System.out.println("newOrder  name:"+ newOrder.getOrderName()+" number:"+newOrder.getOrderNumber());
            number-=1000;

            /**
             * 下面的代码虽然实现了订单的分配，但是同时改变了初始订单，我们进行操作之后，无法获取原来的订单是什么了
             */
//            order.setOrderNumber(number>1000?1000:number);
//            number-=1000;
        }
    }
}
