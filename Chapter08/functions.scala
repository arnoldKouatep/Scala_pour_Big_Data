/*
	1. Understand the difference between functions and methods in the context of functional
	programming in Scala.
	2. Consider a use case of recursion and try applying it.
	3. Try using functions within functions, i.e., local functions. Understand whether you can refer
	to inner functions in outer scope.
	4. Understand whether variables were copied by value or by reference in Scala and what the
	implications of doing so are.
	5. Understand the best practices of functions, in that they should be designed so that they
	perform one and only one task.
	
	def <function_name>(<parameter_name:parameter_type>,<parameter_name:parameter_type>…):return_type = {
 			 //function body
	}
*/
import java.util.Date

object Functions {
	object Math {
		def add(x: Int, y: Int) : Int = {
		return x + y
		}
		
		def +(x: Int, y: Int) : Int = {
		return x + y
		}
		//default value of the arguments in function
		def addDefault(x: Int = 45, y: Int = 15) : Int = {
		return x + y
		}
		
		def square(x: Int) = x * x
		
		def **(x: Int) = x * x
	}
	
	def print(x: Int, y:Int): Unit = {
			println(x+y)
		}
		
	def add(x: Int, y: Int) : Int = {
		return x + y
	}
	
	def subtract(x: Int, y: Int) : Int = {
		x - y
	}
	
	def multiply(x: Int, y: Int) : Int = x * y
		
	def divide(x: Int, y: Int) = x / y
	
	// Higer-order Funtions in scala
	
	def math(x: Double, y: Double, f: (Double, Double)=>Double): Double = f(x, y)
	def math2(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z)
	
	// Partially applied functions
	
	def log (date: Date, message: String) = {
		println(date + "  " + message)
	}
	
	// Closures in Scala
	/* A closure is a function which uses one or more variables declared outside this function. */
	var number = 10
	val addClosure = (x: Int) => {
		x + number
	}
	 //Currying in Scala
	 /* Currying is the technique of transforming a funcionthat takes multipl arguments into a function
	 that takes a single argument*/
	 
	 def addCurry (x: Int) = (y: Int) => x + y
	 def addCurry2 (x: Int)(y: Int) = x + y //syntax that scala provide for us
	def main(args: Array[String]){
		
		println(addCurry(25)(75))
		val sum40 = addCurry(40)
		println(sum40(50))
		println(addCurry2(100)(200))
		val sum50 = addCurry2(50)_
		println(sum50(400))
		
		
		println(addClosure(158))

		// Partially applied functions
	
		val sum = (a: Int, b: Int, c: Int) => a + b + c
		val f = sum(10, 52, _: Int)
		println(f(100))
		
		val date = new Date
		val newLog = log(date, _: String)
		newLog("The message 1")
		newLog("The message 2")
		newLog("The message 3")
		
		
		val result = math(50, 20, (x,y)=> x * y)
		println(result) 
		
		val result2 = math2(50, 20, 25, (x,y)=> x + y)
		println(result2)
		
		//anonymous fuction
		var addAnonym = (x: Int, y: Int) => x + y
		println(addAnonym(45, 15))
		
		print(230, 582)
		println(Math.add(45, 15))
		println(Math.addDefault())
		println(Math.+(25, 87))
		println(Math.addDefault(75))
		println(Math.square(5))
		println(Math ** 5)
		println(Math square 5) // We can do that  if the function have only one argument
		println(add(45, 15))
		println(multiply(45, 15))
		println(subtract(45, 15))
		println(divide(45, 15))
	}
}
Functions.main(Array(" "))

def getSquareRoot(givenNumber:Int):Double = {
   println(s"Finding square root   of $givenNumber")
   math.sqrt(givenNumber)
} 

getSquareRoot(25)

val squareOf25 = getSquareRoot(25)

//Inference
def getSquareRoot(givenParam:Int)= {
    println(s"finding square root of $givenParam")
    math.sqrt(givenParam)
}

