package bank;


import java.util.HashMap;
import java.util.Map;


class Bank {
   private Map<String, Double> accounts;

   public Bank() {
       accounts = new HashMap<>();
   }

   public void createAccount(String accountNumber, double initialBalance) {
       accounts.put(accountNumber, initialBalance);
       System.out.println("Account created successfully.");
   }

   public void deposit(String accountNumber, double amount) {
       if (accounts.containsKey(accountNumber)) {
           double balance = accounts.get(accountNumber);
           balance += amount;
           accounts.put(accountNumber, balance);
           System.out.println("Deposit successful. New balance: " + balance);
       } else {
           System.out.println("Account not found.");
       }
   }

   public void withdraw(String accountNumber, double amount) {
       if (accounts.containsKey(accountNumber)) {
           double balance = accounts.get(accountNumber);
           if (balance >= amount) {
               balance -= amount;
               accounts.put(accountNumber, balance);
               System.out.println("Withdrawal successful. New balance: " + balance);
           } else {
               System.out.println("Insufficient funds.");
           }
       } else {
           System.out.println("Account not found.");
       }
   }

   public void checkBalance(String accountNumber) {
       if (accounts.containsKey(accountNumber)) {
           double balance = accounts.get(accountNumber);
           System.out.println("Current balance: " + balance);
       } else {
           System.out.println("Account not found.");
       }
   }
}
