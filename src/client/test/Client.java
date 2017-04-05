package client.test;

import client.AndroidFactory;
import client.IFactory;

/**
 * Created by selbylei on 17/3/23.
 * 调用层产品的构建过程，分离产品的构建
 */
public class Client {

    public static void main(String[] args) {
        IFactory factory = new AndroidFactory();
        factory.create().show();
    }
}
