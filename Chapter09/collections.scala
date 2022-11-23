/*
	1. There are many ways you can use the amazing map function. Here are some example
	exercises to strengthen your grip on this function:
		• Create a list of numbers and return true if an element is even; otherwise, return false.
		• Create a list of strings and extract the first and last character of each string.
		• Load a file in Scala and load its content in a list. Then iterate through each line, one by
	one.
	2. Try using ArrayBuffer as a mutable collection. Make sure you understand the difference
	between ListBuffer and ArrayBuffer.
	3. Understand what Array is in Scala. How is it different from the other collections that you
	studied?
	4. Understand what vector is in Scala and how is it different from the other collections that you
	studied.
*/


	//	Arrays in Scala
import Array._

object ArrayCollections {
	val myarray: Array[Int] = new Array[Int](4)
	val myarray2 = new Array[String](5)
	val myarray3 = Array(1,2,3,4,5,6,9,7,8)

	def main(agrs:Array[String]) {
		myarray(0) = 20
		myarray(1) = 50
		myarray(2) = 10
		myarray(3) = 30
		println(myarray3.length)
		val result = concat(myarray, myarray3)
		
		myarray
		for (x <- result) {
			println(x)
		}
		
		for (i <- 0 to (myarray.length - 1)) {
			println(myarray(i))
		}
		
	}

}
ArrayCollections.main(Array(" "))

	//	Lists in Scala
	
object ListCollections {
	val mylist: List[Int] = List(1,2,5,8,9,6,4,7)
	val names: List[String] = List("Max", "Tom", "Janot", "Cedric")
	
	def main(agrs:Array[String]) {
		println(0 :: mylist)
		println(mylist)
		println(names)
		println(1 :: 5:: 9 :: Nil)
		println(mylist.head)
		println(names.tail)
		println(mylist.tail)
		println(names.isEmpty)
		println(mylist.reverse)
		println(List.fill(5)(2))
		println(mylist.max)
		
		mylist.foreach( println )
		var sum : Int = 0
		mylist.foreach(sum += _)
		println(sum)
		
		for (name <- names) {
			println(name)
		}
		
		println(names(0))		
	}

}
ListCollections.main(Array(" "))

	//	Set in scala
object SetCollections {
	val mySet: Set[Int] = Set(1,2,5,8,9,6,4,7)
	val mySetMutable = scala.collection.mutable.Set(1,2,5,8,9,6,4,7) // mutable set
	val mySet2: Set[Int] = Set(4,2,9,18,19,16,14)
	val names: Set[String] = Set("Max", "Tom", "Janot", "Cedric")
	
	def main(agrs:Array[String]) {
		println(mySet + 10)
		println(names("Maxxxx"))
		println(mySet.head)
		println(mySet.tail)
		println(mySet.isEmpty)
		
		println(mySet ++ mySet2)
		println(mySet.++(mySet2))
		
		println(mySet.&(mySet2))
		println(mySet.intersect(mySet2))
		println(mySet.max)
		
		println(mySet.min)
		
		mySet.foreach(println)
		
		for (name <- names) {
			println(name)
		}
			
	}

}
SetCollections.main(Array(" "))

	// map in scala
object MapCollections {
	val myMap : Map[Int, String] =
		Map(801 -> "max", 802 -> "Tom", 804 -> "July")
	val myMap2 : Map[Int, String] = Map(805 -> "lua")
	
	def main(agrs:Array[String]) {
		println(myMap)
		println(myMap(801))
		println(myMap.keys)
		println(myMap.values)
		println(myMap.isEmpty)
		
		myMap.keys.foreach { key  => 
			println("key " + key)
			println("Value " + myMap(key))
		}
		
		println(myMap.contains(258))
		println(myMap ++ myMap2)
		println(myMap.size)
			
	}

}
MapCollections.main(Array(" "))

	// Tuple in scala
object TuplesCollections {
	val myTuple = (1, 2, "hello", true);
	val myTuple2 = new Tuple3(1, 2, "hello")
	val myTuple3 = new Tuple3(1, "hello", (2,3))
	
