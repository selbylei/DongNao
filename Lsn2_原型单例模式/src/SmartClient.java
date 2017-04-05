/**
 * Created by selbylei on 17/3/24.
 */
public class SmartClient {

    public static void main(String[] args) {

        SmartOrderDealFactory smartOrderDealFactory = new SmartOrderDealFactory();
        PersonOrder personOrder = new PersonOrder();
        personOrder.setOrderName("个人任务");
        personOrder.setOrderNumber(9999);
        smartOrderDealFactory.dealOrder(personOrder);
        System.out.println("原始订单: name:"+personOrder.getOrderName()+"  number:"+personOrder.getOrderNumber());
    }
}
