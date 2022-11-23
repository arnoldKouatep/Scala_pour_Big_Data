/*
	1. Try importing Java libraries in Scala—e.g., Java’s date libraries—and try using them in your program.
	2. If you are using Linux, try executing the shell script from your Scala program. You will
	have to import a specific package to do so.
	3. Research the maven repository. What is it, what does it contain, and how do Scala and Java programmers use it?
	4. Try creating two classes—Television and PowerSupply—to model a television set with a power supply component. Try to create a Television class where one of its attributes is PowerSupply. Can you do that? On the same note, search for
	“composition in object oriented programming”.
	5. Research the dependencies in the context of libraries. For example, if your program intends to use a specific library that doesn’t come out of the box, what can you do about it? Try using the spray-json library, which is great for parsing JSON files and converting to case classes in Scala. You can’t import it as it is. Try to sort out how you can import it.


	Traduction
	
	1. Essayez d'importer des bibliothèques Java dans Scala - par exemple, les bibliothèques de dates de Java - et essayez de les utiliser dans votre programme.
	2. Si vous utilisez Linux, essayez d'exécuter le script shell à partir de votre programme Scala. Vous devrez
	Vous devrez importer un paquetage spécifique pour le faire.
	3. Faites des recherches sur le référentiel maven. Qu'est-ce que c'est, que contient-il, et comment les programmeurs Scala et Java l'utilisent-ils ?
	4. Essayez de créer deux classes - Television et PowerSupply - pour modéliser un téléviseur avec un composant d'alimentation électrique. Essayez de créer une classe Television dont l'un des attributs est PowerSupply. Y parviendrez-vous ? Dans le même ordre d'idées, recherchez
	"composition dans la programmation orientée objet".
	5. Recherchez les dépendances dans le contexte des bibliothèques. Par exemple, si votre programme a l'intention d'utiliser une bibliothèque spécifique qui n'est pas fournie dans la boîte, que pouvez-vous faire ? Essayez d'utiliser la bibliothèque spray-json, qui est idéale pour analyser les fichiers JSON et les convertir en classes de cas en Scala. Vous ne pouvez pas l'importer telle quelle. Essayez de voir comment vous pouvez l'importer.
*/



	//	Importing Java’s date libraries in scala.

/* Scala has no native date-time libraries but because it’s a JVM based language Java libraries can be used in Scala.*/

import java.time.LocalDate // for date
import java.time.LocalDateTime // for date and time

//the format of your dates
import java.time.format.DateTimeFormatter

val dateTimeString = "2022-11-12 05:22:45"
val formatterDateTime = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")

val dateString = "2022/10/20"
val formatterDate = DateTimeFormatter.ofPattern("yyyy/MM/dd")


//Parse string into a date


val s = "1999-12-31 23:59"
val f = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
val ldt = LocalDateTime.parse(s, f)  // 1999-12-31T23:59
val dateTimeString = "2022-11-12 05:22:45 PM"
val formatterDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a")
val dateTimeStringDate = LocalDateTime.parse(dateTimeString, formatterDateTime)

val s = "2022-11-12 05:22:45 PM"
val f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a")
val ldt = LocalDateTime.parse(s, f)


val s = "1999-12-31 11:59:59 PM"
val f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss a")
val ldt = LocalDateTime.parse(s, f)

val dateTimeStringDate = LocalDateTime.parse(dateTimeString, formatterDateTime)
val dateTimeStringDate = LocalDateTime.parse(dateTimeString, formatterDateTime)

val dateStringDate = LocalDate.parse(dateString, formatterDate)

val dateStringDate2 = LocalDate.parse(dateString2, formatterDate2)

val date="20 October 2015"
val formatter=DateTimeFormatter.ofPattern("dd MMMM yyyy")
LocalDate.parse(date,formatter)
LocalTime.parse("00:00", DateTimeFormatter.ISO_TIME)
LocalTime.parse("23:59", DateTimeFormatter.ISO_LOCAL_TIME)
LocalTime.parse("23 59 59", DateTimeFormatter.ofPattern("HH mm ss"))
LocalTime.parse("11 59 59 PM", DateTimeFormatter.ofPattern("hh mm ss a"))


//Manipulate as you wish

val dateTimeNextHour = dateTimeStringDate.plusHours(8)
val dateTimeGetDayWeek = dateTimeStringDate.getDayOfWeek()
val dateNextMonth = dateStringDate.plusMonths(1)
val date3PrevWeek = dateStringDate.minusWeeks(3)

//Convert back to string or integer (optional)

val dateNextMonthString = dateNextMonth.toString()
val date3PrevWeekMonthInt = date3PrevWeek.getMonthValue()
	/*
		Maven repositories
		
		Maven repositories refer to the directories of packaged JAR files that contain metadata. The
		metadata refers to the POM files relevant to each project. This metadata is what enables Maven to
		download dependencies.
		There are three types of repositories:
		
		• Local repository refers to the developer’s machine, which is where all the project material is
		saved. This repository contains all the dependency jars.
		
		• The remote repository refers to the repository present on a web server, which is used when
		Maven needs to download dependencies. This repository works the same as the central
		repository. Whenever anything is required from the remote repository, it is first downloaded
		to the local repository, and then used.
		
		• Central repository refers to the Maven community that comes into action when there is a
		need for dependencies, and those dependencies cannot be found in the local repository.
		Maven downloads the dependencies from here whenever needed.
	*/

	//	2. Executing the shell script from your Scala program

import scala.sys.process._

"ls -lth"! //	! is used to get the exit status of your command along with the actual output.
"ls -lth"!! //	!! is use to simply get the output.

"mkdir Documents/Test"!! //new repertory
"touch Documents/Test/fileone.txt"!! // new file
"ls -R Documents" #| "grep file" !

import java.io.File

("ls Documents/Test" #> new File("Documents/Test/listTestDir.txt")).! //edit file
("ls Documents/" #> new File("Documents/Test/listTestDir.txt")).!
"ls -lth Documents/Test"!!
"cat Documents/Test/listTestDir.txt"!! //display file

/* This method below will trigger an external script to send out email messages from the Shell.*/
def sendEmail (erroroutput: String) : Unit = {
	val emailscript = ""
	val email : String = ""
	Seq("sh", s"$emailscript",s"$email",s"$erroroutput").!
}
sendEmail("tete")


	//	4. Try creating two classes—Television and PowerSupply—to model
class Television(val brand:String, val screenSize:Int, val screenStatus:Boolean, var imageQuality:String) {
    def turnOn=println("Turning on")
    def turnOff=println("Turning off")
}

class Zero {
	var pseudo = "Anonyme"
	var age = 0
	var citation = "Aucune citation"
	def affichage = "Pseudo: " + pseudo + " Age: " + age + " Citation:" + citation
	def avancerAge = age += 1
}

class PowerSupply (typeEnergy: String, intensity: Int){
	var television = new Television("Samsung", 12, true, "high")
	var msg = "Pas de Message"
	def afficherMessage = println(msg)
}


