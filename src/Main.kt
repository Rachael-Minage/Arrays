fun main(){
    vehicles(arrayOf("subaru","audi","volvo,","mercedes"))
    cities()
    values()
    var randomNames = random(arrayOf("Chidi","Imani","Lulu"))
    println(randomNames)
}
fun vehicles(cars: Array<String>){
    println(cars.contentToString())
}
fun cities(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarte")
    cities.forEach{cities->
        println(cities.capitalize())
    }
}
fun values(){
    var numbers = arrayOf(32,14,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[2]+ numbers[4]
    println(sum)
    println(numbers.indexOf(158))
    var order = numbers.sortedArray()
    println(order.contentToString())

}
fun random( names: Array<String>): String{
    return names.contentToString()

}