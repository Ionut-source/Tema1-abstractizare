package ro.java.ctrln;

import java.util.Objects;

public class OrdersHistory extends UserAccount {

    private String firstOrder;
    private String secondOrder;
    private String thierdOrder;

    OrdersHistory ordersHistory = new OrdersHistory(firstOrder, secondOrder, thierdOrder);

    public OrdersHistory(String firstOrder, String secondOrder, String thierdOrder) {
        this.firstOrder = firstOrder;
        this.secondOrder = secondOrder;
        this.thierdOrder = thierdOrder;
    }

    public String getFirstOrder() {
        return firstOrder;
    }

    public void setFirstOrder(String firstOrder) {
        this.firstOrder = firstOrder;
    }

    public OrdersHistory getOrdersHistory() {
        return ordersHistory;
    }

    public void setOrdersHistory(OrdersHistory ordersHistory) {
        this.ordersHistory = ordersHistory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        OrdersHistory that = (OrdersHistory) o;
        return ordersHistory.equals(that.ordersHistory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ordersHistory);
    }

    @Override
    public String toString() {
        return "OrdersHistory{" +
                "ordersHistory=" + ordersHistory +
                '}';
    }
}
