
/* 
	Exercises :

	1. Create a variable of type Int, assign a value, and then see what methods are available for that type. Repeat the same process for the String variable.
	2. Explore other options that are available in Scala REPL and research how you can use them (e.g., :sh, :save, :load, etc.).
	3. Research the spark-shell and see if the same commands and features are available there as well.
	4. Try increasing the memory used by the Scala shell.

	Traduction:

	1. Créez une variable de type Int, attribuez-lui une valeur, puis voyez quelles méthodes sont disponibles pour ce type. Répétez le même processus pour la variable String.
	2. Explorez d'autres options disponibles dans Scala REPL et cherchez comment vous pouvez les utiliser (par exemple, :sh, :save, :load, etc.).
	3. Faites des recherches sur spark-shell et voyez si les mêmes commandes et fonctionnalités y sont également disponibles.
	4. Essayez d'augmenter la mémoire utilisée par le shell Scala.
	
	  Commencez un REPL de Scala en tapant juste scala. Vous devriez voir le prompteur :

	  scala>

	  C'est ce qu'on appelle un REPL (Read-Eval-Print-Loop), c'est une interface de programmation interactive.
	  Vous pouvez y exécuter des commandes.
	  Allons-y 
*/


"hello world"

println("Hello world!")//displays the string followed by a line break

"Irfan_Pakistan".split("_") // we use the split function on a string, we’ll get an Array in return.

:help // this command displays the help for the different scala shell commands


:history//history of the command the we type in scala shell

val myVariable = 20//variable of type Int
//myVariable.

val myStringVariable = "Scala"//variable of type String

//myStringVariable.
myStringVariable.length// we use the length function on a string , we’ll get an Int in return.
myStringVariable.indexOf("c")// we use the indexOf function on a string , we’ll get an Int in return.

:quit//To quit the scala shell

/*
	An interactive Apache Spark shell provides a REPL (read-run-print loop) environment for executing Spark commands one after 	another and displaying the results. This process is useful for development and debugging. Spark provides a command interpreter for each of the languages it supports: Scala, Python and R.
*/
