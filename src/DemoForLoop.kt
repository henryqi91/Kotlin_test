
fun main(args: Array<String>){
    var nums = 1 .. 100         //NEW format, nums is the variable for Int Array: [1,100]
    var nums2 = 1 until 100     // [1,100)

//    var nums2 = nums2.reversed() // reverse the order of nums2
//    var count = nums.count()    // count the number of elements

    var res = 0
    for (num in nums2 step 2){ // every other step.
        res += num
    }
    for (num in nums){
        res += num
    }

    println(res)
}