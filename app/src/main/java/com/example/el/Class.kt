package com.example.el

class Motor()

class Contact(val id: Int, var email: String)

fun main(){
    val contact = Contact(1, "mary@gmail.com")

    println(contact.email)

    //update the value of the property: email
    contact.email = "jane@gmail.com"

    // print the value
    println(contact.email)
}