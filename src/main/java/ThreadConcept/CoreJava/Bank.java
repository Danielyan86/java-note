package ThreadConcept.CoreJava;

import java.util.Arrays;

public class Bank {
    private final double[] accounts;

    //初始化一个数组，每个元素为一个账户余额
    public Bank(int n, double initialBalance) {
        accounts = new double[n];
        Arrays.fill(accounts, initialBalance);
        System.out.println(Arrays.toString(accounts));
    }

    //从一个账户向另外一个账户转账
    public void transfer(int from, int to, double amount) {
        if (accounts[from] < amount) return;
        System.out.print(Thread.currentThread());
        accounts[from] -= amount;
        System.out.printf("%10.2f from %d to %d ", amount, from, to);
        accounts[to] += amount;
        System.out.println(Arrays.toString(accounts));
        System.out.printf("Total balance: %10.2f%n", getTotalBalance());
    }

    //获取所有账户总金额，总金额不会变
    public double getTotalBalance() {
        double sum = 0;
        for (double a : accounts)
            sum += a;
        return sum;
    }

    public int size() {
        return accounts.length;
    }

}
