package lt.code.academy.data;

public class BankAccount {

    private Object id;
    private String bankName;
    private String bankAccountNumber;
    private double balance;
    private Transfer transfer;

    public BankAccount() {
    }

    public BankAccount(Object id, String bankName, String bankAccountNumber, double balance, Transfer transfer) {
        this.id = id;
        this.bankName = bankName;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = balance;
        this.transfer = transfer;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", bankName='" + bankName + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", balance=" + balance +
                ", transfer=" + transfer +
                '}';
    }
}
