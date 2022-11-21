/*
1. Understand the difference, also in the context of memory footprint and range, between
	different numeric types in Scala. What are the limitations of each and when does it make
	sense to use one over the other?
	2. Research what functions are available in the integer data type, i.e. addition, subtraction,
	multiplication, and division. Use them in Scala REPL.
	3. Research which operators on numeric types have precedence, i.e., in an expression, which
	operation will be executed before the other. Understand these basic concepts on your own.
	
	
	
	  scala>

	  C'est ce qu'on appelle un REPL (Read-Eval-Print-Loop), c'est une interface de programmation interactive.
	  Vous pouvez y exécuter des commandes.
	  Allons-y 
*/



	//	Data Type & Description
	
println("Byte 8 bit signed value. Range from -128 to 127")
println("Short 16 bit signed value. Range -32768 to 32767")
println("Int 32 bit signed value. Range -2147483648 to 2147483647")
println("Long 64 bit signed value. -9223372036854775808 to 9223372036854775807")
println("Float 32 bit IEEE 754 single-precision float")
println("Double 64 bit IEEE 754 double-precision float")

	//	Available functions in the integer data type,

var x: Int = 80
var y = 20

println(x + y)
println(x * y)
println(x - y)
println(x / y)
/*

	Operators Precedence in Scala
	Category	Operator	Associativity
	Postfix	() []		Left to right
	Unary 		! ~ 		Right to left
	Multiplicative	* / % 		Left to right
	Additive 	+ - 		Left to right
	Shift 		>> >>> << 	Left to right
	Relational	> >= < <= 	Left to right
	Equality 	== != 		Left to right
	AND 		& 		Left to right
	XOR 		^ 		Left to right
	OR 		| 		Left to right
	Logical AND 	&& 		Left to right
	Logical OR 	|| 		Left to right
	Assignment 	= += -= *= /=	Right to left
	 		%= >>= <<= &= 
	 		^= |= 
	Comma		,
*/



/*
	4. Research the different types of logical operators available in Scala. Try to use them in Scala
	REPL.
	5. Try assigning a Boolean variable to an Integer variable. What do you get? Research whether
	you can do this in other languages.
	6. Try adding two Boolean values. What do you get?
*/

		// 	Logical Operators
		
var A = true
var B = false

(A && B) //Logical AND 
(A || B) //Logical OR
!(A && B) // Logical NOT

var y = 20
y = true
println("We get error")

/*
	7. Create a string variable and then type . (the dot character) and press Tab. You will see a list
	of functions. Many of them are covered in this book; however, explore them and learn what
	they do. The more you know about them, the better.
	8. Try converting numeric types and Boolean types to String types. Did you have any issue in
	doing so? You shouldn’t.
*/

var myString = "Formation big data"
myString.capitalize
myString.reverse
myString.length
myString.split(" ")

var myVariableNum = 123
myVariableNum.toOctalString
myVariableNum.toChar

var B = true



/*
	9. Try converting a Double (e.g., 10.5) to Int. What happens? It will drop the portion of
	number after the decimal. Beware of such nuances.
	10. Try running "10".toInt. Does it work? It should. Try to convert "two".toInt. Does it work? It
	shouldn’t. You can’t type cast all the time.
	11. Research how you generally work with nulls in Scala. You will find specific types, such as
	Option and its concrete subtypes (Some, None). Research them and make sure you
	understand their use.
*/

	//	The String Type
	
	
object StringTypes {
	val num1 = 75
	val num2 = 100.25
	val str1: String = "Hello World"
	val str2: String = " Max"
	
	def main(agrs:Array[String]) {
		println(str1.length())
		println(str1.concat(str2))
		println(str1 + str2)
		
		val result = printf("(%d -- %f -- %s)", num1, num2, str1)
		println(result)
		println("(%d -- %f -- %s)".format(num1, num2, str1))
		printf("(%d -- %f -- %s)", num1, num2, str1)
	}

}
StringTypes.main(Array(" "))

val query = "Select * from table where id = 1"

val greeting = "my name is \"Irfan Elahi \" and I am from Pakistan"

greeting(0)

val funkyString = """ this is a
multi-line string and in this string,
there can be
"quotes" as well with
no problems"""

val a="1"
val b="2"
	
val a="1"
val b="2"
a+b //Concatenation

//String Interpolation
val name="irfan"
val introduction = "my name is $name"
val introduction = s"my name is $name"
val introduction = "my name is ${name}"
val introduction = s"my name is $name.toUpperCase"
val introduction = "my name is ${name.toUpperCase}"

val sharePrice = 100.4
s"the share price is $sharePrice"
s"the share price is $sharePrice%.2f"
f"the share price is $sharePrice%.2f"

val aString="Irfan \n Elahi"
val aString=raw"Irfan \n Elahi"

//Length of String
val customerPackage = "prepaid"
customerPackage.length
customerPackage.size
customerPackage(100)

//Splitting Strings
val aRow = "1,mark zuckerberg,facebook"
aRow.split(",")
aRow.split(",")(0)
aRow.split(",")(1)
aRow.split(",")(2)

//Extracting Parts of a String
val x = "apache spark"
x.substring(0)
x.substring(1)
x.substring(1,4)

//Finding the Index of Characters in a String
val x = "apache spark"
x.indexOf("a")
x.indexOf("p")
x.indexOf("k")

	//	The Unit Type
	
val printOutput = println("Hello Scala")  
val sqrtResult = math.sqrt(24)

var aGlobalVariable = 10
def impureFunction() = {aGlobalVariable = aGlobalVariable*2}

	//	The Any Type
	
var aList = List(1,"irfan")
var integerList = List(1,20,-100)

var anyVariable:Any = 10
anyVariable = "irfan"

sqrtResult.getClass

//Type Casting in Scala
scala.io.StdIn.readLine
val userInput = scala.io.StdIn.readLine
userInput/10



var myVariableDouble:Double = 12.12547
myVariableDouble.toInt

"10".toInt//it work
"two".toInt // It doesn't work

	

/*
	The Empty values in Scala are represented by Null, null, Nil, Nothing, None, and Unit. The
	explication of these empty values are as follows:
	
	•
	null:
	The reference types such as Objects, and Strings can be nulland the value types such as
	Int, Double, Long, etc, cannot be null, the null in Scala is analogous to the null in Java.
	•
	Null:
	It is a Trait, which is a subset of each of the reference types but is not at all a sub-type
	of value types and a single instance of Null is null. The reference types can be assigned
	null but the value types cannot be assigned null.
	• Nothing:
	Nothing is also a Trait, which has no instances. It is a subset of each of the distinct
	types. The major motive of this Trait is to supply a return type for the methods which
	consistently throws an exception i.e, not even a single time returns generally. It is also
	helpful in providing a type for Nil.
	• Unit:
	The Unit is Scala is analogous to the void in Java, which is utilized as a return type of
	a functions that is used with a function when the stated function does not returns
	anything.
	•
	Nil:
	Nil is Considered as a List which has zero elements in it. The type of Nil is
	List[Nothing] and as stated above, that Nothing has no instances, we can have a List
	which is confirmed to be desolated.
*/
