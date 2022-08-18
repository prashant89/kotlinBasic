package com.example.kotlintutorial

fun main() {
    val fruits= setOf("Orange","Apple","Grape","Apple","Orange","Mango")
    print(fruits.size)
    print(fruits.toSortedSet())
    val newFruits=fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")

    print(newFruits.elementAt(4))
    //Map
    val daysofTheWeek= mapOf(1 to "manday",2 to "tuesday",3 to "wednesday")
    print(daysofTheWeek[2])
    for (key in daysofTheWeek.keys){
        print("\n $key is to ${daysofTheWeek[key]}")

    }
    val fruistMap= mapOf("favorite" to Fruist("grape",2.5), "ok" to Fruist("apple",1.0))
val newDaysofWeek=daysofTheWeek.toMutableMap()
    newDaysofWeek[4]="Thursday"
    newDaysofWeek[5]="Friday"
    print(newDaysofWeek.toSortedMap())
}
data class Fruist(val name:String,val price:Double)