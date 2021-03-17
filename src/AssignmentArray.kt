import java.util.*
fun main(){
    Str("Chantal","Emma","Peter","Jeanne")
    Arr()
    Num()
    names("Python","Kotlin","Computer")

}
fun Str(m1:String,m2:String,m3:String,m4:String):String{
    var X=arrayOf("Chantal","Emma","Peter","Jeanne")
    println(Arrays.toString(X))
    return (Arrays.toString(X))

}
fun Arr(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities=cities.sortedArray()
    println(cities[0].capitalize()+ " " + cities[1].capitalize()+ " "+ cities[2].capitalize()+ " "+ cities[3].capitalize())

}
fun Num(){
    var numbers=arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var x=numbers[1]
    var y=numbers[4]
    var sum=x+y
    println(sum)
    var z=numbers.indexOf(158)
    println(z)
    numbers=numbers.sortedArray()
    numbers.forEach{num-> println(num)}
}
fun names(n1:String,n2:String,n3:String):String{
    var p=arrayOf("Python","Kotlin","Computer")
    println(Arrays.toString(p))
    return Arrays.toString(p)
}