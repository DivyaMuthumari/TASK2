package com.task2;

public class Account {
    double balance;
    double depositAmount;
    double withdrawAmount;

    Account(){
//default constructor
    }
   public Account(double d,double w){//parameterized constructor
        depositAmount=d;
        withdrawAmount=w;

    }
    void deposit(double d){
        this.depositAmount=d;
        System.out.println("Deposited amount:RS "+d);
        }
    void withdraw(double w){
        this.withdrawAmount=w;
        System.out.println("Deposited amount: RS "+w);

        }
    void Balance(){
        balance=this.depositAmount-this.withdrawAmount;
        System.out.println("Balance is: RS "+balance);
    }

    public static void main(String[] args){
        Account account1=new Account();
        account1.deposit(10000);
        account1.withdraw(500);
        account1.Balance();


    }


}
