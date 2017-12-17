
object Console{

	def execute(cmmd: String): String = {
	  	val array = cmmd.split("\\s+")
	  	var error = "Too Many Arguments"
	  try {
			var a = 0.0;
			//val array = cmmd.split("\\s+")
			if (array.length >= 4) {
			  throw new IllegalArgumentException
			  error = array(array.length - 1)
			}	
			else if (array(0) == "add") {
			  error = array(1)
					val num1 = array(1).toDouble
					error = array(2)
					val num2 = array(2).toDouble
					a = num1 + num2
			}
			else if (array(0) == "mul") {
			    error = array(1)
				  val num1 = array(1).toDouble
				   error = array(2)
					val num2 = array(2).toDouble
					a = num1 * num2
			}
			else if (array(0) == "sub") {
			  error = array(1)
				val num1 = array(1).toDouble
				error = array(2)
				val num2 = array(2).toDouble
				a = num1 - num2
			}
			else if (array(0) == "div") {
			   error = array(1)
				 val num1 = array(1).toDouble
				 error = array(2)
				 val num2 = array(2).toDouble
			   a = num1 / num2
			}			
			else { 
			 throw new ArrayIndexOutOfBoundsException
			}
			a.toString()
	  }
	  catch {
	    case x: IllegalArgumentException => "Invalid argument: " + error
	    case y: ArrayIndexOutOfBoundsException => "Invalid command: "  + array(0)
	  
	  }
	}
	def repl() {
		var b = true
				var a = ""
				while (b) {
					print("-> ")
					a = scala.io.StdIn.readLine()
					 if (a == "help") {
						println("commands: add, mul, sub, div, quit, help")
			}
					 else if (a == "quit")
						b = false
					else
					  println(execute(a))
				}
		println("bye")
	}
	def main(args: Array[String]) {
		repl()
	}

}