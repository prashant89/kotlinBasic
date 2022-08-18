package com.example.kotlintutorial

fun main(){
val iphone=MobilePhone("ios","Apple","iPhone12")
    val galaxyS20 =MobilePhone("android","sumsung","galxyS20")
    val mateXs=MobilePhone("Android","Huawai","Mate X S")
}
class MobilePhone(osName:String,brand: String,model:String){
    private var battery=30
    init {
        println("The phone $model from $brand uses $osName as its operating System")
    }
    fun chargeBattery(chargedBy:Int){
        println("Battery was at $battery and is at ${battery+chargedBy} now")
        battery+= chargedBy
    }
}