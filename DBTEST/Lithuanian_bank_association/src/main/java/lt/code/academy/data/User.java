package lt.code.academy.data;

import org.bson.types.ObjectId;

import java.util.Set;

public class User {

    private ObjectId id;
    private String personalId;
    private String name;
    private String surname;
    //private String phone;
    private Set<Address> addresses;
    private Set<BankAccount> bankAccounts;

    public User() {
    }

    public User(ObjectId id, String personalId, String name, String surname, Set<Address> addresses, Set<BankAccount> bankAccounts) {
        this.id = id;
        this.personalId = personalId;
        this.name = name;
        this.surname = surname;
        this.addresses = addresses;
        this.bankAccounts = bankAccounts;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

    public Set<BankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(Set<BankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", personalId='" + personalId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", addresses=" + addresses +
                ", bankAccounts=" + bankAccounts +
                '}';
    }
}
