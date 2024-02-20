fun main(){
    var emp1=Emp1()
    emp1.name="Rahul"
    emp1.info()
    emp1.doWork()

}

open class Employee(){
    var name:String?=null
    var empID:String?=null
  open fun doWork(){
        println("$name starting working")
    }

}
class Emp1: Employee() {
    var designation:String="Developer"

    fun info(){
        println("name is $name and Designation is $designation")
    }
   override fun doWork(){
        println("$name starting working")
    }


}