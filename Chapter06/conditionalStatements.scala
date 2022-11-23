/*
	1. First, create a decision tree indicating a different series of conditions to be checked. Then
	use the if/else condition statements based on this decision tree in your program.
	2. Try assigning the whole if/else blocks to a variable and seeing what value is returned.
	3. Try nesting different case statements in pattern matching. See how it works.
	4. Explore other use cases of pattern matching. Explore how it can be used with regular
	expressions, type checks, and for catching exceptions.
	
	if (CONDITION) EXPRESSION1 else EXPRESSION2
*/

object ConditionalStatements {
	def main(args: Array[String]) {
		val x = 20
		var res = ""
		
		if (x == 20) {
			res = "x == 20"
		} else {
			res = "x != 20"
		}
		println(res)
		
		println(if ( x != 20) "x == 20" else "x !=x")
		
		val res2 = if ( x != 20) "x == 20" else "x !=x"
		println(res2)
		
		val res3 = ""
		val y = 30
		if (x != 20 && y == 30) {
			res = "x != 20 and y == 30"
		} else {
			res = "x == 20"
		}
		println(res3)
	}
}
ConditionalStatements.main(Array(" "))	


	// mactch expression in scala

object MatchExpressions {
	def main(args: Array[String]) {
		val age = "50"
		
		// In a statement
		age match {
			//case "20" => println(age)
			case "18" => println(age)
			case "30" => println(age)
			case "40" => println(age)
			case "20" => println(age)
			
			case _ => println("default")
		}
		
		// In expression
		val age = "18"
		val result = age match {
			case "20" => age
			case "18" => age
			case "30" => age
			case "40" => age
			case "20" => age
			
			case _ => "default"
		}
		println("result = " + result)
		
		val i = 7
		i match {
			case 1 | 3 | 5 | 7 | 9 => println("odd")
			case 2 | 4 | 6 | 8 | 10 => println("even")
		}
	}
}
MatchExpressions.main(Array(" "))	

// Boolean Expressions
10 > 100
10 >= 100
"irfan" != "Irfan"
100 < 1000
100 <= 1000

// Using Conditional Statements in Scala


val carBudget = 40
if (carBudget < 30) 
println("buy Mazda")
else println("buy BMW")

//Caveats: Using {} After if/else
val carBudget = 40
if (carBudget < 30) {
    println("buy Mazda")
}
else {
    println("buy BMW")
}


val carBudget = 40
if (carBudget < 30)
println("so your budget is lesser than 30")
println("buy Mazda")
else print("buy BMW")


val carBudget = 40
if (carBudget < 30) {
    println("so your budget is lesser than 30")
    println("buy Mazda")
}
else { 
    print("buy BMW")
}


// Nested If/Else Statements
val country="Australia"
val carBudget = 25
if (carBudget < 30) {
    println("sSo your budget is lesser than 30")
    if (country == "Australia") {
        println("Buy Mazda")
    } else {
        println("Buy Toyota")
    }
}
else { 
    print("buy BMW")
}




val carBudget = 70
if (carBudget < 30) {
    println("Buy Toyota")
}
else if (carBudget > 30 & carBudget < 50) {
    print("Buy Mazda")
} else if (carBudget > 50) {
    print("Buy BMW")
}


// If/Else as a Ternary Operator

val salary = 95000
val highlyPaid = if (salary>100000) true else false


val country = "Australia"
country match {
case "Australia" => "Continent"
case _ => "Not Continent"
}



val salary = 95000
salary match {
case x if x>100000 => true
case y if y<100000 => false
}

	/*1. First, create a decision tree indicating a different series of conditions to be checked. Then
	use the if/else condition statements based on this decision tree in your program.*/
	
println("	 true")
println("	 ----: 5")
println("	|")
println("x --- x>0?")
println("	|")
println("	 ----: -1")
println("	 false")

val x = -5
if ( x>0) true else false

	/* 2. Try assigning the whole if/else blocks to a variable and seeing what value is returned.*/

val x = 10

if (x == 1) println("yeah")
if (x == 10) println("yeah")
if (x == 11) println("yeah")
if (x == 11) println ("yeah") else println("nay")

println(if (x == 10) "yeah" else "nope")

val text = {if (x == 10) "yeah" else "nope"}
println(text)

var myAge = 20
val result = {
		if (myAge < 21){
			"Vous etes mineurs"
		} else {
			"Vous etes majeurs"
		}
	}
	
println(result)

	/*3. Try nesting different case statements in pattern matching.*/



var a = 5
if (a >= 2) {
	if (a <= 8)
		print("a est dans l'intervalle.")
	else
	print("a n'est pas dans l'intervalle.")
	}
else
print("a n'est pas dans l'intervalle.")

	/*
		4. Explore other use cases of pattern matching. Explore how it can be used with regular expressions, type checks, and for catching exceptions.
		Pattern matching is used to determine whether source files of high-level languages are
		syntactically correct. It is also used to find and replace a matching pattern in a text or code
		with another text/code. Any application that supports search functionality uses pattern
		matching in one way or another.
	*/
