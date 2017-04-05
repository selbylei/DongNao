/**
 * Created by selbylei on 17/3/23.
 */
public class Client {

    public static void main(String[] args) {
        //创建一个订单工厂
        OrderDealFactory dealFactory = new OrderDealFactory();
        //创建一个订单
        PersonOrder personOrder = new PersonOrder();
        personOrder.setOrderName("女朋友");
        personOrder.setOrderNumber(3200);
        dealFactory.dealOrder(personOrder);
        System.out.println(personOrder.getOrderNumber());


    }
}