	def main(agrs:Array[String]) {
		println(myTuple._1)
		println(myTuple._2)
		println(myTuple._3)
		println(myTuple._4)
		println(myTuple2._3)
		
		myTuple.productIterator.foreach {
			i => println(i)
		}
		
		println(1 -> "Tom" -> true)
		println(myTuple3._3._2)		
	}

}
TuplesCollections.main(Array(" "))


	// options in scala (Some and None)
object Options {
	val myMap : Map[Int, String] =
		Map(801 -> "max", 802 -> "Tom", 804 -> "Janot")
	val list = List(1, 2, 3)
	val opt : Option[Int] = Some(55)
	def main(agrs:Array[String]) {
		println(list.find(_ > 2).getOrElse(0))
		println(myMap.get(5).getOrElse("No name found"))
		
		println(opt.isEmpty)
		println(opt.get)
			
	}

}
Options.main(Array(" "))

	// map and filter
object MapFilter {
	val myMap : Map[Int, String] =
		Map(801 -> "max", 802 -> "Tom", 804 -> "Janot")
	val list = List(1, 2, 3, 5, 7, 10, 13)
	val opt : Option[Int] = Some(55)
	def main(agrs:Array[String]) {
		println(list.map(x => x / 0.2))
		println(list.map(x => "hi" + x))
		println(myMap.mapValues(x => "hi " + x))
		println("hello".map(_.toUpper))
		println(List(List(1,2,3), List(3,4,5)).flatten)
		println(list.flatMap(x => List(x, x+1)))
		
		println(list.filter(x => x%2!=0))
		
	}

}
MapFilter.main(Array(" "))

	// reduce, fold and scan in scala
object ReduceFoldScan{
	val list2 = List("A", "B", "C")
	val list = List(1, 2, 3, 5, 7, 10, 13)
	
	def main(agrs:Array[String]) {
		println(list.reduceLeft(_ + _))
		println(list2.reduceLeft(_ + _))
		println(list.reduceLeft((x,y) => {println(x + " , " + y); x+y;}))
		
		println(list2.reduceRight(_ + _))
		println(list.reduceRight((x,y) => {println(x + " , " + y); x-y;}))
		
		println(list.foldLeft(100)(_ + _))
		println(list2.foldLeft("z")(_ + _))
		
		println(list.scanLeft(100)(_ + _))
		println(list2.scanLeft("z")(_ + _))
		
	}

}
ReduceFoldScan.main(Array(" "))


val myIntegerList = List(1,2,10,30)
val myStringList = List("New York", "Melbourne", "Islamabad", "Istanbul")

val mixList = List(1,"New York","Melbourne",2,"Islamabad")
myIntegerList(0)
myIntegerList(2)
myStringList(0)
myStringList(3)

case class Person (name:String, age:Int, employer:String, isMarried:Boolean)
val listOfPersons = List(Person("irfan",30,"Deloitte",true), Person("Tony Stark",45,"Avengers", false), Person("Neo",34,"Matrix",true))




case class Person (name:String, age:Int, employer:String, isMarried:Boolean)
val listOfPersons = List(Person("irfan",30,"Deloitte",true), Person("Tony Stark",45,"Avengers",false), Person("Elon Musk",34, "Tesla", true))

listOfPersons

myIntegerList.length

myStringList.mkString(";")

myIntegerList.length

def squareThis(givenParam:Int):Double = math.pow(givenParam,2)

val numberList = List(1,3,5,7,9)
numberList.map(x=>squareThis(x))

numberList.map(squareThis)
val stringList = List("Australia","USA","UK","Malaysia","Singapore")
stringList.map(x=>x.length)

numberList.foreach(x=>squareThis(x))
numberList.foreach(x=>println(s"My id is $x"))
def isEven(givenParam:Int):Boolean = givenParam%2 == 0

val numberList=(1 to 10).toList //this is yet another method you can quickly create a list. This will create a list consisting of numbers from 1 to 10.  

numberList.filter(x=>isEven(x))

val list=(1 to 10).toList
list.reduce((x,y)=>x+y)
list.reduce(_+_)

val aList = "a" :: "b" :: "c" :: Nil

val aSet = Set(1,10,121)
val aSet = Set(1,10,121,10)

val duplicateList = List(1,10,121,10)
duplicateList.toSet

aSet
aSet(1)
aSet(10)
aSet(20)


val contactsMap = Map("thor"->918101,"captain america"->1281281,"hulk"->91921921)

