package com.example.kotlintutorial

fun main(){
   // val numbers:IntArray= intArrayOf(1,2,3,4,5,6)
   // val numbers= intArrayOf(1,2,3,4,5,6)
    val numbers= arrayOf(1,2,3,4,5,6)
    print("inital value ${numbers.contentToString()}")
    print(numbers[0])

    for (element in numbers){
        print(element+2)
    }
    numbers[0]=6
    numbers[1]=5
    numbers[4]=2
    numbers[5]=1
    print("\n change value ${numbers.contentToString()}")
    val Dnumber= doubleArrayOf(1.2,3.0,6.1,8.9,5.6)
    print("\n doubule number ${Dnumber.contentToString()}")
    val days= arrayOf("sun","Mon","Tue","wed","Thu","fri","sat")
    print("\n ${days.contentToString()}")
    val fruits= arrayOf(Fruit("apple",2.5), Fruit("banana",4.5))
print("\n ${fruits.contentToString()}")
    for (fruit in fruits){
        print("fruits ${fruit.name}")
    }
    for (index in fruits.indices){
print("\n fruits name ${fruits[index].name} is in index $index \n")
    }
    val mix = arrayOf("sun","mon",1,2,3,4,5,Fruit("grapes",8.2))
    print(mix.contentToString())
}
data class Fruit(val name:String,val price:Double)