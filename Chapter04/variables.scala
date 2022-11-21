/*
	1. Try creating a variable of type Double and assigning an integer value to it. Does it work? If yes, research this. Do it the other way (storing a Double value in an Integer variable).
	2. . Then create another variable (e.g., y) and assign it to another variable (i.e., x=y). Now change the value of x. Check whether it changed the value of y or not. If not, research this concept (specifically what is meant by pass by value and pass by reference).
	3. Try creating multiple variables on one line.


	1. Essayez de créer une variable de type Double et d'y affecter une valeur entière. à cette variable. Cela fonctionne-t-il ? Si oui, faites des recherches. Faites-le dans l'autre sens (stocker une valeur Double dans une variable Integer).
	2. Essayez de créer une variable (par exemple, x) et de lui attribuer une valeur (par exemple, 10). (par exemple, 10). Créez ensuite une autre variable (par exemple, y) et affectez-la à une autre variable (par exemple, 10). une autre variable (c'est-à-dire x=y). Changez maintenant la valeur de x. Vérifiez si la valeur de y a été modifiée ou non. Si ce n'est pas le cas, faites des recherches sur ce concept (en particulier ce que l'on entend par passage par valeur et passage par par référence).
	3. Essayez de créer plusieurs variables sur une seule ligne.
	
	Commencez un REPL de Scala en tapant juste scala. Vous devriez voir le prompteur :

	  scala>

	  C'est ce qu'on appelle un REPL (Read-Eval-Print-Loop), c'est une interface de programmation interactive.
	  Vous pouvez y exécuter des commandes.
	  Allons-y 
*/

// lazy variables
lazy val x = 9 

/* Try creating a variable of type Double assigning an integer value to it */

var myDoubleVariable:Double = 12.89

myDoubleVariable = 50


println("It work very well, we can assing the integer value to a variable of type Double")

var myIntVariable:Int = 12
myIntVariable = 89.3645
println("It doesn't work, we can't assing the double value to a variable of type Integer")


/* Try creating a variable (e.g., x) and assigning a value to it (e.g., 10)*/ 

var x = 10
var y = x

x = 96

y 

println("The value of y hasn't change")
/*
	In value passing, a copy of the actual arguments is passed to the respective formal arguments. While
	in reference passing, the location (address) of the actual arguments is passed to formal arguments,
	any changes made to the formal arguments will also be reflected in the actual arguments.
	
	----> Passing by value
	Passing a parameter by value copies the value of the parameter to a variable local to the function.
	Thus, if the argument is modified, the parameter passed to the function is not.
	
	----> Passing by reference
	Passing a parameter by reference copies the reference of the parameter into an argument that is a
	variable local to the scope of the function. Thus, if the argument is modified, the parameter passed
	to the function is also modified. 
*/

/* You can define multiple fields on one line, separated by commas, as long as they are all the same type and have the same value:*/

val x, y, z = 1
var x, y, z = 1.25

var a, b, c:String = ""

/* If you really want to have some fun, you can take advantage of Scala’s extractor functionality to declare fields with different types like this:*/

var (x, y, z) = (12, 0.78, "janot")

/*Depending on your definition of “one line,” you can also define multiple fields on one line if they are separated by a semicolon:*/

val h = "hello"; val a = 0

var h = "hello"; var a = 0