def greetEmployee(name:String, company:String) = {
   println(s"Hi $name. Welcome to $company")
}


greetEmployee("Irfan","Facebook")

greetEmployee(name="Irfan",company="Deloitte")
greetEmployee(company="Deloitte",name="Irfan")

def greetEmployee(name:String="Irfan", company:String) = {
   println(s"Hi $name. Welcome to $company")
}

greetEmployee(company="Deloitte")
greetEmployee(name="John Doe",company="Deloitte")

def printDate = java.time.LocalDate.now.toString
printDate

def convertToUpper(name:String):String = name.toUpperCase

def convertToLower(name:String):String = name.toLowerCase

def changeCase(givenName:String,caseConverter:(String)=>String) = caseConverter(givenName)

changeCase("irfan",convertToUpper)
changeCase("IRFAN",convertToLower)

(name:String)=>name.toUpperCase 
(name:String)=>name.toLowerCase

val convertToUpperAnon=(name:String)=>name.toUpperCase
convertToUpperAnon("irfan")
changeCase("irfan",(x:String)=>x.toUpperCase)

	/*
		Functions and methods in Scala represent similar concepts, but there are significant
		differences in how we use them.

		A function is a callable unit of code that can take a single parameter, a list of parameters, or no
		parameters at all. A function can execute one or many statements and can return a value, a list of
		values, or no values at all.
		
		Methods are essentially functions that are parts of a class structure, can be overridden, and use a
		different syntax. Scala doesn’t allow us to define an anonymous method.
	*/

//Examples of functions and methodes
	
def abs(number: Int): Int = {
    if (number < 0)
      return number * -1
    return number;
  }
var number = 28
abs(number)
abs(23)

//Multiples parameters

def binaryExponentiation(base: Int, power: Int): Int = {
    if (power == 0) {
      return 1
    } else if (power % 2 == 1) {
      return binaryExponentiation(base, power - 1) * base
    } else {
      val answer: Int = binaryExponentiation(base, power / 2)
      return answer * answer
    }
  }
  
binaryExponentiation(9,5)

//name arguments
swap(3, 1)                    // (1, 3)
swap(first = 3, second = 1)   // (1, 3)
swap(second = 1, first = 3)   // (1, 3)

 def swap(first: Int, second: Int) = (second, first)

	/* 
		Recursion
	
		Is the technique of making a function call itself directly or indirectly and the corresponding
		function is called a recursive function. This technique provides a way to break complicated
		problems down into simple problems which are easier to solve. Recursion may be a bit difficult to
		understand and it can take some time to get your head around how it works
		In the recursive program, the solution to the base case is provided and the solution of the bigger
		problem is expressed in terms of smaller problems. Let us take an example to understand this.
		Recursion plays a big role in pure functional programming and Scala supports recursion functions
		very well. Recursion means a function can call itself repeatedly.
		Try the following program, it is a good example of recursion where factorials of the passed number
		are calculated.
	*/

//Factorial function	
def factorial(n: Int): Int = if (n == 0) 1 else n*factorial(n -1)
println(factorial(1))
println(factorial(2))
println(factorial(3))
println(factorial(10))

// Great common divisor
def gcd(a: Int, b:Int): Int = if (b == 0) a else gcd(b, a % b)
println(gcd(12,5))
println(gcd(46,16))
	
	/*
		Local functions:
		
		If you understand the Scala function, the local function should be the most simple idea among all
		other Scala functional concepts. When we use an Object Oriented approach, it is quite common to
		create private methods. They are a kind of helper met
	*/

//Max min function	
def maxAndMin(a:Int, b:Int) = {
	def maxValue() = {
		if (a > b) {
			println("Max is: " + a)
			}
		else {
			println("Max is: " + b)
			}
	}
	def minValue() = {
		if (a < b) {
			println("Min is: " + a)
			}
		else {
			println("Min is: " + b)
			}
	}
	minValue();
	maxValue()
}
maxAndMin(89, 5)
		
