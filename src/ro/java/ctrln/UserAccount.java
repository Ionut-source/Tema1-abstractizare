package ro.java.ctrln;

import java.util.Objects;

public class UserAccount {

    public UserAccount() {
    }

    private String name;
    private String email;
    private String password;
    private String accountAddress;

    public UserAccount(String name, String email, String password, String accountAddress) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.accountAddress = accountAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(String accountAddress) {
        this.accountAddress = accountAddress;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount userAccount = (UserAccount) o;
        return Objects.equals(name, userAccount.name) && Objects.equals(email, userAccount.email) && Objects.equals(password, userAccount.password) && Objects.equals(accountAddress, userAccount.accountAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, password, accountAddress);
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", accountAddress='" + accountAddress + '\'' +
                '}';
    }
}



