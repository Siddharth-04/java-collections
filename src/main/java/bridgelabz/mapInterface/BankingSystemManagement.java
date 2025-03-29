package bridgelabz.mapInterface;

import java.util.*;

class BankingSystem {
    Map<String, Double> accounts = new HashMap<>();
    TreeMap<Double, String> sortedAccounts = new TreeMap<>();
    Queue<String> withdrawalQueue = new LinkedList<>();

    void createAccount(String accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            double newBalance = accounts.get(accountNumber) + amount;
            accounts.put(accountNumber, newBalance);
            sortedAccounts.put(newBalance, accountNumber);
        }
    }

    void requestWithdrawal(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawalQueue.add(accountNumber);
        }
    }

    void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            String accountNumber = withdrawalQueue.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance: " + sortedAccounts);
    }
}

class BankingSystemManagement {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount("A123", 5000);
        bank.createAccount("B456", 3000);
        bank.createAccount("C789", 7000);

        bank.deposit("A123", 1000);
        bank.requestWithdrawal("B456");
        bank.processWithdrawals();

        bank.displaySortedAccounts();
    }
}
//Processing withdrawal for account: B456
//Accounts sorted by balance: {3000.0=B456, 5000.0=A123, 6000.0=A123, 7000.0=C789}