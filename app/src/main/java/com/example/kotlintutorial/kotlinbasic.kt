package com.example.kotlintutorial


import kotlin.IllegalArgumentException

fun main(){
var mycar=car()
    mycar.myBrand
    println("brand is : ${mycar.myBrand}")
    mycar.maxSpeed=240
    println("MaxSpeed is ${mycar.maxSpeed}")

    println("My car model ${mycar.myModel}")
}
class car(){
    lateinit var owner:String
    val myBrand:String="BMW"
    get() {
        return field.toLowerCase()
    }
    var maxSpeed:Int =250
    //get() = field
   set(value){
       field = if (value >0) value else throw IllegalArgumentException("max speed cannot be zero")
   }
 var myModel : String = "M5"
    private set
    init {
        this.owner="frank"
        this.myModel="M3"
    }
}