import java.util.*;
public class BankAccount
{
    String name;
    int id;
    float money;
    float arrears;
    String[] transactions = {};
    public BankAccount(String get_name, int get_id, float get_money, float get_arrears)
    {
        name = get_name;
        id = get_id;
        money = get_money;
        arrears = get_arrears;
    }
    
    void Buy (float price) {
        if (money >= price) {
            money = money - price;
            transactions = Arrays.copyOf(transactions, transactions.length + 1);
            transactions[transactions.length - 1] = "Transaction: -" + price + " Balance: " + money + "Arrears: " + arrears;
        } else {
            arrears = arrears + price;
            transactions = Arrays.copyOf(transactions, transactions.length + 1);
            transactions[transactions.length - 1] = "Transaction: arrears +" + price + " Balance: " + money + "Arrears: " + arrears;
        }
    }
    
    void ShowHistory() {
        for (String record : transactions) {
            System.out.println(record);
        }
    }
    
    void AddBalance(float amount) {
        arrears = arrears - amount;
        if (arrears <= 0) {
            money = money - arrears;
            arrears = 0;
        }
        transactions = Arrays.copyOf(transactions, transactions.length + 1);
        transactions[transactions.length - 1] = "Balance refilled: +" + amount;
    }
}