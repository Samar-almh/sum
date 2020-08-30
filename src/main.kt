fun main(args: Array<String>)
{
    val add = Add(5, 7)
    println("The Sum of numbers 5 and 7 is: ${add.c}")
}
//primary constructor
class Add constructor(a: Int,b:Int)
{
    var c = a+b;
}