contactsMap("thor")
contactsMap("Thor")
contactsMap.getOrElse("iron man","not found")
val contactsMap = Map("thor"->918101,"captain america"->1281281,"hulk"->91921921,"thor"->99021)
contactsMap("thor")

val contactsMap = Map(("thor",918101),("captain america",1281281),("hulk",91921921),("thor",99021))

contactsMap.keys
contactsMap.values
contactsMap.contains("thor")
contactsMap.contains("black panther")
contactsMap("hulk") = 81729191

contactsMap.map{case(x,y)=>x.toUpperCase -> y}

val aTuple = (1,"customer1","australia","prepaid",true)
aTuple._1
aTuple._2
aTuple.productIterator.toList.foreach(println)
aTuple.productArity

val twoElementTuple = Tuple2("irfan","elahi")

import scala.collection.mutable.ListBuffer

var aMutableList = ListBuffer(1,10,91,121)
aMutableList += 500
aMutableList
aMutableList(0) = -91
aMutableList -= 500
aMutableList -= 10

var secondMutableList = ListBuffer(818181, 912121)
aMutableList = secondMutableList


//first you import the mutable library into your name-space. It’s suggested to not import import scala.collection.mutable.Map as it will be vague as to whether you want to use mutable or immutable map in your program. 

import scala.collection.mutable


// creating a mutable map is similar to immutable one:

val mutableMap = mutable.Map("CEO" -> "John Doe", "CTO" -> "Tony Stark", "Team Lead" -> "Dwayne Johnson")

//if you want to update a key-value pair i.e. specifically a value against a key:

mutableMap("CEO") = "John Cena"

//if you want to add a new key-value pair in your mutable map:
mutableMap += "Developer" -> "Nate Silver"


val nestedList = List(
    List("Australia","Pakistan","Malaysia"), 
    List("Asia","Africa","Antarctica","Australia","Europe","North America","South America"),
    List("Microsoft","Apple","Facebook","Twitter","Cisco","Netflix","Uber")
    )

nestedList(0)
val firstElement = nestedList(0)
firstElement(0)
nestedList(0)(0)

val nestedListOfTuples = List((1,"irfan","irfanelahi.com"),(2,"nate silver","fivethirtyeight.com/"),(3,"Mark Zuckerberg","facebook.com"))

nestedListOfTuples.foreach(x=>println(s"owner name is: ${x._2}"))


	//	Create a list of numbers and return true if an element is even; otherwise, return false.
		
var listOfNumber = (1 to 10).toList
def isEven(givenParam:Int):Boolean = givenParam % 2 == 0
listOfNumber.map(x => isEven( x ))

	//	Create a list of strings and extract the first and last character of each string.
	
