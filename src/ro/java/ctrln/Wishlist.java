package ro.java.ctrln;

public enum Wishlist {
    WISH1(50),
    WISH2(100),
    WISH3(300);

    public int price;

    Wishlist(int price) {
        this.price = price;
    }
}
