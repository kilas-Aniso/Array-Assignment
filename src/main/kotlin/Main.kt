fun main() {

ladies("Nimo","Muna","Samira","Maryan")
city()
 numbers()
 println( names("Rebecca", "Cynthia", "Nyeliep"))
 }
/*1. Create a function that takes in 4 strings and creates an array out of them then
prints out the array*/
fun ladies(name1:String, name2:String,name3:String, name4:String){
 val women= arrayOf(name1,name1,name3,name4)
 println(women.contentToString())
}
/*2. Create a function that given an array below:
var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
prints out the names of the cities in the correct grammatical case.
*/
fun city(){
 var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
println(cities. map { it.capitalize() })
}
/*3. Create one function that given the below array:
var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
(i) prints out the sum of the second and fifth elements (1 point)
(ii) prints out the index of 158 (1 point)
(iii) prints out the elements in ascending order (2 points)
 */
fun numbers(){
 var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
 println(numbers[1] + numbers[4])
 println(numbers.indexOf(158))
 println(numbers.sortedArray().contentToString())
}
/*4. Create a function that takes in 3 names and returns a string array containing
all 3 names.*/
fun names(name1:String,name2:String,name3:String):Array<String>{
 var ident = arrayOf(name1, name2, name3)
 println(ident.contentToString())
 return ident

}
