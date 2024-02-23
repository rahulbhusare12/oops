package oops

import kotlin.properties.Delegates

fun main(){
val p= Person().apply {
    name="Rahul"
    age=32
}
    println("Name is ${p.name} and Age is ${p.age}")
    p.walk()
    p.eat()
    p.walk(100)
    //static property in java
   println("Count is ${Person.count}")

    //use of constructor
    var p2=Person("vinod",34)
    println("Name is ${p2.name} and Age is ${p2.age}")
    p2.walk()
    p2.eat()
    p2.walk(100)
    //static property in java
    println("Count is ${Person.count}")

}

class Person(){
    var name:String?=null
    var age :Int?=null

    //static in java
    companion object {
        var count:Int=0
    }

    fun walk(){
        println("$name is walking")
        count++
    }
    fun eat(){
        println("$name is eating")
        count++
    }
    //polymorphism
    fun walk(step:Int){
        println("$name walked $step Steps")
    }

    //Constructor

  constructor(name:String,age:Int) : this() {
      this.name=name
      this.age=age
  }
}