object HelloWord {
	def main(agrs:Array[String]) {
		println("Hello, World!")
	}

}

HelloWord.main(Array(" "))

// scala String interpollation
object StringWord {
	def main(agrs:Array[String]) {
		val name = "mark"
		val age = 18
		println(name + " is " + age + " years old")
		println(s"$name is $age years old")
		println(f"$name%s is $age%d years old")
		println(s"Hello, \nWorld!")
		println(raw"Hello, \nWorld!")
	}

}

StringWord.main(Array(" "))
