package ro.java.ctrln;

public class UserAccountUsage extends UserAccount {

    public static void main(String[] args) {

        UserAccount userAccount1 = new UserAccount("John", "John@icloud.com", "1234", "John1234");
        UserAccount userAccount2 = new UserAccount("Diana", "Diana@gmail.com", "5678", "Diana5678");
        UserAccount userAccount3 = new UserAccount("Melanie", "Melanie@yahoo.com", "9111", "Melanie9112");

        userAccount1.setEmail("John_Doe@icloud.com");
        System.out.println(userAccount1);

        userAccount2.setAccountAddress("Diana1234");
        System.out.println(userAccount2);

        userAccount3.setPassword("9000");
        userAccount3.setName("Melanie_D");
        System.out.println(userAccount3);

        for (Wishlist wishlist : Wishlist.values()) {
            System.out.println("Costul produsului din Wishlist: " + wishlist + " este: " + wishlist.price);
        }

        for (Products products : Products.values()) {
            System.out.println("Produsele disponibile sunt urmatoarele: " + products);
        }

        for (Products returnProducts : Products.values()) {
            System.out.println("Returnarea este posibila doar urmatoarelor produse: " + returnProducts);
        }
    }
}


