package com.example.kotlintutorial


open class Car(val name:String,val brand:String){
   open var range:Double=0.0
fun extendRange(amount:Double){
    if (amount>0)
        range+=amount
}
    open fun drive(distance:Double){
        println("drive for $distance KM")
    }
}
 class ElectricalCar(name: String,brand: String,batteryLife:Double):Car(name , brand  ){
override var range=batteryLife*6
     override fun drive(distance: Double) {
         println("Drive for $distance KM on electricity")
     }
     fun drive(){
         println("Drive for $range KM on electricity")
     }

}
fun main(){
    var audi=Car("A3","Audi")
    var tealsa=ElectricalCar("s-model","Tesla",85.0)
     tealsa.extendRange(200.0)
    audi.drive(200.0)
    tealsa.drive(200.0)
    tealsa.drive()

}