
fun main(args:Array<String>){
//    var res = add(3,5)
//    println(res)
//
//    //the following i the name of the function in the bracket
//    var i = {x:Int, y:Int -> x+y}
//    println(i(3,2))
//    println(长方形面积(10,20))
    println(圆柱体体积(3.14f,4f,10f)) // f-> type float

}

fun add(a:Int, b:Int):Int = a+b

fun 长方形面积(长:Int, 宽:Int):Int{
    return 长 * 宽
}

fun 圆柱体体积(Pi:Float, 半径:Float, 高:Float):Float{
    return Pi * 半径 * 半径 * 高
}