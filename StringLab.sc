object StringLab {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 1
  //+++++++++++++++++++++++++++++++++++++++
  def isPal(a: String): Boolean = {
  var b = a.replace(" ", "")
  b.reverse.mkString == b
  }                                               //> isPal: (a: String)Boolean
  isPal("rotator")                                //> res0: Boolean = true
  isPal("cat")                                    //> res1: Boolean = false
  isPal("  12Rotator21")                          //> res2: Boolean = false
	isPal("A man, a plan, a canal, Panama")   //> res3: Boolean = false
	isPal("raceCAr")                          //> res4: Boolean = false
	isPal("racecar")                          //> res5: Boolean = true
  //+++++++++++++++++++++++++++++++++++++++
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 2
  //+++++++++++++++++++++++++++++++++++++++
   def isPal2(a: String): Boolean = {
  var b = a.replaceAll("""[\p{Punct}]""", "")
  var c = b.replaceAll(" ","")
  
  c.reverse.toLowerCase.mkString == c.toLowerCase.mkString
  
  }                                               //> isPal2: (a: String)Boolean
  
  isPal2("Rotator")                               //> res6: Boolean = true
  isPal2("A man, a plan, a canal, Panama!")       //> res7: Boolean = true
  isPal2("okay")                                  //> res8: Boolean = false
  isPal2("yaY")                                   //> res9: Boolean = true
  
   //+++++++++++++++++++++++++++++++++++++++
   
   
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 3
  //+++++++++++++++++++++++++++++++++++++++
   def mkPal(a: String): String = {
 		var word = ""
 		for (i <- a.size - 1 to 0 by -1) {
 		word =  word  + a(i)
 		}
 		var total = a + word
 		total.replaceAll("""[\p{Punct}]""", "").toLowerCase
  
  }                                               //> mkPal: (a: String)String
  
  mkPal("map")                                    //> res10: String = mappam
  mkPal("A man, a plan, a canal, Panama!")        //> res11: String = a man a plan a canal panamaamanap lanac a nalp a nam a
  mkPal("okay")                                   //> res12: String = okayyako
  
  //+++++++++++++++++++++++++++++++++++++++
   
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 4
  //+++++++++++++++++++++++++++++++++++++++
  
  def mkWord(n: Integer = util.Random.nextInt(10)): String = {
  	
  	val Random = scala.util.Random
  	var x = Random.alphanumeric.take(n).mkString
  	x = x.replaceAll("[0-9]+", "")
  	x = x.toLowerCase()
  	x
  }                                               //> mkWord: (n: Integer)String
  mkWord(20)                                      //> res13: String = gqasmnuywbzcadmdxidk
  mkWord(4)                                       //> res14: String = fpoc
  mkWord()                                        //> res15: String = curvlnkd
 	mkWord()                                  //> res16: String = ""
 	mkWord()                                  //> res17: String = bvrg
   //+++++++++++++++++++++++++++++++++++++++
   
   //+++++++++++++++++++++++++++++++++++++++
  // Problem 5
  //+++++++++++++++++++++++++++++++++++++++
  def mkSentence(n: Integer = util.Random.nextInt(10)): String = {
  var total = ""
  	val Random = scala.util.Random
  	var x = Random.alphanumeric.take(10).mkString.replaceAll("[0-9]+", "").toLowerCase
 
  	
  	total = total + x
  for (i <-1 until n) {
  
  	var y = Random.alphanumeric.take(10).mkString.toLowerCase
  	y = y.replaceAll("[0-9]+", "")
  	total = total + " "+  y
  }
  var z = Random.alphanumeric.take(1).mkString.toLowerCase + "."
  	z = z.replaceAll("[0-9]+", "")
  	total = total + z
  total.substring(0,1).toUpperCase + total.substring(1, total.length)
  }                                               //> mkSentence: (n: Integer)String
  mkSentence(7)                                   //> res18: String = Ppducrvsz wrhansbi xuaxbipax nmjpckdbj tokkgzv uwnthbd tzig
                                                  //| gkrzk.
  mkSentence(1)                                   //> res19: String = Uowfzhgccz.
  mkSentence(5)                                   //> res20: String = Ouwqvtnyei uhgvevga clbqimu piggznfr wiallhqent.
  mkSentence()                                    //> res21: String = Dchrcz.
  mkSentence()                                    //> res22: String = Hqrficur adgcasoyfn.
  
  
  //+++++++++++++++++++++++++++++++++++++++
}