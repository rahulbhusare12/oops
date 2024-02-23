import javax.naming.Context

fun main() {
    var a1 = Audi()
    a1.engine()
    a1.breaking()
    var s1 = Student()
    s1.present("Rahul")
    s1.absent("Vinod")
    s1.name("Rahul") //Extension function
    var c = 1
}

interface Car {
    fun engine()
    fun breaking()


}

class Audi : Car {
    override fun engine() {
        println("Engine Start")
    }

    override fun breaking() {
        println("breaking")
    }

}

abstract class Attendance {
    var day: Int? = null
    abstract fun present(name: String)
    abstract fun absent(name: String)
    fun leave() {

    }
}

class Student : Attendance() {
    override fun present(name: String) {
        println("$name is Present")
    }

    override fun absent(name: String) {
        println("$name is Absent")
    }

}
//Extension function
fun Student.name(name:String){
    println("hello $name")
}
