fun main() {
    var androidDev=AndroidDeveloper("ahmed",24,3500.5)
    androidDev.android()
    var iosDev=IOSDeveloper("Ali",22, 6000.0)
    iosDev.iosapp()
    var webDev=WebDeveloper("Amal",27,5600.9)
    webDev.website()
}

open class Employee {
    var name:String=""
    protected var age:Int=22
    protected var salary:Double=0.0
}
class AndroidDeveloper:Employee{
    constructor(name:String,age:Int,salary:Double){
        this.name=name
        this.age=age
        this.salary=salary
    }
    fun android(){
    println("inside AndroidDeveloper class")
        println("Emp name=$name age=$age salary =$salary")
}
}

class WebDeveloper:Employee{
    constructor(name:String,age:Int,salary:Double){
        this.name=name
        this.age=age
        this.salary=salary
    }
    fun website(){
        println("inside WebDeveloper class")
        println("Emp name=$name age=$age salary =$salary")
    }
}
class IOSDeveloper:Employee{
    constructor(name:String,age:Int,salary:Double){
        this.name=name
        this.age=age
        this.salary=salary
    }
    fun iosapp(){
        println("inside IOSDeveloper class")
        println("Emp name=$name age=$age salary =$salary")
    }
}