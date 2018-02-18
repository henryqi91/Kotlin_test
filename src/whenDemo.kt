
fun main(args:Array<String>){
    gradeStudnet(9)
}

fun gradeStudnet(score:Int){
    when(score){
        10 -> println("!!!")
        9 -> println("more effort required.")
        else -> println("ASIAN FAIL")
    }
}