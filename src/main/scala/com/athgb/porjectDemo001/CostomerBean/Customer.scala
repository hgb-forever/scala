package com.athgb.porjectDemo001.CostomerBean

class Customer extends Serializable{
  val id: Int = Customer.id
  var age: Int = _
  var name: String = _
  var gender: Char = _
  var phone: String = _
  var email: String= _

  def update(age: Int, name: String, gender: Char, phone: String, email: String): Unit ={
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }
  def this( age: Int, name: String, gender: Char, phone: String, email: String) {
    this
    this.age = age
    this.name = name
    this.gender = gender
    this.phone = phone
    this.email = email
  }

  override def toString: String = {
    this.id + "\t\t" + this.name + "\t\t" + this.gender + "\t\t" + this.age + "\t\t" + this.phone + "\t\t" + this.email+"\n"
  }

}
object Customer{
  private var id = 0
  def apply( age: Int, name: String, gender: Char, phone: String, email: String): Customer = {
    this.id += 1
    new Customer( age: Int, name: String, gender: Char, phone: String, email: String)
  }

}
