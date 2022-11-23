	/*
		1. Load a text file in Scala and see how many times a particular term appears in it. Try
		implementing this exercise using a for and a while loop.
		2. Try using loops in a function (e.g., one that prints odd numbers from 0 to 200) and invoke
		that function in your main program.
		3. Try assigning a for or while loop to a variable. Understand what happens when you do so.
		4. Try using two variables in the () after for. Explore the prospects of these and see how you
		can use them.
		5. Try nesting one for loop into another.
		6. Try the good old sorting algorithms (e.g., bubble sort, merge sort) using for and while loops
		in Scala.
		
		----> Traduction
		
		1. Chargez un fichier texte en Scala et voyez combien de fois un terme particulier y apparaît. Essayez
		de réaliser cet exercice en utilisant une boucle for et une boucle while.
		2. 2. Essayez d'utiliser des boucles dans une fonction (par exemple, une fonction qui imprime des nombres impairs de 0 à 200) et invoquez cette fonction dans votre programme principal.
		cette fonction dans votre programme principal.
		3. Essayez d'assigner une boucle for ou while à une variable. Comprenez ce qui se passe lorsque vous le faites.
		4. Essayez d'utiliser deux variables dans le () après for. Explorez les perspectives de ces dernières et voyez comment vous
		pouvez les utiliser.
		5. Essayez d'imbriquer une boucle for dans une autre.
		6. Essayez les bons vieux algorithmes de tri (par exemple, tri à bulles, tri par fusion) en utilisant des boucles for et while
		en Scala.


	*/
	
	// 2. Try using loops in a function (e.g., one that prints odd numbers from 0 to 200) and invoke that function in your main program.


object Loops {
	def main(args: Array[String]) {
		var x = 0
		
		while (x < 10) {
			println("x = " + x)
			x += 1
		}
		
		var y = 0
		do {
			println("x = " + y)
			y += 1
		} while (y < 10) 
		
		// for loop
		for (i <- 1.to(5)) {
			println("i using to " + i)
		}
		
		for (i <- 1 until 5) {
			println("i using until " + i)
		}
		
		for (i <- 1 to 9; j <- 1 to 3) {
			println("i using multiple ranges " + i + " " + j)
		}
		
		val list = List(1, 2, 3, 4, 5, 66, 6, 77, 45, 63)
		
		for (i <- list) {
			println("i using list " + i)
		}
		
		for (i <- list; if i < 6) {
			println("i using Filters " + i)
		}
		
		val result = for { i <- list; if i < 6} yield {
			i * i
		}
		println("result = " + result)
	}
}
Loops.main(Array(" "))


// for loop
for (i <- 1 to n) println("Vive le SDZ")

//while loop
var x = 3
while (x < 6) {
	x += 1
	println(x)
}
x

//do while loop
var i = 0
  do {
    println(i)
    i += 1
  } while (i < 10)
  
// function that prints odd numbers from 0 to 200
var listOfNumber = (0 to 200).toList
def oddNumbers(array: List[Int]): Unit = {
	for (i<-array; if i%2 !=0){
		printn( i )
	}
}
oddNumbers(listOfNumber)

// invocation in my main
object Loops {
	def main(args: Array[String]) {
		var listOfNumber = (0 to 200).toList
		oddNumbers(listOfNumber)
		println("Hello, world!")
	}
	
	def oddNumbers(array: List[Int]): Unit = {
	for (i<-array; if i%2 !=0){
		printn( i )
	}
}
}
}


	// 4. Try using two variables in the () after for. Explore the prospects of these and see how you can use them.
for (i <- 0 to 9; j <- 0 to 9)
{
	println("i = " + i + " :: " + "j = " + j)
}
	
	// 5. Try nesting one for loop into another.
// for loop
for (i <- 1 to 2)
	for (j <- 1 to 2)
		println(i + " " + j)
// for and do while loop
var i = 0
do {
   for (j <- 0 to i)
     print("*")
   print("\n")
   i += 1
} while (i < 10)
  
	
	// 6. Try the good old sorting algorithms (e.g., bubble sort, merge sort) using for and while loops in Scala.

//insertion sort
def recursiveInsertionSort(array: List[Int]): List[Int] = {

    def insertion(x: List[Int]): List[Int] = {
      x match {
        case List()  => List()
        case x :: xs => ins(x, insertion(xs))
      }
    }

    def ins(x: Int, xs: List[Int]): List[Int] = {
      xs match {
        case List()    => List(x)
        case x2 :: xs2 => if (x <= x2) x :: xs else x2 :: ins(x, xs2)
      }
    }

    insertion(array)
  }
  var x = recursiveInsertionSort(List(3, 60, 35, 2, 45, 320, 5))
 println(x)
 

 
 // quick sort 
 def quickSort(array: Array[Int]): Array[Int] = {
    def quickSortImpl(array: Array[Int], first: Int, last: Int): Array[Int] = {
      var pivot: Int = 0
      var i: Int     = 0
      var j: Int     = 0
      var temp: Int  = 0

      if (first < last) {
        pivot = first
        i = first
        j = last

        while (i < j) {
          while (array(i) <= array(pivot) && i < last) {
            i += 1
          }

          while (array(j) > array(pivot)) {
            j -= 1
          }

          if (i < j) {
            temp = array(i)
            array(i) = array(j)
            array(j) = temp
          }
        }

        temp = array(pivot)
        array(pivot) = array(j)
        array(j) = temp
        quickSortImpl(array, first, j - 1)
        quickSortImpl(array, j + 1, last)
      }

      array
    }

    quickSortImpl(array, 0, array.length - 1)
  }
 var x = quickSort(Array(3, 60, 35, 2, 45, 320, 5))
 println(x)
