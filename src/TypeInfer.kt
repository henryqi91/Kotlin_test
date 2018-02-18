fun main(args: Array<String>){
//    println(sayHello("James "))
//    println(checkAge(15))
    checkFace(90)
}

fun checkFace(score:Int){
    if(score > 80)
        println("holy...")
    else
        println("suck...")

}

fun diary(placeName:String):String{
    var text = """
        有个叫${placeName}的地方好漂亮！
        """
    return text
}
fun sayHello(name:String):String{
    return ("Hello "+name + 15)
}

fun checkAge(age:Int):Boolean{
    return false
}