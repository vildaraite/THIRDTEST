package lt.code.academy.data;

import java.time.LocalDateTime;

public class Transfer {

    private String name;
    private String surname;
    private LocalDateTime transferTime;
    private double amount;


    public Transfer() {
    }

    public Transfer(String name, String surname, LocalDateTime transferTime, double amount) {
        this.name = name;
        this.surname = surname;
        this.transferTime = transferTime;
        this.amount = amount;
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

    public LocalDateTime getTransferTime() {
        return transferTime;
    }

    public void setTransferTime(LocalDateTime transferTime) {
        this.transferTime = transferTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", transferTime=" + transferTime +
                ", amount=" + amount +
                '}';
    }
}
