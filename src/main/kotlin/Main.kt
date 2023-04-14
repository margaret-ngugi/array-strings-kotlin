import java.util.Arrays
fun main() {

    //Strings in kotlin are used for storing text
    //A strings contain a collection of characters which must be enclosed by double quotes.
    //Example

    var name = "Margaret"  //Margaret is a string

    //1. we can be able to access characters/elements of a string by referring their index
    var text ="Magdaline"
    println(text[2])
    println(text[4])
    println(text[3])

    // 2. String length
    var text1 = "bzvxnmlkkjhgdtafashg"
    println(text1.length)

    // 3. String case
    //We can be able to convert a string to uppercase,lowercase,capitalise,decapitalize

    var x = "Good morning"
    println(x.toUpperCase())
    println(x.toLowerCase())
    println(x.capitalize())
    println(x.decapitalize())

    //4.comparing strings
    var school1 = "Lariak"
    var school2 = "lariak"
    println(school1.compareTo(school2)) //output 0 (this is because they are equal)

    //another example

    var person1="Daniel"
    var person2="Faith"
    println(person1.compareTo(person2))

    //We can also use == operator or .equals() to compare strings

    var message = "Hello Mourine"
    var message2= "Hello Mourine"
    if(message == message2){
        println(true)
    }

    var greetings = "Hello Mary"
    var greeting2 = "Hello Bension"
    if(greetings.equals(greeting2)){
        println(true)
    }
    else{
        println(false)
    }
//4. Replacing strings// we use replace() methods
    val text3 = "Mary is from Kenya."+"She works in Kenya as a minister"
    println(text3.replace("Kenya","Tanzania"))


//5.string concatenation
    //using the plus () function
    var firstName = "Marion"
    var lastName = "Wambui"
    println(firstName.plus(lastName))
    //or
    //using the + operator//we use it to add the strings together to create a new strings

    val sentence = "My name is Jane"
    val sentece1 = "I love travelling"
    println(sentence + " " + sentece1)//note we add ("") to create space between the first string and the second string


//Arrays//Arrays are used to store multiple values in a single variable, instead of creating separate
// variables for each value.
//example

var animals = arrayOf("goat","sheep","cow","camel")

//Accesing elements in an array we use //indexing
    var cars = arrayOf("Toyota","Volvo","benze","mazda","ford")
    println(cars[3])
    println(cars[0])
    println(cars[4])

//Array length/size
    var car = arrayOf("Toyota","Volvo","benze","mazda","ford")
    println(cars.size)
    //or
    var names = "Martha"
    println(names.length)

//Checks if an element exist in an array
//we use the in operator

 var numArray = arrayOf(1,3,34,56,76,89)
    if (56 in numArray){
        println("It exists")
    }else{
        println("It does not exist")
    }

  //Loop through an array
    //1.using the for loop

    var nameArray = arrayOf("Maggie","Jane","Carol","Faith","John")
    for(x in nameArray){
        println(x)
    }
    //2.using forEach
    var namesArray = arrayOf("Maggie","Jane","Carol","Faith","John")
    namesArray.forEach { name ->
        println(name)
    }
//Sorting array

    var namArray= arrayOf( "Fiona", "Diana", "Ada", "Elsie","Beth",
        "Chris")
    var sortedNames = namArray.sortedArray()
    println(Arrays.toString(sortedNames))

//Arrays Quiz
    numbers()
    println(people("Judy","Mary","Faith"))
//Strings  Quiz
    println(peopleName("Mary",40))

    println(person("Anastaciah"))

}
//QUIZ ARRAYS
//1. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
//(ii) prints out the index of 158 (1 point)
//(iii) prints out the elements in ascending order (2 points)
fun numbers(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers[1].plus(numbers[4]))
    println(numbers.indexOf(158))
    println(numbers.sortedArray().contentToString())

}

//2. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun people(an1:String,an2:String,an3:String):String {
    var people= arrayOf(an1, an2, an3)
    return people.contentToString()
}

//QUIZ STRING
//. Write a function that takes in 2 parameters, name and age and returns a
//String with this structure “Hi, my name is x and I am y years old.” Where x and
//y are the provided name and age respectively.

fun peopleName(x:String,y:Int):String{
    var z = "Hi, my name is $x and I am $y years old"
    return z
}

//Write a function that takes in a String and returns its length
fun person(name:String):Int{
    return name.length

}
//What I understood is that:

//1.I learned how to concatenate strings,finding a string in a string,finding the length of a string and also string interpolation.
//2.Arrays store multiple values in a single valuable instead of creating separate variables for each value.
//3.we use arrayOf ()function to create an array and place the values inside it and separate them using commas
//4.I learned how to access elements of an array,finding its length,checking whether an element exists in an array and also looping through an array.
