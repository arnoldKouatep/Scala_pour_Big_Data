/*
	1. Practice using code blocks by writing a series of statements in them and assigning a value to
	a variable to see what is returned and stored.
	2. Study the caveats of what value gets returned when you use pattern matching, i.e., if you
	return different values in different case blocks, make sure you understand what happens.
*/

//Code Blocks in Scala

val resultOfBlock = {
    val a=2
    val b=2
    a+b
}


//Caveats of Code Blocks

val resultOfBlock = {
    val a=2
    val b=2
    val c=a+b
}

//Code Blocks and If/Else Statements

val age = 50
val isOld = {
    if (age>50)
    true
    else false
}

val age=50
    val isOld = {
        if (age>50)
        100
        else "no"
    }


	/* Block is multiple lines of code that are enclosed between braces i.e. everything between { and } is in one block code.*/

val time:String = {
	val d = new java.util.Date()
	d.toString()
}

var age = 25
if (age >= 21){
	println("Come in")
	} else {
	println("Get")
	}
	
{
	val a = "Hello"
	val b = "world"
	s"$a $b"
}

	/*
		Pattern matching is one of Scala’s most interesting features. It allows you to check if a value
		matches one of the defined patterns and runs the associated block of code.
		Pattern matching is a way of checking the given sequence of tokens for the presence of the specific
		pattern. It is the most widely used feature in Scala. It is a technique for checking a value against a
		pattern. It is similar to the switch statement of Java and C.
		Here, “match” keyword is used instead of switch statement. “match” is always defined in Scala’s
		root class to make its availability to the all objects. This can contain a sequence of alternatives. Each
		alternative will start from case keyword. Each case statement includes a pattern and one or more
		expression which get evaluated if the specified pattern gets matched. To separate the pattern from
		the expressions, arrow symbol(=>) is used
	*/
	
import scala.util.Random

val x: Int = Random.nextInt(10)

x match {
	case 0 => "zero"
	case 1 => "one"
	case 2 => "two"
	case _ => "other"
	}