val stringList = List("Australia","USA","UK","Malaysia","Singapore"
def extract (text: String):(Char,Char) ={
	(text(0), text(text.length - 1))
	}
stringList.map(x => extract(x))


	/*
		• Explore how to append two lists, append an element to a list, and take a union or intersection of two lists on your own. When you do these operations, does it change/mutate the original list or does it return a new instance of list?
		• Create a list of strings and then try using reduce to achieve the same output as you would get by using the .mkString function.
	*/
	
	// List of String
val fruit: List[String] = List("apples", "oranges", "pears")

	// List of Integer
val nums: List[Int] = List(1, 2, 3, 4)
	
	// Empty List
val empty: List[Nothing] = List()

	// Two dimensional list
val dim: List[List[Int]] =
	List(
		List(1, 0, 0),
		List(0, 1, 0),
		List(0, 0, 1)
	)
	
	// Operation
fruit.head
fruit.tail
fruit.isEmpty
nums.head
nums.tail
nums.isEmpty
val nums2: List[Int] = List(5, 6, 7, 8)
val num = nums ++ nums2
val c = List.concat(nums, nums2)

	/*
		ArrayBuffer
		As per the Scala Documentation, an is a mutable data structure which allows you to access and
		modify elements at specific index.
	*/

import scala.collection.mutable.ArrayBuffer
	
	//	How to initialize an ArrayBuffer with 3 elements
	
val arrayBuffer1: ArrayBuffer[String] = ArrayBuffer("plain Donut", "Strawberry Dunot", "Chocolate Duont")

	//	How to access elements of an ArrayBuffer at specific index
	
println(s"Element at index 0 = ${arrayBuffer1(0)}")
println(s"Element at index 1 = ${arrayBuffer1(1)}")
println(s"Element at index 2 = ${arrayBuffer1(2)}")

	//	How to add elements to an ArrayBuffer using +=
	
arrayBuffer1 += "Vanilla Donut"
println(s"Element of arrayBuffer1 = $arrayBuffer1")
	
	//	How to add elements from a List to an ArrayBuffer using ++=

arrayBuffer1 ++= List[String]("Glazed Donut", "Krispy creme")
println(s"Element of arrayBuffer1 = $arrayBuffer1")

	//	How to remove elements from an ArrayBuffer
	
arrayBuffer1 -= "plain Donut"
println(s"Element of arrayBuffer1 = $arrayBuffer1")

	//	How to remove elements of a List from ArrayBuffer using --=
	
arrayBuffer1 --= List[String]("Glazed Donut", "Krispy creme")
println(s"Element of arrayBuffer1 = $arrayBuffer1")

	//	How to initialize an empty ArrayBuffer

val emptyArrayBuffer: ArrayBuffer[String] = ArrayBuffer.empty[String]
println(s"Empty array buffer = $emptyArrayBuffer")

	
	/*
			• Scala ArrayBuffer vs ListBuffer
			
		A ListBuffer is like an array buffer except that it uses a linked list internally instead of an array. If you plan
		to convert the buffer to a list once it is built up, use a list buffer instead of an array buffer. scala> val buf =
		scala.collection.mutable. ListBuffer .empty [ Int ] buf: scala.collection.mutable.
		
		If you’re an OOP developer coming to Scala from Java, the ArrayBuffer class will probably be most
		comfortable for you, so we’ll demonstrate it first. It’s a mutable sequence, so you can use its methods to
		modify its contents, and those methods are similar to methods on Java sequences.
		
		Just as the Vector class is the recommended “go to” class for immutable, indexed sequential collections,
		the ArrayBuffer class is recommended as the general-purpose collections class for mutable, indexed
		sequential collections. ArrayBuffer is an indexed sequential collection. Use ListBuffer if you prefer a
		linear sequential collection that is mutable.
		
		As per the Scala Documentation, a ListBuffer is resizable similar to an ArrayBuffer, except that it uses a
		Linked List as its internal data structure.
		
		To use, ArrayBuffer, scala.collection.mutable.ArrayBuffer class is imported, an instance of ArrayBuffer is
		created. Internally, an ArrayBuffer is an Array of elements, as well as the store’s current size of the array.
		When an element is added to an ArrayBuffer, this size is checked.
		
		What is an ArrayBuffer? As per the Scala Documentation, an ArrayBuffer is a mutable data structure
		which allows you to access and modify elements at specific index. Compared to the previous tutorial on
		Array, an ArrayBuffer is resizable while an Array is fixed in size.
		
		List vs ListBuffer. A list is another data structure which maintains the order of the elements, allows for
		duplication and is immutable. Similarly to the ArrayBuffer, the ListBuffer is the mutable form of a list.
		List -- A list is an immutable data structure which can contain duplicates and maintains the order if its
		elements.

	*/

	/*
			• Arrays
		Array is a special kind of collection in scala. it is a fixed size data structure that stores
		elements of the same data type. The index of the first element of an array is zero and the last
		element is the total number of elements minus one. It is a collection of mutable values. Itcorresponds to arrays(in terms of syntax) in java but at the same time it’s different(in terms of
		functionalities) from java.
		Some Important Points:
			•Scala arrays can be generic. which mean we can have an Array[T], where T is a type parameter or abstract type.
			•Scala arrays are compatible with Scala sequences – we can pass an Array[T] where aSeq[T] is required.
			•Scala arrays also support all sequence operations
	*/
	
val numbers = Array(1, 3, 4, 8)
val a = Array(11, 9, 6)
println(s"My second daughter is ${a(2-1)} years old")

	/*
			• Vector
		is an indexed, immutable sequence. The “indexed” part of the description means that you can access
		vector elements very rapidly by their index value, such as accessing listOfPeople(999999).
		In general, except for the difference that Vector is indexed and List is not, the two classes work the
		same, so we’ll run through these examples quickly.
		Here are a few ways you can create a Vector:
	*/

