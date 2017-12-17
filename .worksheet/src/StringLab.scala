object StringLab {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  println("Welcome to the Scala worksheet");$skip(198); 
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 1
  //+++++++++++++++++++++++++++++++++++++++
  def isPal(a: String): Boolean = {
  var b = a.replace(" ", "")
  b.reverse.mkString == b
  };System.out.println("""isPal: (a: String)Boolean""");$skip(19); val res$0 = 
  isPal("rotator");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(15); val res$1 = 
  isPal("cat");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(25); val res$2 = 
  isPal("  12Rotator21");System.out.println("""res2: Boolean = """ + $show(res$2));$skip(41); val res$3 = 
	isPal("A man, a plan, a canal, Panama");System.out.println("""res3: Boolean = """ + $show(res$3));$skip(18); val res$4 = 
	isPal("raceCAr");System.out.println("""res4: Boolean = """ + $show(res$4));$skip(18); val res$5 = 
	isPal("racecar");System.out.println("""res5: Boolean = """ + $show(res$5));$skip(337); 
  //+++++++++++++++++++++++++++++++++++++++
  
  
  //+++++++++++++++++++++++++++++++++++++++
  // Problem 2
  //+++++++++++++++++++++++++++++++++++++++
   def isPal2(a: String): Boolean = {
  var b = a.replaceAll("""[\p{Punct}]""", "")
  var c = b.replaceAll(" ","")
  
  c.reverse.toLowerCase.mkString == c.toLowerCase.mkString
  
  };System.out.println("""isPal2: (a: String)Boolean""");$skip(23); val res$6 = 
  
  isPal2("Rotator");System.out.println("""res6: Boolean = """ + $show(res$6));$skip(44); val res$7 = 
  isPal2("A man, a plan, a canal, Panama!");System.out.println("""res7: Boolean = """ + $show(res$7));$skip(17); val res$8 = 
  isPal2("okay");System.out.println("""res8: Boolean = """ + $show(res$8));$skip(16); val res$9 = 
  isPal2("yaY");System.out.println("""res9: Boolean = """ + $show(res$9));$skip(365); 
  
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
  
  };System.out.println("""mkPal: (a: String)String""");$skip(18); val res$10 = 
  
  mkPal("map");System.out.println("""res10: String = """ + $show(res$10));$skip(43); val res$11 = 
  mkPal("A man, a plan, a canal, Panama!");System.out.println("""res11: String = """ + $show(res$11));$skip(16); val res$12 = 
  mkPal("okay");System.out.println("""res12: String = """ + $show(res$12));$skip(372); 
  
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
  };System.out.println("""mkWord: (n: Integer)String""");$skip(13); val res$13 = 
  mkWord(20);System.out.println("""res13: String = """ + $show(res$13));$skip(12); val res$14 = 
  mkWord(4);System.out.println("""res14: String = """ + $show(res$14));$skip(11); val res$15 = 
  mkWord();System.out.println("""res15: String = """ + $show(res$15));$skip(11); val res$16 = 
 	mkWord();System.out.println("""res16: String = """ + $show(res$16));$skip(11); val res$17 = 
 	mkWord();System.out.println("""res17: String = """ + $show(res$17));$skip(731); 
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
  };System.out.println("""mkSentence: (n: Integer)String""");$skip(16); val res$18 = 
  mkSentence(7);System.out.println("""res18: String = """ + $show(res$18));$skip(16); val res$19 = 
  mkSentence(1);System.out.println("""res19: String = """ + $show(res$19));$skip(16); val res$20 = 
  mkSentence(5);System.out.println("""res20: String = """ + $show(res$20));$skip(15); val res$21 = 
  mkSentence();System.out.println("""res21: String = """ + $show(res$21));$skip(15); val res$22 = 
  mkSentence();System.out.println("""res22: String = """ + $show(res$22))}
  
  
  //+++++++++++++++++++++++++++++++++++++++
}
