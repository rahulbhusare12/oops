package collection

import java.util.PriorityQueue
import java.util.Stack

fun main() {

    //Array
    var name = arrayOf("rahul", "vinod", "Varad")
    println(name[0])
    name.forEach {
        println(it)
    }

    //ArrayList

    var color = arrayListOf<String>("Red", "Black")

    println(color[0])

    color.forEach {
        println(it)
    }

    color.add("White")
    color.add("Green")
    //color[1]="Yellow"

    println("New list \n\n")
    color.forEach {
        println(it)
    }

    // color.add(2,"Pink")
    println("New list \n\n")
    color.forEach {
        println(it)
    }

    //remove
    color.removeAt(1)
    color.remove("Pink")
    println("New list after removing \n")
    color.forEach {
        println(it)
    }

    //iterator
    println("New list with iterator \n")
    var i = color.iterator()
    while (i.hasNext()) {
        println(i.next())

    }

    //map with for



    color.map { it.reversed() }.forEach{
        println(it)
    }

var num= listOf<Int>(1,2,4,6,7,44,3,2,3)
    println(num.min())
    println(num.max())
    println(num.sorted())
    println(num.reversed())
    println(num.distinct())











}