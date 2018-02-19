fun main(args:Array<String>){
    diaryGenerator("西湖")
}


fun diaryGenerator(placeName:String){
    var diary = """
        地名是${placeName}${placeName.length}个字
        """
    println(diary)


}