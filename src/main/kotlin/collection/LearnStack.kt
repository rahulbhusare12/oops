package collection

import java.util.*

fun main(){
    //stack

    var st= Stack<String>()
    st.push("rahul")
    st.push("varad")
    st.push("vinod")
    st.push("akash")
    println(st)
    println(st.pop())
    println(st.peek())


    var str="rahul"
    var index=str.lastIndex
    while (index>=0){
        println(str[index])
        index--
    }
    println(str.reversed())
}