package com.example.kotlintutorial

class OuterClass {
    private var name:String="Mr x"
    class NestedClass{
        var description:String="code inside nested class"
        private var id:Int =101
        fun foo(){
           // print("name is ${name}")
            println("id is ${id}")
        }
    }
}