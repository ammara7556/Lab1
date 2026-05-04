/**
 * This class keeps track of a bank account balance, deposits,
 * withdrawals, and monthly interest.
 * 
 * @author Ammara Agsalud
 * @version v1.0
 * @since 2026
 */

public class BankAccount {

    private double balance;
    private double deposit;
    private double withdraw;
    private double interest;
    private double monthlyIntRate;

    /**
     * Creates a bank account with default values.
     */
    public BankAccount() {
        monthlyIntRate = 0.044 / 12;
        balance = 0.0;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
    }

    /**
     * Creates a bank account using a whole dollar starting balance.
     * @param inBalance starting balance
     * @param intRate annual interest rate
     */
    public BankAccount(int inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
    }

    /**
     * Creates a bank account using a currency starting balance.
     * @param inBalance starting balance
     * @param intRate annual interest rate
     */
    public BankAccount(double inBalance, double intRate) {
        balance = inBalance;
        monthlyIntRate = (intRate / 100) / 12;
        deposit = 0.0;
        withdraw = 0.0;
        interest = 0.0;
    }

    /**
     * Adds a deposit to the account.
     * @param add deposit amount
     */
    public void makeDeposit(double add) {
        balance += add;
        deposit += add;
    }

    /**
     * Adds a whole dollar deposit to the account.
     * @param add deposit amount
     */
    public void makeDeposit(int add) {
        balance += add;
        deposit += add;
    }

    /**
     * Subtracts a withdrawal from the account.
     * @param sub withdrawal amount
     */
    public void makeWithdraw(double sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Subtracts a whole dollar withdrawal from the account.
     * @param sub withdrawal amount
     */
    public void makeWithdraw(int sub) {
        balance -= sub;
        withdraw += sub;
    }

    /**
     * Calculates and adds monthly interest if the balance is positive.
     */
    public void calcInterest() {
        if (balance > 0) {
            double monthInterest = balance * monthlyIntRate;
            balance += monthInterest;
            interest += monthInterest;
        }
    }

    /**
     * Gets the current balance.
     * @return account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Gets the total deposits.
     * @return total deposited
     */
    public double getDeposit() {
        return deposit;
    }

    /**
     * Gets the total withdrawals.
     * @return total withdrawn
     */
    public double getWithdraw() {
        return withdraw;
    }

    /**
     * Gets the total interest.
     * @return total interest earned
     */
    public double getInterest() {
        return interest;
    }
}