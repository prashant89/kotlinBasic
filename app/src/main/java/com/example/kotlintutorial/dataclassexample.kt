package com.example.kotlintutorial

data class User(val id:Long,var name:String)
    fun main(){
        val user1=User(1,"denis")
        val name=user1.name
        println(name)
        user1.name="Michel"
        val user2=User(1,"Michel")
        println(user1.equals(user2))
        println("User Details: $user1")
        val updatedUser=user1.copy(name = "Denis Panjuta")
        println(user1)
        println(updatedUser)
        println(updatedUser.component1())//prints 1
        println(updatedUser.component2())//prints Denis Panjuta

    }
