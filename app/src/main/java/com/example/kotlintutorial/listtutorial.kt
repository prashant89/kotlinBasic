package com.example.kotlintutorial

fun main(){
   val months= listOf("January","february","march")
    val anytypes= listOf(1,2,3,true,false,"string")
    print(anytypes.size)
    print(months[1])
    for (month in months){
        print(month)
    }
    val addionalMonths=months.toMutableList()
    val newMonths= arrayOf("April","may","june")
    addionalMonths.addAll(newMonths)
    addionalMonths.add("July")
    print(addionalMonths)
   val days= mutableListOf<String>("Mon","Tue","Wed")
   days.add("thu")
    days[2]="Sunday"
   // days.removeAt(1)
    val removeList= mutableListOf<String>("Mon","Wed")
   // days.removeAll(removeList)
    days.removeAll(days)
   print(days)

}