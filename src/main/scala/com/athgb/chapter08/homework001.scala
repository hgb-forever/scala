package com.athgb.chapter08

import java.util
import java.util.Date


object homework001 extends App{
  println(args.reverse.mkString(" "))
  private val account = new CheckingAccount(200)
  println(account.deposit(100))
  println(account.withdraw(100))

}
class BankAccount(initialBalance:Double){
  private var balance = initialBalance
  def deposit(amount:Double) = { balance += amount; balance}
  def withdraw(amount:Double) = {balance -= amount; balance}
}
class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance){
  private var balance = initialBalance
  override def deposit(amount: Double) = super.deposit(amount-1)

  override def withdraw(amount: Double)= super.withdraw(amount-1)
}
class SavingsAccount(SavingsAccount:Double) extends BankAccount(SavingsAccount){
  private var balance = SavingsAccount
  var num = 3

  def deposit() = {
    if(num<=0) {
      this.balance = super.deposit(this.balance) - 1
      this.num -= 1
    }
    else
    this.balance = super.deposit(this.balance)

  }
  def earnMonthlyInterest() ={
     this.balance*0.01
  }
}