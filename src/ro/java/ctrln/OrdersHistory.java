package ro.java.ctrln;

import java.util.Objects;

public class OrdersHistory extends UserAccount {

    private String firstOrder;
    private String secondOrder;
    private String thierdOrder;

    OrdersHistory ordersHistory = new OrdersHistory(firstOrder, secondOrder, thierdOrder);

    public OrdersHistory(String firstOrder, String secondOrder, String thierdOrder) {
    }
}