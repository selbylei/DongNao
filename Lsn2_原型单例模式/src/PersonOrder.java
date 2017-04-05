/**
 * Created by selbylei on 17/3/23.
 * 我的订单
 */
public class PersonOrder implements IOrder {
    private String orderName;
    private int orderNumber;


    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }


    @Override
    public Prototype clonePrototype() {
        PersonOrder personOrder = new PersonOrder();
        personOrder.setOrderNumber(orderNumber);
        personOrder.setOrderName(orderName);
        return personOrder;
    }

    @Override
    public void updataOrder(String name, int number) {
        this.orderName = name;
        this.orderNumber = number;
    }

    @Override
    public void displayOrder(String name,int number) {
        System.out.println("当前订单：name"+orderName+" number:"+number);
    }

    @Override
    public int getCount() {
        return orderNumber;
    }

    @Override
    public String getName() {
        return orderName;
    }
}
