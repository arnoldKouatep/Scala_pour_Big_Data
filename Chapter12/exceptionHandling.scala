	/*
		1. When you use a function from a module, try to observe what type of exception the function
		can throw in the Scala documentation online. Try to write programs in such a way that you
		handle all of those exceptions.
		2. Explore the benefits of using scala.util. {Try,Success,Failure} for exception handling.
		
		• Exception
		An exception is an unwanted or unexpected event that occurs during the execution of a program
		which changes its normal flow. Exception handling is the mechanism to respond to and investigate
		the occurrence and cause of an exception.
		Generally, exceptions are of two types - checked and unchecked. Scala only allows unchecked
		exceptions - this means that there is no way to know if a method throws an unhandled exception at
		compile-time
		It is best practice in Scala to handle exceptions using a try{...} catch{…} block, similar to how it is
		used in Java, except that the catch block uses pattern matching to identify and handle exceptions.
		Figure: Scala Exceptions HierarchyAs evident from the diagram shown above, one branch of the hierarchy under Throwable is headed
		by Exception, which is the class used for exceptional conditions that programs should catch. An
		example of an exception is NullPointerException.
		Another branch is Error, which is used by the Java Virtual Machine (JVM) to indicate errors that are
		related to the Java runtime environment itself (JRE). An example of an error is StackOverflowError.
		
		• Try/catch block
		Scala allows handling exceptions using a single try/catch block. Exceptions can then be pattern
		matched using case blocks instead of providing a separate catch clause for each exception.
		
		• Finaly block
		An expression can be wrapped with the finally clause if some part of the code needs to be executed
		irrespective of what happens before and how the expression terminates. This can especially be
		useful to close resources like database connections.
		
		• Custom exception
		Scala allows developers to create their own custom exceptions. To declare a custom exception, the
		Exception class needs to be extended. In the custom class, the conditions to throw the exception and
		a message can be defined.
		
		• The benefits of using scala.util. {Try,Success,Failure} for exception handling.
		Try block – We put the actual code inside this block.
		Success block – In this block, we get the output result in case the execution of the code is
		successful.
		Failure block – In case of any exception, we land into this block with the error details.
	*/

	//	1. When you use a function from a module, try to observe what type of exception the functio can throw in the Scala documentation online. 
	
// Basic calculator
object CalculatorExceptions {
  class IntOverflowException extends RuntimeException
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import CalculatorExceptions._

  def sum(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a + b
    if (result < 0) throw new IntOverflowException
    result
  }
  
  def tryCatch(a: Int, b: Int): Int = {
  try {
    return Calculator.sum(a,b)
  } catch {
    case e: IntOverflowException => -1
    case e: NegativeNumberException => -2
  } finally {
    // This block will always be invoked
    println("Calculation done!")
  }
}
}

// try/catch/finally
object CalculatorExceptions {
  class IntOverflowException extends RuntimeException
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import CalculatorExceptions._

  def sum(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a + b
    if (result < 0) throw new IntOverflowException
    result
  }
  
  def trySuccessFailure(a: Int, b: Int): Try[Int] = Try {
  Calculator.sum(a,b)
}

"trySuccessFailure" should "handle NegativeNumberException" in {
  import CalculatorExceptions._
  val result = trySuccessFailure(-1,-2)
  result match {
    case Failure(e) => assert(e.isInstanceOf[NegativeNumberException])
    case Success(_) => fail("Should fail!")
  }
}

it should "handle IntOverflowException" in {
  import CalculatorExceptions._
  val result = trySuccessFailure(Int.MaxValue,1)
  result match {
    case Failure(e) => assert(e.isInstanceOf[IntOverflowException])
    case Success(_) => fail("Should fail!")
  }
}

it should "return the correct sum" in {
  import CalculatorExceptions._
  val result = trySuccessFailure(3,2)
  result match {
    case Failure(e) => fail("Should succed!")
    case Success(result) => assert(result == 5)
  }
}

}

// Try/Succes/Failure
object CalculatorExceptions {
  class IntOverflowException extends RuntimeException
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import CalculatorExceptions._

  def sum(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a + b
    if (result < 0) throw new IntOverflowException
    result
  }
}

// catch objects
object CalculatorExceptions {
  class IntOverflowException extends RuntimeException
  class NegativeNumberException extends RuntimeException
}

object Calculator {
  import CalculatorExceptions._

  def sum(a: Int, b: Int): Int = {
    if (a < 0 || b < 0) throw new NegativeNumberException
    val result = a + b
    if (result < 0) throw new IntOverflowException
    result
  }
}
  def catchObjects(a: Int, b: Int): Try[Int] = allCatch.withTry {
   Calculator.sum(a,b)
  }
  val myCustomCatcher = catching(classOf[NegativeNumberException])

  def customCatchObjects(a: Int, b: Int): Try[Int] = myCustomCatcher.withTry{
   Calculator.sum(a,b)
  }
  def ignoringAndSum(a: Int, b: Int) =
   ignoring(classOf[NegativeNumberException], classOf[IntOverflowException]) {
     println(s"Sum of $a and $b is equal to ${Calculator.sum(a, b)}")
   }
   
 	/*	2. Explore the benefits of using scala.util. {Try,Success,Failure} for exception handling.*/
 	
import scala.util.control.Exception._
import java.net._

val s = "http://www.scala-lang.org/"

// Some(http://www.scala-lang.org/)
val x1: Option[URL] = catching(classOf[MalformedURLException]) opt new URL(s)

// Right(http://www.scala-lang.org/)
val x2: Either[Throwable,URL] =
  catching(classOf[MalformedURLException], classOf[NullPointerException]) either new URL(s)

// Success(http://www.scala-lang.org/)
//val x3: Try[URL] = catching(classOf[MalformedURLException], classOf[NullPointerException]) withTry new URL(s)

val defaultUrl = new URL("http://example.com")
//  URL(http://example.com) because htt/xx throws MalformedURLException
val x4: URL = failAsValue(classOf[MalformedURLException])(defaultUrl)(new URL("htt/xx"))


def log(t: Throwable): Unit = t.printStackTrace

val withThrowableLogging: Catch[Unit] = handling(classOf[MalformedURLException]) by (log)

def printUrl(url: String) : Unit = {
  val con = new URL(url) openConnection()
  val source = scala.io.Source.fromInputStream(con.getInputStream())
  source.getLines.foreach(println)
}

val badUrl = "htt/xx"

withThrowableLogging { printUrl(badUrl) }

val goodUrl = "http://www.scala-lang.org/"

withThrowableLogging { printUrl(goodUrl) }
