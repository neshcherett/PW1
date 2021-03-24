package com.tneshcheret;

public class BankAccount {
    private final String name;
    private double count;
    private double commission;

    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    // 0.5% commission
    public void add(double money) {
        this.count += money * 0.995;
        this.commission += money * 0.005;
    }

    // 1% commission
    public void transfer(BankAccount otherPerson, double money) {
        if (count < money) {
            System.out.println("Сумма перевода больше остатка");
        }
        count = count - money;
        otherPerson.count = money * 0.99;
        this.commission += money * 0.01;
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        return count;
    }

    public double getCommission() {
        return commission;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
