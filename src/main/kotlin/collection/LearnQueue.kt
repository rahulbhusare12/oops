package collection

import java.util.*
import kotlin.Comparator

fun main(){
    //queue

    var pq= PriorityQueue<Int>()
    pq.offer(5)
    pq.offer(42)
    pq.offer(25)
    pq.offer(2)
    pq.offer(8)

    println(pq.peek())
    pq.poll()
    println(pq.peek())


    var pq1= PriorityQueue<Int>(Comparator.reverseOrder())
    pq1.offer(5)
    pq1.offer(42)
    pq1.offer(25)
    pq1.offer(2)
    pq1.offer(8)

    /* println(pq1.peek())
     pq1.poll()
     println(pq1.peek())*/

    while (pq1.isNotEmpty()){
        println(pq1.poll())
    }

}