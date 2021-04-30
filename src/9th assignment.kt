import java.io.CharArrayReader
import javax.management.MBeanRegistration

fun main() {
println(countryNames(listOf("Mumbai","Senegal","Algeria","Nigeria","Zimbabwe","Mozambique","Djibouti","Ethopia","Togo","qatar")))
addPeopletoPerson()
    peoplesHeightInMetres(listOf(1.5,1.3,0.5))


    var person = mutableListOf(
        Person("Mary", 20, 1.2, 60.5),
        Person("Happy", 11, 1.1, 49.3),
        Person("Okola", 46, 2.0, 60.5)
    )
    var sortedperson = person.sortedByDescending { person -> person.age }
    println(sortedperson)


}
fun countryNames(name:List<String>):List<String>{
    var countries = mutableListOf<String>()
    for (x in name) {
        if (name.indexOf(x) % 2 == 0) {
            countries.add(x)
        }
    }
    return countries
}
fun peoplesHeightInMetres(height:List<Double>):Pair<Double,Double>{
    var sum=height.sum()
    var average=height.average()
    return Pair(sum,average)

}
data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
    fun addPeopletoPerson() {
            var person = mutableListOf(
                Person("Mary", 20, 1.2, 60.5),
                Person("Happy", 11, 1.1, 49.3),
                Person("Okola", 46, 2.0, 60.5)
            )

            person.addAll(listOf<Person>(Person("Nancy",44,1.1,59.5),
                Person("jason",22,1.3,35.20,)))
            println(person)

            person.addAll(listOf<Person>(Person("Nancy",44,1.1,59.5),
        Person("jason",22,1.3,35.20,)))
    println(person)

}


data class Car(var registration:String,var mileage:Int)
fun carDetails(mileage:List<Double>):Double{
    var mileageAverage=mileage.average().toDouble()
            return mileageAverage


}
