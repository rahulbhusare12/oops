package collection

fun main(){

    //avoid duplicates
 var st = hashSetOf<Int>(3,5,8,1,3)
    println(st)

    var student= HashSet<Student>()
    student.add(
        Student("Rahul",1)
    )
    student.add(
        Student("vinod",2)
    )

    student.add(
        Student("Rahul",1)
    )

    student.add(
        Student("viraj",1)
    )

    student.add(
        Student("Rahul",11)
    )
    student.add(
        Student("Vilas",5)
    )
    student.add(
        Student("Akash",15)
    )

    println(student)
    println(student.sorted())
}

data class Student(
    val name:String,
    val roll:Int
):Comparable<Student>{
    override fun compareTo(other: Student): Int {
        return this.name.compareTo(other.name)
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (roll != other.roll) return false

        return true
    }

    override fun hashCode(): Int {
        return roll
    }

}