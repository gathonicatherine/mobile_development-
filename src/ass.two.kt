fun main() {
name()
    var result=modulus(5,2)
    println (result)

    var sum=add(3,7,9,10)
    println (sum)

    me()
}
fun name(){
    var name=("cate")
    println("Hello${name}")
}
fun modulus(num1:Int,num2:Int):Int {
var modulus=num1%num2
    return modulus
}
fun add(numA:Int,numB:Int,numC:Int,numD:Int):Int {
var add=numA+numB+numC+numD
    return add
}
fun me() {
var me="I love sleeping"
    var result=me
    println(me)
}